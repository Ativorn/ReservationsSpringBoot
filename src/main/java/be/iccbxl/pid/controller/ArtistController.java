package be.iccbxl.pid.controller;

import be.iccbxl.pid.model.Artist;
import be.iccbxl.pid.model.ArtistType;
import be.iccbxl.pid.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ArtistController {

    @Autowired
    private ArtistService service;

    @GetMapping("/artists")
    public String index(Model model) {
        List<Artist> artists = service.getAllArtists();
        model.addAttribute("artists", artists);
        model.addAttribute("newArtist", new Artist());
        return "artist/artists";
    }

    @PostMapping("/artists/add")
    public String addArtist(@ModelAttribute Artist newArtist) {
        service.addArtist(newArtist);
        return "redirect:/artists";
    }

    @GetMapping("/artists/update/{id}")
    public String updateArtist(@PathVariable Long id, Model model) {
        Artist artist = service.getArtist(id.toString());
        model.addAttribute("artist", artist);
        return "artist/updateArtist";
    }


    @PostMapping("/artists/update")
    public String updateArtist(@ModelAttribute Artist artist) {
        service.updateArtist(artist);
        return "redirect:/artists";
    }


    @GetMapping("/artists/addtype/{id}")
    public String addTypeToArtist(@PathVariable Long id, Model model) {
        Artist artist = service.getArtist(id.toString());
        model.addAttribute("artist", artist);
        model.addAttribute("artistType", new ArtistType());
        model.addAttribute("types", service.getAllTypes());
        return "artist/addTypeToArtist";
    }

    @PostMapping("/artists/addtype")
    public String addTypeToArtist(@ModelAttribute Artist artist, @ModelAttribute ArtistType artistType) {
        service.addTypeToArtist(artist, artistType);
        return "redirect:/artists";
    }

}