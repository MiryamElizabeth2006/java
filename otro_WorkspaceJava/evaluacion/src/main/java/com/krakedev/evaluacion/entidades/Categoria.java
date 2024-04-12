package com.krakedev.evaluacion.entidades;

public class Categoria {
	private String idCategoria;
	private String nombre;
	
	public Categoria(String idCategoria, String nombre) {
		super();
		this.idCategoria = idCategoria;
		this.nombre = nombre;
	}
	
	public Categoria() {}
	
	
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", nombre=" + nombre + "]";
	}
	
	
}
