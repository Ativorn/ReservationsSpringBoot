package be.iccbxl.pid.repository;

import be.iccbxl.pid.model.RepresentationUser;
import be.iccbxl.pid.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepresentationUserRepository extends JpaRepository<RepresentationUser, Long> {
    List<RepresentationUser> findByUser(User user);
}
