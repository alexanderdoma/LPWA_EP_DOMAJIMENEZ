package api.cinestar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cine",catalog = "cinestar",schema = "")
public class Cine {
	
	@Id
	@Column
	private Integer id;
	
	@Column
	private String RazonSocial;
	
	@Column
	private Integer Salas;
	
	@Column
	private Integer idDistrito;
	
	@Column
	private String Direccion;
	
	@Column
	private String Telefonos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRazonSocial() {
		return RazonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}

	public Integer getSalas() {
		return Salas;
	}

	public void setSalas(Integer salas) {
		Salas = salas;
	}

	public Integer getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(Integer idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefonos() {
		return Telefonos;
	}

	public void setTelefonos(String telefonos) {
		Telefonos = telefonos;
	}
	
	
}