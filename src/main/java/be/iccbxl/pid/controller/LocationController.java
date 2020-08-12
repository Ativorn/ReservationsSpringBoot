package be.iccbxl.pid.controller;

import be.iccbxl.pid.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public String getAllLocations(Model model) {

        model.addAttribute("Locations", locationService.getAllLocations());
        return "location/locations";
    }
}
