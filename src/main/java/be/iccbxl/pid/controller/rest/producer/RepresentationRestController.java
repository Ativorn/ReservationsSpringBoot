package be.iccbxl.pid.controller.rest.producer;


import be.iccbxl.pid.dto.Representation;
import be.iccbxl.pid.service.RepresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api")
public class RepresentationRestController {

    @Autowired
    private RepresentationService service;

    @GetMapping("/representations")
    public List<Representation> getAllRepresentations() {
        return service.getAllRepresentations()
                .stream()
                .map(rep -> new be.iccbxl.pid.dto.Representation(rep))
                .collect(Collectors.toList());
    }
}
