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
@Table(name = "shows")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 60)
    private String slug;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;
    private String poster_url;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    private boolean bookable;

    private float price;



    @OneToMany(mappedBy = "show")
    private List<ArtistTypeShow> artistTypeShows;

    @OneToMany(mappedBy = "show")
    private List<Representation> representations;


}