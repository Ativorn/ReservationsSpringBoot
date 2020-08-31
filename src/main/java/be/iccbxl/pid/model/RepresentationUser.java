package be.iccbxl.pid.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="representation_user")
public class RepresentationUser {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "representation_id")
    private Representation representation ;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User  user ;

    private int places;
}
