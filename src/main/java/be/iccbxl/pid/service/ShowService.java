package be.iccbxl.pid.service;

import be.iccbxl.pid.model.Artist;
import be.iccbxl.pid.model.ArtistTypeShow;
import be.iccbxl.pid.model.Show;

import java.util.List;

public interface ShowService {
    List<Show> getAllShows();

    List<Artist> getAllArtists();


    Show saveShow(Show show);

    Show findShowById(Long id);

    void addArtistToShow(Show show, ArtistTypeShow artistTypeShow);
}
