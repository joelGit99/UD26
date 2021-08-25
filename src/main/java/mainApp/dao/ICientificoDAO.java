package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import mainApp.dto.Cientifico;

public interface ICientificoDAO extends JpaRepository<Cientifico, Long> {

}
