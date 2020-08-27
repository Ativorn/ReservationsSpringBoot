package be.iccbxl.pid.service.impl.storage;

import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service("userStorageService")
public class UserStorageServiceImpl extends StorageServiceImpl {

    final Path rootLocation = Paths.get("imgs/user");

    @Override
    public Path getRootLocation() {
        return rootLocation;
    }

    @Override
    public String fileNameWithPath(String filename) {
        return "user_" + filename;
    }
}
