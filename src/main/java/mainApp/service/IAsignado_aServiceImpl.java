package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IAsignado_aDAO;
import mainApp.dto.Asignado_a;

@Service
public class IAsignado_aServiceImpl implements IAsignado_aService {
	
	@Autowired
	IAsignado_aDAO iasignadodao;
	
	@Override
	public List<Asignado_a> listarAsignados() {
		return iasignadodao.findAll();
	}

	@Override
	public Asignado_a guardarAsignado(Asignado_a asignado_a) {
		return iasignadodao.save(asignado_a);
	}

	@Override
	public Asignado_a asignadoXID(Long id) {
		return iasignadodao.findById(id).get();
	}

	@Override
	public Asignado_a actualizarAsignado(Asignado_a asignado_a) {
		return iasignadodao.save(asignado_a);
	}

	@Override
	public void eliminarAsignado(Long id) {
		iasignadodao.deleteById(id);
	}

}
