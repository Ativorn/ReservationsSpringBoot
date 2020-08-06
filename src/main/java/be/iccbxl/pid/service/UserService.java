package be.iccbxl.pid.service;

import be.iccbxl.pid.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User addUser(User user);

    /**
     * Find user by ID
     *
     * @param id the user id
     * @return return the user found by id, null otherwise
     */
    User getUserById(String id);

    /**
     * Find user by login
     *
     * @param login the user unique login
     * @return return the user found by login, null otherwise
     */
    User getUserByLogin(String login);
}
