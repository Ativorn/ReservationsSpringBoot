package be.iccbxl.pid.repository;


import be.iccbxl.pid.model.RoleUser;
import be.iccbxl.pid.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleUserRepository extends JpaRepository<RoleUser, Long> {
    List<RoleUser> findByUser(User user);

}
