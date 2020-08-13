package be.iccbxl.pid.repository;

import be.iccbxl.pid.model.ArtistTypeShow;
import be.iccbxl.pid.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistTypeShowRepository extends JpaRepository<ArtistTypeShow, Long> {
    List<ArtistTypeShow> findByShow(Show show);
}
