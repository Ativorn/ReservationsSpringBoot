package be.iccbxl.pid.service;

import be.iccbxl.pid.model.Representation;

import java.util.List;

public interface RepresentationService {


    List<Representation> getAllRepresentations();

    Representation save(Representation representation);

}
