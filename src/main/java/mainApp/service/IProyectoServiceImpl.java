package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IProyectoDAO;
import mainApp.dto.Proyecto;

@Service
public class IProyectoServiceImpl implements IProyectoService {
	
	@Autowired
	IProyectoDAO iproyectodao;
	
	@Override
	public List<Proyecto> listarProyectos() {
		return iproyectodao.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		return iproyectodao.save(proyecto);
	}

	@Override
	public Proyecto proyectoXID(Long id) {
		return iproyectodao.findById(id).get();
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		return iproyectodao.save(proyecto);
	}

	@Override
	public void eliminarProyecto(Long id) {
		iproyectodao.deleteById(id);
	}

}
