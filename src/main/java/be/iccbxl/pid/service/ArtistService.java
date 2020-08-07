package be.iccbxl.pid.service;

import be.iccbxl.pid.model.Artist;
import be.iccbxl.pid.model.ArtistType;
import be.iccbxl.pid.model.Type;

import java.util.List;

public interface ArtistService {
    List<Artist> getAllArtists();

    List<Type> getAllTypes();

    void addArtist(Artist artist);
    void updateArtist( Artist artist);

    Artist getArtist(String id);

    void addTypeToArtist(Artist artist, ArtistType artistType);

}
