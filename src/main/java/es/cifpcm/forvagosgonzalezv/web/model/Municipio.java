package es.cifpcm.forvagosgonzalezv.web.model;

import java.io.Serializable;

public class Municipio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Municipio() {
		// TODO Auto-generated constructor stub
	}
	
	private Short id_provincia;
	private Short id_municipio;
	private Integer cod_municipio;
	private Integer dc;
	private String nombre;
	
	
	public Short getId_provincia() {
		return id_provincia;
	}


	public void setId_provincia(Short id_provincia) {
		this.id_provincia = id_provincia;
	}


	public Short getId_municipio() {
		return id_municipio;
	}


	public void setId_municipio(Short id_municipio) {
		this.id_municipio = id_municipio;
	}


	public Integer getCod_municipio() {
		return cod_municipio;
	}


	public void setCod_municipio(Integer cod_municipio) {
		this.cod_municipio = cod_municipio;
	}


	public Integer getDc() {
		return dc;
	}


	public void setDc(Integer dc) {
		this.dc = dc;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Municipio(short id_provincia, short id_municipio, int cod_municipio, int dc, String nombre) {
		this.id_provincia=id_provincia;
		this.id_municipio=id_municipio;
		this.cod_municipio=cod_municipio;
		this.dc=dc;
		this.nombre=nombre;
		// TODO Auto-generated constructor stub
	}

}
