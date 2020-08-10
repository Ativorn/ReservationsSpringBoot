package be.iccbxl.pid.service.rest.impl;

import be.iccbxl.pid.service.rest.BrusselsEventRestService;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@Service
public class BrusselsEventRestServiceImpl implements BrusselsEventRestService {


    @Override
    public void consume() {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer 87adbcde-10ed-3587-8bdb-2cfb978f8899");

        HttpEntity<String> entity = new HttpEntity("parameters", headers);
        String url = "https://api.brussels:443/api/agenda/0.0.1/events/categories";
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        String response = responseEntity.getBody();
        System.out.println(response);
    }
}
