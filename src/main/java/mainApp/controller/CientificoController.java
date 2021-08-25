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

import mainApp.dto.Cientifico;
import mainApp.service.ICientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {
	
	@Autowired
	ICientificoServiceImpl icientificoServImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos() {
		return icientificoServImpl.listarCientificos();
	}
	
	@PostMapping("/cientificos")
	public Cientifico guardarCientifico(@RequestBody Cientifico cientifico) {
		return icientificoServImpl.guardarCientifico(cientifico);
	}
	
	@GetMapping("/cientificos/{id}")
	public Cientifico cientificoXID(@PathVariable(name="id") Long id) {
		return icientificoServImpl.cientificoXID(id);
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name="id") Long id, @RequestBody Cientifico cientifico) {
		Cientifico cient_seleccionado = new Cientifico();
		Cientifico cient_actualizado = new Cientifico();
		
		cient_seleccionado.setDNI(cientifico.getDNI());
		cient_seleccionado.setNomApels(cientifico.getNomApels());
		
		cient_actualizado = icientificoServImpl.actualizarCientifico(cient_seleccionado);
		
		return cient_actualizado;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientifico(@PathVariable(name="id") Long id) {
		icientificoServImpl.eliminarCientifico(id);
	}
}
