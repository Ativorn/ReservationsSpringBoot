package be.iccbxl.pid.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="artists")
public class Artist {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(length = 60)
	private String firstname;
	@Column(length = 60)
	private String lastname;

	@OneToMany(mappedBy = "artist")
	private List<ArtistType> types ;

	public Artist(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return firstname +" "+ lastname;
	}


	public String getTypesAsString(){
		if (types == null || types.isEmpty()){
			return  "";
		}else{
			return types.stream()
					.map(type -> type.getType())
					.filter(type -> !Objects.isNull(type))
					.map(type -> type.getType())
					.collect(Collectors.joining(" , ","[","]"));
		}
	}

	public String getFullName() {
		return getFirstname() + " " + getLastname();
	}
}
	
	
	
	
	
