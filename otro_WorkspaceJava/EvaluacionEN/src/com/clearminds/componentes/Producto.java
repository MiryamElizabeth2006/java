package com.clearminds.componentes;

public class Producto {
	private String codigo;
	  private String nombre;
	  private double precio;
	  
	
	
	public Producto(String codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	public void incrementarPrecio(int porcentajeIncremento) {
		double incremento = precio*(porcentajeIncremento*0.01);
		precio += incremento;
	}
	
	public void disminuirPrecio(double descuento) {
		double Descuento = precio - descuento;
		precio = Descuento;
	}  
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	  

}
