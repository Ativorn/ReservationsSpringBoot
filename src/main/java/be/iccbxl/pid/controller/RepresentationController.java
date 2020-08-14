package be.iccbxl.pid.controller;


import be.iccbxl.pid.model.Representation;
import be.iccbxl.pid.service.LocationService;
import be.iccbxl.pid.service.RepresentationService;
import be.iccbxl.pid.service.ShowService;
import be.iccbxl.pid.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class RepresentationController {

    private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    @Autowired
    private StorageService representationStorageService;

    @Autowired
    private RepresentationService representationService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private ShowService showService;

    @GetMapping("/representations")
    public String getAllRepresentations(Model model) {

        model.addAttribute("representations", representationService.getAllRepresentations());
        return "representation/representations";
    }

    @GetMapping("/representations/add")
    public String addNewShow(Model model) {
        model.addAttribute("representation", new Representation());
        model.addAttribute("locations", locationService.getAllLocations());
        model.addAttribute("shows", showService.getAllShows());
        return "representation/updateRepresentation";
    }

    @PostMapping("/representations/add")
    public String addNewShow(@ModelAttribute Representation representation, @RequestParam("file") MultipartFile file) {
        if (representation.getId() == null) {
            System.out.println("insertion d'un nouveau show dans la db");
        } else {
            System.out.println("modification d'un show");
        }

        representation.setWhenTime(LocalDateTime.parse(representation.getDate() + " " + representation.getTime(), FORMATTER));
        representation = representationService.save(representation);
        if (file != null && !file.isEmpty()) {
            String newImageName = representation.getId() + ".jpeg";
            representationStorageService.store(file, newImageName);
        }
        return "redirect:/representations";
    }
}
