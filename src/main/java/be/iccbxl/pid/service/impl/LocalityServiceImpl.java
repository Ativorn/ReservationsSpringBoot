package be.iccbxl.pid.service.impl;

import be.iccbxl.pid.model.Locality;
import be.iccbxl.pid.model.Location;
import be.iccbxl.pid.repository.LocalityRepository;
import be.iccbxl.pid.service.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocalityServiceImpl implements LocalityService {
    @Autowired
    private LocalityRepository localityRepository;

    @Override
    public List<Locality> getAllLocalities() {
        List<Locality> localities = new ArrayList<>();
        localityRepository.findAll().forEach(localities::add);
        return localities;
    }

    @Override
    public Locality getLocality(String id) {
        int indice = Integer.parseInt(id);

        return localityRepository.findById(indice);
    }

    @Override
    public void addLocalityToLocation(Locality locality, Location location) {
        List<ArtistType> byArtist = artistTypeRepository.findByArtist(artist);
        boolean alreadyExist = byArtist != null && byArtist.stream().anyMatch(at -> at.getType().getId().equals(artistType.getType().getId()));
        if (!alreadyExist) {
            artistType.setArtist(artist);
            artistTypeRepository.save(artistType);
        }
    }
}
