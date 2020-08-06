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
@Table(name="artiste_type")
public class ArtistType {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist ;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type  type ;


    @OneToMany(mappedBy = "artistType")
    private List<ArtistTypeShow> artistTypeShows;

}
