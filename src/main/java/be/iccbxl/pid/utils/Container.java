package be.iccbxl.pid.utils;

import be.iccbxl.pid.model.Artist;
import be.iccbxl.pid.model.Locality;

public class Container {
    private Locality locality;

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    private Artist artist;

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
