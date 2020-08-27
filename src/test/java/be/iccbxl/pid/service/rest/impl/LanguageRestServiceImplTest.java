package be.iccbxl.pid.service.rest.impl;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

class LanguageRestServiceImplTest {

    LanguageRestServiceImpl service = new LanguageRestServiceImpl();

    @Test
    void getLanguages() {
        Stream.of(service.getLanguages())
                .forEach(System.out::println);

    }
}