package be.iccbxl.pid.convertor;

import be.iccbxl.pid.model.Show;
import be.iccbxl.pid.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToShow implements Converter<String, Show> {

    @Autowired
    private ShowRepository showRepository;

    @Override
    public Show convert(String s) {
        Long id = Long.valueOf(s);
        return showRepository.findById(id).orElse(null);
    }
}