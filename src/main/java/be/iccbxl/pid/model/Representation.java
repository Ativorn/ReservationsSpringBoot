package be.iccbxl.pid.model;

import be.iccbxl.pid.convertor.LocalDateTimeConverter;
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

    // URL to solution https://dzone.com/articles/dealing-with-javas-localdatetime-in-jpa
    @Column(name = "when_time")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime whenTime;

    @Transient
    private String date;

    @Transient
    private String time;

    @Transient
    private String fullUrlImg;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
}