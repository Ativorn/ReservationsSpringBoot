package be.iccbxl.pid.controller;


import be.iccbxl.pid.model.Representation;
import be.iccbxl.pid.model.RepresentationUser;
import be.iccbxl.pid.model.User;
import be.iccbxl.pid.security.MyUserDetailsService;
import be.iccbxl.pid.service.LocationService;
import be.iccbxl.pid.service.RepresentationService;
import be.iccbxl.pid.service.ShowService;
import be.iccbxl.pid.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import static be.iccbxl.pid.controller.ImagesController.fileToPath;

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

    @Autowired
    private MyUserDetailsService userDetailsService;

    @GetMapping("/representations")
    public String getAllRepresentations(Model model) {

        List<Representation> allRepresentations = representationService.getAllRepresentations();

        allRepresentations.forEach(representation -> {
            String filename = representationStorageService.fileNameWithPath(representation.getId() + ".jpeg");
            representation.setFullUrlImg(fileToPath(filename));
        });

        model.addAttribute("activeItem", allRepresentations.isEmpty() ? null : allRepresentations.get(0));
        model.addAttribute("carousel", allRepresentations.stream()
                .skip(1).collect(Collectors.toList()));
        model.addAttribute("representations", allRepresentations);
        return "representation/representations";
    }


    @GetMapping("/reservations")
    public String getMyReservations(Model model) {
        User connectedUser = userDetailsService.getConnectedUser();
        List<RepresentationUser> allRepresentationsUser = representationService.findRepresentationUserByUser(connectedUser);

        allRepresentationsUser
                .stream()
                .map(representationUser -> representationUser.getRepresentation())
                .forEach(representation -> {
                    String filename = representationStorageService.fileNameWithPath(representation.getId() + ".jpeg");
                    representation.setFullUrlImg(fileToPath(filename));
                });

        model.addAttribute("representationsUser", allRepresentationsUser);
        return "representation/representationUsers";
    }

    @GetMapping("/representations/add")
    public String addNewShow(Model model) {
        model.addAttribute("representation", new Representation());
        model.addAttribute("locations", locationService.getAllLocations());
        model.addAttribute("shows", showService.getAllShows());
        return "representation/updateRepresentation";
    }

    @PostMapping("/representations/add")
    public String addNewShow(@ModelAttribute Representation representation, @RequestParam MultipartFile file) {
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


    @GetMapping("/spectacles/book/{id}")
    public String bookRepresentation(@PathVariable(value = "id") Long representationId, Model model) {
        Representation representation = representationService.findRepresentationById(representationId);
        RepresentationUser representationUser = new RepresentationUser();
        representationUser.setRepresentation(representation);
        model.addAttribute("representationUSer", representationUser);
        return "representation/bookRepresentation";
    }

    @PostMapping("/spectacles/book")
    public String bookRepresentation(@ModelAttribute RepresentationUser representationUSer) {
        representationService.save(representationUSer);
        return "redirect:/representations";
    }
}
