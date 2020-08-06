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
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(length = 30, unique = true)
    private String role;

    public Role(String role) {
        this.role = role;
    }

    @OneToMany(mappedBy = "role")
    private List<RoleUser> roleUser;

    @Override
    public String toString() { return role;}
}