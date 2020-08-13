package be.iccbxl.pid.convertor;

import be.iccbxl.pid.model.Artist;
import be.iccbxl.pid.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToArtistConvertor implements Converter<String, Artist> {

    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public Artist convert(String s) {
        Long id = Long.valueOf(s);
        return artistRepository.findById(id).get();
    }
}
