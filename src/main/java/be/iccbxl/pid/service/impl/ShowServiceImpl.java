package be.iccbxl.pid.service.impl;

import be.iccbxl.pid.model.Show;
import be.iccbxl.pid.repository.ShowRepository;
import be.iccbxl.pid.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {
    @Autowired
    private ShowRepository showRepository;

    @Override
    public List<Show> getAllShows() {
        return showRepository.findAll();
    }

    @Override
    public Show saveShow(Show show) {
        return showRepository.save(show);

        @Override
        public Show findShowById (Long id){
            return showRepository.findById(id).orElse(null);
        }
    }
