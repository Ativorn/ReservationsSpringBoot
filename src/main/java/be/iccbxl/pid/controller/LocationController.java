package be.iccbxl.pid.controller;

import be.iccbxl.pid.model.Location;
import be.iccbxl.pid.service.LocalityService;
import be.iccbxl.pid.service.LocationService;
import be.iccbxl.pid.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LocationController {
    @Autowired
    private LocationService locationService;
    @Autowired
    private LocalityService localityService;

    @GetMapping("/locations")
    public String getAllLocations(Model model) {

        model.addAttribute("Locations", locationService.getAllLocations());
        return "location/locations";
    }

    @PostMapping("/locations/update")
    public String updateLocation(@ModelAttribute Location location) {
        if (location.getId() == null) {
            System.out.println("insertion d'un nouvelle location dans la db");
        } else {
            System.out.println("modification d'une location");
        }
        location.setSlug(Utilities.toSlug(location.getDesignation()));
        locationService.saveLocation(location);
        return "redirect:/locations";
    }


    @GetMapping("/locations/update/{id}")
    public String updateLocation(@PathVariable(value = "id") Long locationId, Model model) {
        model.addAttribute("location", locationService.findLocationById(locationId));
        model.addAttribute("localities", localityService.getAllLocalities());
        return "location/updateLocation";
    }


    @GetMapping("/locations/add")
    public String addLocalityToLocation(Model model) {
        model.addAttribute("location", new Location());
        model.addAttribute("localities", localityService.getAllLocalities());
        return "location/updateLocation";
    }

}
