package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dto.Cientifico;
import mainApp.dao.ICientificoDAO;

@Service
public class ICientificoServiceImpl implements ICientificoService {
	
	@Autowired
	ICientificoDAO icientificodao;
	
	@Override
	public List<Cientifico> listarCientificos() {
		return icientificodao.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		return icientificodao.save(cientifico);
	}

	@Override
	public Cientifico cientificoXID(Long id) {
		return icientificodao.findById(id).get();
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		return icientificodao.save(cientifico);
	}

	@Override
	public void eliminarCientifico(Long id) {
		icientificodao.deleteById(id);
	}

}
