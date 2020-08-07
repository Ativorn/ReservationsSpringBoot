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
@Table(name="users")
public class User  {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(length = 30, unique = true, nullable = false)
    private String login;
    @Column(length = 255, nullable = false)
    private String password;
    @Column(length = 60, nullable = false)
    private String firstname;
    @Column(length = 60, nullable = false)
    private String lastname;
    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 2)
    private String langue;

    @OneToMany(mappedBy = "artist")
    private List<ArtistType> types ;



    public User(String login, String password, String firstname, String lastname, String email, String langue) {
        this.login = login;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.langue = langue;
    }


    @Override
    public String toString() {
        return login +" "+ lastname;
    }

}
