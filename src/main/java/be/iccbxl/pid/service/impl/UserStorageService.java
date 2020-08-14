package be.iccbxl.pid.service.impl;

import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service("userStorageService")
public class UserStorageService extends AbstractStorageService {

    final Path rootLocation = Paths.get("imgs/user");

    @Override
    public Path getRootLocation() {
        return rootLocation;
    }
}
