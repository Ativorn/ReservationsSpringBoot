package be.iccbxl.pid.service.impl;

import be.iccbxl.pid.model.Representation;
import be.iccbxl.pid.repository.RepresentationRepository;
import be.iccbxl.pid.service.RepresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepresentationServiceImpl implements RepresentationService {

    @Autowired
    private RepresentationRepository representationRepository;
    @Override
    public List<Representation> getAllRepresentations() {
        return representationRepository.findAll();
    }

    @Override
    public Representation save(Representation representation) {
        return representationRepository.save(representation);
    }
}
