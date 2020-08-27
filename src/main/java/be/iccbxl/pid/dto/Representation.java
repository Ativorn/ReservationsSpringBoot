package be.iccbxl.pid.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Representation {

    private Long id;

    private String show;

    private LocalDateTime whenTime;

    private String location;

    public Representation(be.iccbxl.pid.model.Representation representation) {
        this.id = representation.getId();
        this.show = representation.getShow().toString();
        this.whenTime = representation.getWhenTime();
        this.location = representation.getLocation().toString();
    }
}
