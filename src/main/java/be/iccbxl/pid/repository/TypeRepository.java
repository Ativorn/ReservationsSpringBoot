package be.iccbxl.pid.repository;

import be.iccbxl.pid.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Long> {

    Type findByType(String type);
}
