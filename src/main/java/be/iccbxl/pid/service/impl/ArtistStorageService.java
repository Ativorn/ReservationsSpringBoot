package be.iccbxl.pid.service.impl;

import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service("artistStorageService")
public class ArtistStorageService extends AbstractStorageService {

    final Path rootLocation = Paths.get("imgs/artist");

    @Override
    public Path getRootLocation() {
        return rootLocation;
    }
}
