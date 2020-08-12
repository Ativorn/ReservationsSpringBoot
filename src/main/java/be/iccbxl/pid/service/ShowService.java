package be.iccbxl.pid.service;

import be.iccbxl.pid.model.Show;

import java.util.List;

public interface ShowService {
    List<Show> getAllShows();

    Show saveShow(Show show);

    Show findShowById(Long id);
}
