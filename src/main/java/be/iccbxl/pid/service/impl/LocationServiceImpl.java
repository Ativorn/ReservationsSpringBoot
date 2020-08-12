package be.iccbxl.pid.service.impl;

import be.iccbxl.pid.model.Location;
import be.iccbxl.pid.repository.LocationRepository;
import be.iccbxl.pid.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }


}
