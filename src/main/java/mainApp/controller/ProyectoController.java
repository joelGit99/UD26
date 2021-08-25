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

import mainApp.dto.Proyecto;
import mainApp.service.IProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	
	@Autowired
	IProyectoServiceImpl proyectoServImpl;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos() {
		return proyectoServImpl.listarProyectos();
	}
	
	@PostMapping("/proyectos")
	public Proyecto guardarProyecto(@RequestBody Proyecto proyecto) {
		return proyectoServImpl.guardarProyecto(proyecto);
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyecto proyectoXID(@PathVariable(name="id") Long id) {
		return proyectoServImpl.proyectoXID(id);
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name="id") Long id, @RequestBody Proyecto proyecto) {
		Proyecto proyecto_seleccionado = new Proyecto();
		Proyecto proyecto_actualizado = new Proyecto();
		
		proyecto_seleccionado.setNombre(proyecto.getNombre());
		proyecto_seleccionado.setHoras(proyecto.getHoras());
		
		proyecto_actualizado = proyectoServImpl.actualizarProyecto(proyecto_seleccionado);
		
		return proyecto_actualizado;
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto(@PathVariable(name="id") Long id) {
		proyectoServImpl.eliminarProyecto(id);
	}
}
