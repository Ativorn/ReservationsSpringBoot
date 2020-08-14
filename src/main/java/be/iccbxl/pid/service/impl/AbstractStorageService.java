package be.iccbxl.pid.service.impl;

import be.iccbxl.pid.service.StorageService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public abstract class AbstractStorageService implements StorageService {


    @Override
    public void store(MultipartFile file, String newImageName) {

        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            if (file.isEmpty()) {
                throw new IllegalArgumentException("Failed to store empty file " + filename);
            }
            if (filename.contains("..")) {
                // This is a security check
                throw new IllegalArgumentException(
                        "Cannot store file with relative path outside current directory "
                                + filename);
            }
            try (InputStream inputStream = file.getInputStream()) {
                Files.copy(inputStream, getRootLocation().resolve(newImageName),
                        StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to store file " + filename, e);
        }
    }


    @Override
    public Path load(String filename) {
        return getRootLocation().resolve(filename);
    }

    @Override
    public Resource loadAsResource(String filename) {
        try {
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                return new UrlResource(load("unknown.jpeg").toUri());

            }
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Could not read file: " + filename, e);
        }
    }


    @Override
    public void init() {
        try {
            Files.createDirectories(getRootLocation());// create the root location if it is not exist
        } catch (IOException e) {
            throw new IllegalArgumentException("Could not initialize storage for :" + getRootLocation(), e);
        }
    }

    public abstract Path getRootLocation();
}
