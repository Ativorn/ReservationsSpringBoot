package be.iccbxl.pid.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="localities")
public class Locality {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(length = 6)
    private String postal_code;
    @Column(length = 60)
    private String locality;

    @OneToMany(mappedBy = "locality")
    private List<Location> locations;

    public Locality(String postal_code, String locality) {
        this.postal_code = postal_code;
        this.locality = locality;
    }


    @Override
    public String toString() {
        return postal_code +" "+ locality;
    }
}
