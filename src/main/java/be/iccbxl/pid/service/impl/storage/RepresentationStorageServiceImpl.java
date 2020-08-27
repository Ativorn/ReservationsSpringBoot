package be.iccbxl.pid.service.impl.storage;

import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service("representationStorageService")
public class RepresentationStorageServiceImpl extends StorageServiceImpl {

    final Path rootLocation = Paths.get("imgs/representation");

    @Override
    public Path getRootLocation() {
        return rootLocation;
    }

    @Override
    public String fileNameWithPath(String filename) {
        return "representation_" + filename;
    }
}