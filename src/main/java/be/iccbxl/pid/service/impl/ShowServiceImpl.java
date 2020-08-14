package be.iccbxl.pid.service.impl;

import be.iccbxl.pid.model.ArtistType;
import be.iccbxl.pid.model.ArtistTypeShow;
import be.iccbxl.pid.model.Show;
import be.iccbxl.pid.repository.ArtistTypeRepository;
import be.iccbxl.pid.repository.ArtistTypeShowRepository;
import be.iccbxl.pid.repository.ShowRepository;
import be.iccbxl.pid.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {
    @Autowired
    private ShowRepository showRepository;
    @Autowired
    private ArtistTypeShowRepository artistTypeShowRepository;
    @Autowired
    private ArtistTypeRepository artistTypeRepository;


    @Override
    public List<Show> getAllShows() {
        return showRepository.findAll();
    }

    @Override
    public List<ArtistType> getAllArtistTypes() {
        List<ArtistType> artists = new ArrayList<>();

        artistTypeRepository.findAll().forEach(artists::add);

        return artists;
    }

    @Override
    public Show saveShow(Show show) {
        return showRepository.save(show);
    }
    @Override
    public Show findShowById(Long id) {
        return showRepository.findById(id).orElse(null);
    }


    @Override
    public void addArtistToShow(Show show, ArtistTypeShow artistTypeShow) {
        List<ArtistTypeShow> byShow = artistTypeShowRepository.findByShow(show);
        boolean alreadyExist = byShow != null && byShow.stream().anyMatch(at -> at.getArtistType().getId().equals(artistTypeShow.getArtistType().getId()));
        if (!alreadyExist) {
            artistTypeShow.setShow(show);
            artistTypeShowRepository.save(artistTypeShow);
        }
    }
}
