package be.iccbxl.pid.convertor;

import be.iccbxl.pid.model.Locality;
import be.iccbxl.pid.repository.LocalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToLocalityConvertor implements Converter<String, Locality> {
    @Autowired
    private LocalityRepository localityRepository;

    public Locality convert(String s) {
        Long id = Long.valueOf(s);
        return localityRepository.findById(id).orElse(null);
    }
}
