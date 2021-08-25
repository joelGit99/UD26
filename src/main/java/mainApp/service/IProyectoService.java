package mainApp.service;

import java.util.List;

import mainApp.dto.Proyecto;

public interface IProyectoService {
	
	// Métodos del CRUD
		public List<Proyecto> listarProyectos(); // Listar All
		
		public Proyecto guardarProyecto(Proyecto proyecto); // Guardar proyecto CREATE
		
		public Proyecto proyectoXID(Long id); // Leer datos de un proyecto READ
		
		public Proyecto actualizarProyecto(Proyecto proyecto); // Actualizar proyectos UPDATE
		
		public void eliminarProyecto(Long id); // Eliminar proyecto DELETE
}
