package be.iccbxl.pid.convertor;

import be.iccbxl.pid.model.Type;
import be.iccbxl.pid.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToTypeConvertor implements Converter<String, Type> {

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public Type convert(String s) {
        Long id = Long.valueOf(s);
        return typeRepository.findById(id).get();
    }
}