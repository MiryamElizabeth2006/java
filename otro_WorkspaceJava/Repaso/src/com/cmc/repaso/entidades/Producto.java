package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto (String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double calcularPrecioPromo(double descuento) {
		double paso1 =(precio*descuento)/100;
		double total = precio-paso1;
		return total;
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
		if(precio < 0) {
			precio = precio * -1;
		}else {
			this.precio = precio;
		}
	}
	
	
}
