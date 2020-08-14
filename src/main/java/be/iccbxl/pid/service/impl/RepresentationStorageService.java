package be.iccbxl.pid.service.impl;

import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service("representationStorageService")
public class RepresentationStorageService extends AbstractStorageService {

    final Path rootLocation = Paths.get("imgs/representation");

    @Override
    public Path getRootLocation() {
        return rootLocation;
    }
}