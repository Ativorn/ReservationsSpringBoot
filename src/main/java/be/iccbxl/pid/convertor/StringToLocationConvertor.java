package be.iccbxl.pid.convertor;

import be.iccbxl.pid.model.Location;
import be.iccbxl.pid.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToLocationConvertor implements Converter<String, Location> {
    @Autowired
    private LocationRepository locationRepository;

    public Location convert(String s) {
        Long id = Long.valueOf(s);
        return locationRepository.findById(id).orElse(null);
    }
}
