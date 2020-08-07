package be.iccbxl.pid.repository;

import be.iccbxl.pid.model.Artist;
import be.iccbxl.pid.model.ArtistType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistTypeRepository extends CrudRepository<ArtistType, Long> {

    List<ArtistType> findByArtist(Artist artist);
}
