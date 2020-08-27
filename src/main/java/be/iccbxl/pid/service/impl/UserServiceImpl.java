package be.iccbxl.pid.service.impl;

import be.iccbxl.pid.exception.UserLoginUniqueConstraintViolation;
import be.iccbxl.pid.model.RoleUser;
import be.iccbxl.pid.model.User;
import be.iccbxl.pid.repository.RoleUserRepository;
import be.iccbxl.pid.repository.UserRepository;
import be.iccbxl.pid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleUserRepository roleUserRepository;

    @Override
    public List<User> getAllUsers() {
        List<User> all = userRepository.findAll();
        all.forEach(user -> user.setRoles(Stream.of(getRolesOf(user)).collect(Collectors.joining(",", "[", "]"))));
        return all;
    }

    @Override
    public User getUserById(String id) {
        long indice = Long.valueOf(id);
        return getUserById(indice);
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public User getUserByLogin(String login) {
        List<User> byLogin = userRepository.findByLogin(login);
        if (byLogin == null || byLogin.isEmpty()) {
            return null;
        } else if (byLogin.size() > 1) {
            throw new UserLoginUniqueConstraintViolation("We found more than user with login " + login);
        } else {
            return byLogin.get(0);
        }
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void updateUser(String id, User user) {
        userRepository.save(user);
    }

    public void deleteUser(String id) {
        Long indice = (long) Integer.parseInt(id);

        userRepository.deleteById(indice);
    }



    public String[] getRolesOf(User user) {
        List<RoleUser> all = roleUserRepository.findByUser(user);
        String[] roles = {};
        if (all != null && !all.isEmpty()) {
            roles = all.stream()
                    .map(roleUser -> roleUser.getRole())
                    .filter(role -> !Objects.isNull(role))
                    .map(role -> role.getRole())
                    .toArray(String[]::new);
        }
        return roles;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }


}

