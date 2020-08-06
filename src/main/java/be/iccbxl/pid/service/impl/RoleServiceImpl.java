package be.iccbxl.pid.service.impl;

import be.iccbxl.pid.model.Role;
import be.iccbxl.pid.model.RoleUser;
import be.iccbxl.pid.model.User;
import be.iccbxl.pid.repository.RoleRepository;
import be.iccbxl.pid.repository.RoleUserRepository;
import be.iccbxl.pid.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private RoleUserRepository roleUserRepository;


    @Override
    public void assignRoleToUser(String role, User user) {
        List<Role> roles = roleRepository.findByRole(role);
        if (roles == null || roles.isEmpty() || roles.size() > 1) {
            throw new IllegalStateException(" Error retrieving the  role " + role);
        } else {
            RoleUser roleUser = new RoleUser();
            roleUser.setRole(roles.get(0));
            roleUser.setUser(user);
            roleUserRepository.save(roleUser);
        }
    }
}
