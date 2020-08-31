package be.iccbxl.pid.controller.rest.producer;


import be.iccbxl.pid.model.User;
import be.iccbxl.pid.service.RoleService;
import be.iccbxl.pid.service.UserService;
import be.iccbxl.pid.service.rest.LanguageRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class RegisterRestController {
    @Autowired
    private UserService service;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    LanguageRestService LanguageService;

    @GetMapping("/isloginvalid/{login}")
    public Boolean activateArtist(@PathVariable String login) {

        return login != null
                && !login.isEmpty()
                && !login.equals("undefined") && service.getUserByLogin(login) == null;
    }


    @PostMapping("/register")
    public Boolean registerNewUser(@RequestBody User user) {
        try {
            user.setPassword(encoder.encode(user.getPassword()));
            user = service.addUser(user);
            roleService.assignRoleToUser(RoleService.AFFILIATE, user);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}
