package es.cifpcm.forvagosgonzalezv.web.model;

import java.io.Serializable;

public class Provincia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Provincia() {
		// TODO Auto-generated constructor stub
	}
	
	private Short id_provincia;
	private String nombre;
	public Short getId_provincia() {
		return id_provincia;
	}
	public void setId_provincia(Short id_provincia) {
		this.id_provincia = id_provincia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Provincia(short id_provincia, String nombre) {
		this.id_provincia=id_provincia;
		this.nombre=nombre;
		// TODO Auto-generated constructor stub
	}
}
