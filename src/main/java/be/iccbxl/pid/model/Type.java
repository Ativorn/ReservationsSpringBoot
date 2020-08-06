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
@Table(name="types")
public class Type {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(length = 60)
    private String type;

    @OneToMany(mappedBy = "type")
    private List<ArtistType> artistTypes;
}
