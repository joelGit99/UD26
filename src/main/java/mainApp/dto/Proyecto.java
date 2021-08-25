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

public class Proyecto {
	// Atributos de la entidad proyecto
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name="nombre")
		private String nombre;
		@Column(name="horas")
		private int horas;
		
		@OneToMany
		@JoinColumn(name="id")
		private List<Asignado_a> asignado_a;
		
		// Constructores
		/**
		 * 
		 * @param id
		 * @param nombre
		 * @param horas
		 */
		public Proyecto(Long id, String nombre, int horas) {
			this.id = id;
			this.nombre = nombre;
			this.horas = horas;
		}

		public Proyecto() {
	
		}
		
		// Getters y setters
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getHoras() {
			return horas;
		}

		public void setHoras(int horas) {
			this.horas = horas;
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
			return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
		}
		
}
