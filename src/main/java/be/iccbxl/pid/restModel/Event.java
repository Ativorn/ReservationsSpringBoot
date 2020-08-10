package be.iccbxl.pid.restModel;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Event {
    private LocalDateTime date_next;


    private String facebook_link;


    private boolean accept_article27;


    private String publication_state;

    private String sub_type;

    private boolean is_closed_on_school_holidays;


    private boolean is_by_appointment;

    private String import_origin;

    private int id;

    private boolean is_online;

    private boolean accept_cultuurbon;
    private String published_at;
    private LocalDateTime date_end;

    private boolean is_permanent;

    private boolean is_closed_on_public_holidays;

    private LocalDateTime date_start;

    private boolean show_in_agenda;


    private String last_updated_at;

    private boolean is_free;

    private double ranking;

    private int backoffice_id;

    private boolean accept_paspartoe;
}
