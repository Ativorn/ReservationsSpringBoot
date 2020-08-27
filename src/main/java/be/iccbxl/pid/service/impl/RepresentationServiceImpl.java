package be.iccbxl.pid.service.impl;

import be.iccbxl.pid.model.Representation;
import be.iccbxl.pid.model.RepresentationUser;
import be.iccbxl.pid.model.User;
import be.iccbxl.pid.repository.RepresentationRepository;
import be.iccbxl.pid.repository.RepresentationUserRepository;
import be.iccbxl.pid.security.MyUserDetailsService;
import be.iccbxl.pid.service.RepresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepresentationServiceImpl implements RepresentationService {

    @Autowired
    private RepresentationRepository representationRepository;
    @Autowired
    private RepresentationUserRepository representationUserRepository;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Override
    public List<Representation> getAllRepresentations() {
        return representationRepository.findAll();
    }

    @Override
    public Representation save(Representation representation) {
        return representationRepository.save(representation);
    }

    @Override
    public Representation findRepresentationById(Long representationId) {
        return representationRepository.findById(representationId).orElse(null);
    }

    @Override
    public RepresentationUser save(RepresentationUser representationUSer) {
        representationUSer.setUser(userDetailsService.getConnectedUser());
        return representationUserRepository.save(representationUSer);
    }

    @Override
    public List<RepresentationUser> findRepresentationUserByUser(User user) {
        return representationUserRepository.findByUser(user);
    }
}
