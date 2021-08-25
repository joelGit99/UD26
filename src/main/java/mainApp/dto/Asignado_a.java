package mainApp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignado_a")
public class Asignado_a {
	
	// Atributos de la entidad asignado_a
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cientifico")
	Cientifico cientifico;
	@ManyToOne
	@JoinColumn(name="proyecto")
	Proyecto proyecto;
	
	// Constructores
	public Asignado_a() {

	}
	
	/**
	 * 
	 * @param id
	 * @param cientifico
	 * @param proyecto
	 */
	public Asignado_a(Long id, Cientifico cientifico, Proyecto proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}
	
	// Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cientifico getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "Asignado_a [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}

}
