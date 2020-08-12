package be.iccbxl.pid.service.impl;

import be.iccbxl.pid.model.Locality;
import be.iccbxl.pid.model.Location;
import be.iccbxl.pid.repository.LocalityRepository;
import be.iccbxl.pid.repository.LocationRepository;
import be.iccbxl.pid.service.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocalityServiceImpl implements LocalityService {
    @Autowired
    private LocalityRepository localityRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Locality> getAllLocalities() {
        List<Locality> localities = new ArrayList<>();
        localityRepository.findAll().forEach(localities::add);
        return localities;
    }

    @Override
    public void addLocality(Locality locality) {
        localityRepository.save(locality);

    }

    @Override
    public void updateLocality(Locality locality) {
        localityRepository.save(locality);

    }

    @Override
    public Locality getLocality(String id) {
        Long indice = Long.valueOf(id);
        return localityRepository.findById(indice).orElse(null);
    }

    @Override
    public void addLocalityToLocation(Location location, Locality locality) {
        locality = localityRepository.save(locality);
        location.setLocality(locality);
        locationRepository.save(location);
        }
    }

