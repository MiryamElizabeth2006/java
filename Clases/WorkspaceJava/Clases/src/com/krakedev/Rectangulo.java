package com.krakedev;

public class Rectangulo {
	private int base;
	private int altura;
	
	
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	
	public int calcularArea () {
		int area = this.base*this.altura;
		return area;
	}
	
	public double calcularPerimetro () {
		double perimetro = (this.base + this.base) + (this.altura+ this.altura);
		return perimetro;
	}
}
