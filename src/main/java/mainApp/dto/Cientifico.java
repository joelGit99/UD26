package mainApp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cientificos")
public class Cientifico {

	// Atributos de la entidad cientifico
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="DNI")
	private String DNI;
	@Column(name="nomApels")
	private String nomApels;

	@OneToMany
	@JoinColumn(name="id")
	private List<Asignado_a> asignado_a;

	// Constructores
	public Cientifico() {

	}
	
	/**
	 * 
	 * @param id
	 * @param dNI
	 * @param nomApels
	 */
	public Cientifico(Long id, String dNI, String nomApels) {
		this.id = id;
		DNI = dNI;
		this.nomApels = nomApels;
	}
	
	// Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado_a")
	public List<Asignado_a> getAsignado_a() {
		return asignado_a;
	}

	public void setAsignado_a(List<Asignado_a> asignado_a) {
		this.asignado_a = asignado_a;
	}

	@Override
	public String toString() {
		return "Cientifico [id=" + id + ", DNI=" + DNI + ", nomApels=" + nomApels + "]";
	}
	
}
