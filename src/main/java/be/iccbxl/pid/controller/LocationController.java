package be.iccbxl.pid.controller;

import be.iccbxl.pid.model.Locality;
import be.iccbxl.pid.model.Location;
import be.iccbxl.pid.service.LocalityService;
import be.iccbxl.pid.service.LocationService;
import be.iccbxl.pid.utils.Container;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    @PostMapping("/locations/add")
    public String addNewAgent(@ModelAttribute Location location) {
        if (location.getId() == null) {
            System.out.println("insertion d'un nouvelle location dans la db");
        } else {
            System.out.println("modification d'une location");
        }
        locationService.saveLocation(location);
        return "redirect:/locations";
    }

    @GetMapping("/locations/update/{id}")
    public String updateLocation(@PathVariable(value = "id") Long locationId, Model model) {
        model.addAttribute("location", locationService.findLocationById(locationId));
        return "location/updateLocation";
    }

    @GetMapping("/locations/addlocation/{id}")
    public String addLocalityToLocation(@PathVariable(value = "id") Long locationId, Model model) {
        model.addAttribute("location", locationService.findLocationById(locationId));
        List<Locality> allLocalities = localityService.getAllLocalities();
        Container container = new Container();
        model.addAttribute("container", container);

        return "location/addLocality";
    }

    @PostMapping("/locations/addlocality")
    public String addLocalityToLocation(@ModelAttribute Container container, @ModelAttribute Location location) {
        Locality locality = container.getLocality();
        if (locality.getLocations() == null) {
            locality.setLocations(location);
            localityService.addLocality(locality);
            return "redirect:/locations";
        } else {
            return "agent/addLocality";
        }
    }
}
