package be.iccbxl.pid.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="representations")
public class Representation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    @Column(name = "when", columnDefinition = "TIMESTAMP")
    private LocalDateTime when;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
}