package api.cinestar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula",catalog= "cinestar",schema = "")
public class Pelicula {

	@Id
	@Column
	private Integer id ;
	
	@Column
	private String Titulo ;
	

	@Column (name="idEstado")
	private Integer idEstado ;
	
	
	@Column (name="FechaEstreno")
	private String FechaEstreno ;
	
	@Column
	private String Director ;
	
	@Column
	private String Generos ;

	@Column (name="idClasificacion")
	private Integer idClasificacion ;
	
	@Column
	private String Duracion ;
	
	@Column
	private String Link ;
	
	@Column
	private String Reparto ;
	
	@Column
	private String Sinopsis ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getFechaEstreno() {
		return FechaEstreno;
	}

	public void setFechaEstreno(String fechaEstreno) {
		FechaEstreno = fechaEstreno;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getGeneros() {
		return Generos;
	}

	public void setGeneros(String generos) {
		Generos = generos;
	}

	public Integer getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(Integer idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getDuracion() {
		return Duracion;
	}

	public void setDuracion(String duracion) {
		Duracion = duracion;
	}

	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		Link = link;
	}

	public String getReparto() {
		return Reparto;
	}

	public void setReparto(String reparto) {
		Reparto = reparto;
	}

	public String getSinopsis() {
		return Sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		Sinopsis = sinopsis;
	}
}