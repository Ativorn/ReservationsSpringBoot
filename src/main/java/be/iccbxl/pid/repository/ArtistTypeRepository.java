package be.iccbxl.pid.repository;

import be.iccbxl.pid.model.ArtistType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistTypeRepository extends CrudRepository<ArtistType, Long> {
   

}
