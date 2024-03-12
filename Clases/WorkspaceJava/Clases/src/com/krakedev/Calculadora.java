package com.krakedev;

public class Calculadora {
	public int sumar (int valor1, int valor2) {
		int resultado; //declarar la variable
		resultado = valor1 + valor2;	
		return resultado;
	}
	
	public int restar (int valor1, int valor2) {
		int resultado; //delarar la varaible para guardar resultado
		resultado = valor1 - valor2;
		return resultado;
	}
	
	public double multiplicar (double valor1, double valor2) {
		double resultado;
		resultado = valor1 * valor2;
		return resultado;
	}
	
	public double dividir (double valor1, double valor2) {
		double resultado;
		resultado = valor1/valor2;
		return resultado;
	}
}
