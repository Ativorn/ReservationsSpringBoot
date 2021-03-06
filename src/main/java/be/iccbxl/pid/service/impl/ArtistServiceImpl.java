package be.iccbxl.pid.service.impl;

import be.iccbxl.pid.model.Artist;
import be.iccbxl.pid.model.ArtistType;
import be.iccbxl.pid.model.Type;
import be.iccbxl.pid.repository.ArtistRepository;
import be.iccbxl.pid.repository.ArtistTypeRepository;
import be.iccbxl.pid.repository.TypeRepository;
import be.iccbxl.pid.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {
    @Autowired
    private ArtistRepository artistRepository;


    @Autowired
    private ArtistTypeRepository artistTypeRepository;
    @Autowired
    private TypeRepository typeRepository;



    @Override
    public List<Artist> getAllArtists() {
        List<Artist> artists = new ArrayList<>();

        artistRepository.findAll().forEach(artists::add);

        return artists;
    }

    @Override
    public List<Type> getAllTypes() {
        return typeRepository.findAll();
    }

    @Override
    public Artist getArtist(String id) {
        int indice = Integer.parseInt(id);

        return artistRepository.findById(indice);
    }

    @Override
    public void addTypeToArtist(Artist artist, ArtistType artistType) {
        List<ArtistType> byArtist = artistTypeRepository.findByArtist(artist);
        boolean alreadyExist = byArtist != null && byArtist.stream().anyMatch(at -> at.getType().getId().equals(artistType.getType().getId()));
        if (!alreadyExist) {
            artistType.setArtist(artist);
            artistTypeRepository.save(artistType);
        }
    }

    public void addArtist(Artist artist) {
        artistRepository.save(artist);
    }

    @Override
    public void updateArtist( Artist artist) {
        artistRepository.save(artist);
    }

    public void deleteArtist(String id) {
        Long indice = (long) Integer.parseInt(id);
        artistRepository.deleteById(indice);
    }

}
