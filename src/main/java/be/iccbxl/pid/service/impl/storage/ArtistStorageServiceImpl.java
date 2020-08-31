package be.iccbxl.pid.service.impl.storage;

import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service("artistStorageService")
public class ArtistStorageServiceImpl extends StorageServiceImpl {

    final Path rootLocation = Paths.get("imgs/artist");

    @Override
    public Path getRootLocation() {
        return rootLocation;
    }
    @Override
    public String fileNameWithPath(String filename) {
        return "artist_" + filename;
    }
}
