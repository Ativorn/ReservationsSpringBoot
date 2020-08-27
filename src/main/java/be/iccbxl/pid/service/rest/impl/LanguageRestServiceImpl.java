package be.iccbxl.pid.service.rest.impl;

import be.iccbxl.pid.service.rest.LanguageRestService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class LanguageRestServiceImpl implements LanguageRestService {
    @Override
    public Set<String> getLanguages() {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity("parameters", headers);
        String url = "https://restcountries.eu/rest/v2/all?fields=languages";
        ResponseEntity<List<Object>> exchange = restTemplate.exchange(url, HttpMethod.GET, entity, new ParameterizedTypeReference<List<Object>>() {
        });

        List<Object> response = exchange.getBody();
        return response.stream()
                .map(LinkedHashMap.class::cast)
                .map(t -> (ArrayList<Object>) t.get("languages"))
                .flatMap(t -> t.stream())
                .map(LinkedHashMap.class::cast)
                .map(t -> (String) t.get("iso639_1"))
                .collect(Collectors.toSet());
    }
}
