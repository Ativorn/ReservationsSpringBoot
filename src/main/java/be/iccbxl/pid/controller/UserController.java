package be.iccbxl.pid.controller;

import be.iccbxl.pid.model.User;
import be.iccbxl.pid.service.RoleService;
import be.iccbxl.pid.service.StorageService;
import be.iccbxl.pid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.nio.file.Path;
import java.util.List;

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

    static String fileToPath(Path path) {
        return MvcUriComponentsBuilder.fromMethodName(UserController.class,
                "loadImageFromServer", path.getFileName().toString(), null).build().toString();
    }

    @GetMapping("/users")
    public String index(Model model) {
        List<User> users = service.getAllUsers();
        users.forEach(user -> user.setFullUrlImg(fileToPath(userStorageService.load(user.getId() + ".jpeg"))));

        model.addAttribute("users", users);
        return "users/users";
    }
    @GetMapping("/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> loadImageFromServer(@PathVariable String filename, HttpServletRequest request) {
        Resource file = userStorageService.loadAsResource(filename);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(MediaType.IMAGE_JPEG_VALUE))
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + file.getFilename()).body(file);
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
        return "layouts/register";
    }

}

