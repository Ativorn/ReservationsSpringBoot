package be.iccbxl.pid.controller;

import be.iccbxl.pid.model.ArtistType;
import be.iccbxl.pid.model.ArtistTypeShow;
import be.iccbxl.pid.model.Show;
import be.iccbxl.pid.service.ArtistService;
import be.iccbxl.pid.service.LocationService;
import be.iccbxl.pid.service.ShowService;
import be.iccbxl.pid.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ShowController {
    @Autowired
    private ShowService showService;
    @Autowired
    private ArtistService artistService;

    @Autowired
    private LocationService locationService;

    @GetMapping("/shows")
    public String getAllShows(Model model) {

        model.addAttribute("Shows", showService.getAllShows());
        return "show/shows";
    }

    @GetMapping("/shows/add")
    public String addNewShow(Model model) {
        model.addAttribute("show", new Show());
        model.addAttribute("location", locationService.getAllLocations());
        return "show/updateShow";
    }

    @PostMapping("/shows/add")
    public String addNewShow(@ModelAttribute Show show) {
        if (show.getId() == null) {
            System.out.println("insertion d'un nouveau show dans la db");
        } else {
            System.out.println("modification d'un show");
        }
        show.setSlug(Utilities.toSlug(show.getTitle()));
        showService.saveShow(show);
        return "redirect:/shows";
    }

    @GetMapping("/shows/update/{id}")
    public String updateShow(@PathVariable(value = "id") Long showId, Model model) {
        model.addAttribute("show", showService.findShowById(showId));
        model.addAttribute("location", locationService.getAllLocations());
        return "show/updateShow";
    }
    @GetMapping("/shows/addArtist/{id}")
    public String addArtistToShow(@PathVariable(value = "id") Long showId, Model model) {
        model.addAttribute("show", showService.findShowById(showId));
        model.addAttribute("artistTypeShow", new ArtistTypeShow());
        List<ArtistType> allArtistTypes = showService.getAllArtistTypes();
        // keep only artist Types with artist and type
        allArtistTypes = allArtistTypes.stream()
                .filter(artT -> artT.getType() != null && artT.getArtist() != null)
                .collect(Collectors.toList());
        model.addAttribute("artists", allArtistTypes);
        return "show/addArtist";
    }

    @PostMapping("/shows/addartist")
    public String addArtistToShow(@ModelAttribute ArtistTypeShow artistTypeShow, @ModelAttribute Show show) {
        showService.addArtistToShow(show, artistTypeShow);
        return "redirect:/shows";
    }

}
