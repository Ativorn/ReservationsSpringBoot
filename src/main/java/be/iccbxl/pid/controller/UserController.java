package be.iccbxl.pid.controller;

import be.iccbxl.pid.model.User;
import be.iccbxl.pid.security.MyUserDetailsService;
import be.iccbxl.pid.service.RoleService;
import be.iccbxl.pid.service.StorageService;
import be.iccbxl.pid.service.UserService;
import be.iccbxl.pid.service.rest.LanguageRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static be.iccbxl.pid.controller.ImagesController.fileToPath;

@Controller
public class UserController {

    @Autowired
    private UserService service;
    @Autowired
    private RoleService roleService;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private StorageService userStorageService;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private LanguageRestService languageRestService;

    @GetMapping("/users")
    public String index(Model model) {
        List<User> users = service.getAllUsers();
        users.forEach(user -> {
            String filename = userStorageService.fileNameWithPath(user.getId() + ".jpeg");
            user.setFullUrlImg(fileToPath(filename));
        });

        model.addAttribute("users", users);
        return "users/users";
    }

    @PostMapping("/register")
    public String addArtist(@ModelAttribute User newUser, @RequestParam MultipartFile file) {

        newUser.setPassword(encoder.encode(newUser.getPassword()));
        newUser = service.addUser(newUser);
        roleService.assignRoleToUser(RoleService.MEMBRE, newUser);
        if (file != null && !file.isEmpty()) {
            String newImageName = newUser.getId() + ".jpeg";
            userStorageService.store(file, newImageName);
        }
        return "redirect:/";
    }

    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("languages", languageRestService.getLanguages());
        return "layouts/register";
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        User connectedUser = userDetailsService.getConnectedUser();
        String filename = userStorageService.fileNameWithPath(connectedUser.getId() + ".jpeg");
        connectedUser.setFullUrlImg(fileToPath(filename));
        model.addAttribute("user", connectedUser);
        return "users/profile";
    }

    @GetMapping("/profile/edit")
    public String edit(Model model) {
        User connectedUser = userDetailsService.getConnectedUser();
        String filename = userStorageService.fileNameWithPath(connectedUser.getId() + ".jpeg");
        connectedUser.setFullUrlImg(fileToPath(filename));
        model.addAttribute("newUser", connectedUser);
        return "users/editProfile";
    }

    @PostMapping("/profile/edit")
    public String updateProfile(@ModelAttribute("newUser") User user, @RequestParam MultipartFile file) {

        if (user.getNewPassword() != null && !user.getNewPassword().isEmpty()) {
            user.setPassword(encoder.encode(user.getNewPassword()));
        }
        user = service.save(user);
        if (file != null && !file.isEmpty()) {
            String newImageName = user.getId() + ".jpeg";
            userStorageService.store(file, newImageName);
        }
        return "redirect:/profile";
    }


    @GetMapping("/users/activate/{id}")
    public String activateArtist(@PathVariable Long id) {
        return doActivation(id, true);
    }

    @GetMapping("/users/desactivate/{id}")
    public String desactivateArtist(@PathVariable Long id) {
        return doActivation(id, false);
    }

    private String doActivation(Long id, boolean b) {
        User user = service.getUserById(id);
        user.setActive(b);
        service.save(user);
        return "redirect:/users";
    }
}

