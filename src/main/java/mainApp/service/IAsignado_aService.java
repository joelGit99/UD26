package mainApp.service;

import java.util.List;

import mainApp.dto.Asignado_a;

public interface IAsignado_aService {

	// Métodos del CRUD
	public List<Asignado_a> listarAsignados(); // Listar All

	public Asignado_a guardarAsignado(Asignado_a asignado_a); // Guardar asignado CREATE

	public Asignado_a asignadoXID(Long id); // Leer datos de un asignado READ

	public Asignado_a actualizarAsignado(Asignado_a asignado_a); // Actualizar asignados UPDATE

	public void eliminarAsignado(Long id); // Eliminar asignado DELETE
}
