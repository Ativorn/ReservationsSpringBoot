package be.iccbxl.pid.controller;

import be.iccbxl.pid.model.User;
import be.iccbxl.pid.security.MyUserDetailsService;
import be.iccbxl.pid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.stream.Stream;

@Controller
public class MainController {

    @Autowired
    private MyUserDetailsService userDetailsService;
    @Autowired
    private UserService service;
    @RequestMapping("/")
    public String index() {
        User connectedUser = userDetailsService.getConnectedUser();
        String[] rolesOf = service.getRolesOf(connectedUser);

        if (Stream.of(rolesOf).anyMatch(role -> role.equals("ROLE_ADMIN"))) {
            return "layouts/main";
        } else {
            return ("redirect:/representations");
        }
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

}
