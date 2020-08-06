package be.iccbxl.pid.controller;

import be.iccbxl.pid.model.User;
import be.iccbxl.pid.service.RoleService;
import be.iccbxl.pid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;
    @Autowired
    private RoleService roleService;

    @Autowired
    private PasswordEncoder encoder;

    @GetMapping("/users")
    public String index(Model model) {
        StringBuilder content = new StringBuilder("<ul>");

        List<User> users = service.getAllUsers();
        users.forEach(user -> {
            content.append("<li>" + user + "</li>");
        });
        content.append("</ul>");
        model.addAttribute("users", users);
        model.addAttribute("newUser", new User());
        return "user/index";
    }

    @PostMapping("/register")
    public String addArtist(@ModelAttribute User newUser) {

        newUser.setPassword(encoder.encode(newUser.getPassword()));
        newUser = service.addUser(newUser);
        roleService.assignRoleToUser(RoleService.MEMBRE, newUser);
        return "redirect:..";
    }

    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("newUser", new User());
        return "layouts/register";
    }

}

