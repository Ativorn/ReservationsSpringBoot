package be.iccbxl.pid.service;

import be.iccbxl.pid.model.User;

public interface RoleService {

    String ADMIN = "ROLE_ADMIN";
    String MEMBRE = "ROLE_MEMBER";

    /**
     * assgign the specific role to the specified user.
     *
     * @param role
     * @return
     */
    void assignRoleToUser(String role, User user);
}
