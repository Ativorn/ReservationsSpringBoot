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
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(length = 60)
    private String slug;
    private String title;
    @Column(length = 60)
    private String description;
    private String poster_url;


    @ManyToOne
    @JoinColumn(name = "locality_id")
    private Locality locality;

    @OneToMany(mappedBy = "location")
    private List<Show> shows;

    @OneToMany(mappedBy = "location")
    private List<Representation> representations;
}

