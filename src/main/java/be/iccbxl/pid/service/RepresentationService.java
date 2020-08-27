package be.iccbxl.pid.service;

import be.iccbxl.pid.model.Representation;
import be.iccbxl.pid.model.RepresentationUser;
import be.iccbxl.pid.model.User;

import java.util.List;

public interface RepresentationService {


    List<Representation> getAllRepresentations();
    Representation save(Representation representation);

    Representation findRepresentationById(Long representationId);

    RepresentationUser save(RepresentationUser representationUSer);


    List<RepresentationUser> findRepresentationUserByUser(User user);
}
