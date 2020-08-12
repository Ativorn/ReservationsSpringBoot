package be.iccbxl.pid.service;

import be.iccbxl.pid.model.Location;

import java.util.List;

public interface LocationService {
    List<Location> getAllLocations();

    Location findLocationById(Long id);

    Location saveLocation(Location location);
}
