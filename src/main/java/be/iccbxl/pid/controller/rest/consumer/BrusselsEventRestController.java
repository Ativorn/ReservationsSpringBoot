package be.iccbxl.pid.controller.rest.consumer;


import be.iccbxl.pid.service.rest.BrusselsEventRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/theatre")
public class BrusselsEventRestController {

    @Autowired
    private BrusselsEventRestService theatredelavilleRestService;

    @GetMapping("/events")
    public String getAllEvents() {
        theatredelavilleRestService.consume();
        return "layouts/main";
    }
}
