package mainApp.service;

import java.util.List;

import mainApp.dto.Cientifico;

public interface ICientificoService {
	
	// Métodos del CRUD
	public List<Cientifico> listarCientificos(); // Listar All
	
	public Cientifico guardarCientifico(Cientifico cientifico); // Guardar científico CREATE
	
	public Cientifico cientificoXID(Long id); // Leer datos de un cientifico READ
	
	public Cientifico actualizarCientifico(Cientifico cientifico); // Actualizar científicos UPDATE
	
	public void eliminarCientifico(Long id); // Eliminar cientifico DELETE
}
