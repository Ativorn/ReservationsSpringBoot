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
    @Column(length = 60, unique = true)
    private String slug;
    @Column(length = 60)
    private String designation;
    private String address;

    @ManyToOne
    @JoinColumn(name = "locality_id")
    private Locality locality;

    private String website;
    @Column(length = 30)
    private String phone;

    @OneToMany(mappedBy = "location")
    private List<Show> shows;

    @OneToMany(mappedBy = "location")
    private List<Representation> representations;

    public String asString() {
        if (designation == null)
            return "";
        else
            return designation;
    }
}

