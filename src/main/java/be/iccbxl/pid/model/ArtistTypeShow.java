package be.iccbxl.pid.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "artiste_type_show")
public class ArtistTypeShow {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "artist_type_id")
    private ArtistType artistType ;


    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show  show ;
}