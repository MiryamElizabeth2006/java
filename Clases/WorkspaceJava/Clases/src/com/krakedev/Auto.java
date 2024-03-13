package com.krakedev;

public class Auto {
	private String Marca;
	private int anio;
	private double precio;
	
	public Auto () {
		
	}
	
	public Auto (String marca, int anio, double precio) {
		this.Marca = marca;
		this.anio = anio;
		this.precio = precio;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
