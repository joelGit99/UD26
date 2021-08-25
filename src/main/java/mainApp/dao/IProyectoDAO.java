package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import mainApp.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, Long> {

}
