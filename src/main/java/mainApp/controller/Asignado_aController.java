package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Asignado_a;
import mainApp.service.IAsignado_aServiceImpl;

@RestController
@RequestMapping("/api")
public class Asignado_aController {
	
	@Autowired
	IAsignado_aServiceImpl asignadoImpl;
	
	@GetMapping("/asignado_a")
	public List<Asignado_a> listarAsignados() {
		return asignadoImpl.listarAsignados();
	}
	
	@PostMapping("/asignado_a")
	public Asignado_a guardarAsignado(@RequestBody Asignado_a asignado) {
		return asignadoImpl.guardarAsignado(asignado);
	}
	
	@GetMapping("/asignado_a/{id}")
	public Asignado_a asignadoXID(@PathVariable(name="id") Long id) {
		return asignadoImpl.asignadoXID(id);
	}
	
	@PutMapping("/asignado_a/{id}")
	public Asignado_a actualizarAsignado(@PathVariable(name="id") Long id, @RequestBody Asignado_a asignado) {
		Asignado_a asignado_seleccionado = new Asignado_a();
		Asignado_a asignado_actualizado = new Asignado_a();
		
		asignado_seleccionado.setCientifico(asignado.getCientifico());
		asignado_seleccionado.setProyecto(asignado.getProyecto());
		
		asignado_actualizado = asignadoImpl.actualizarAsignado(asignado_seleccionado);
		
		return asignado_actualizado;
	}
	
	@DeleteMapping("/asignado_a/{id}")
	public void eliminarAsignado(@PathVariable(name="id") Long id) {
		asignadoImpl.eliminarAsignado(id);
	}
}
