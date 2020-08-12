package be.iccbxl.pid.service;

import be.iccbxl.pid.model.Locality;
import be.iccbxl.pid.model.Location;

import java.util.List;

public interface LocalityService {
    List<Locality> getAllLocalities();

    void addLocality(Locality locality);

    void updateLocality(Locality locality);


    Locality getLocality(String id);

    void addLocalityToLocation(Location location, Locality locality);
}
