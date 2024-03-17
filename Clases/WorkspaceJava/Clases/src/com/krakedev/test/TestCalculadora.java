package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDividir;
		double promedio;
		
		calcu = new Calculadora();
		resultadoSuma = calcu.sumar(5,3);
		resultadoResta = calcu.restar(12 ,2);
		resultadoMultiplicacion = calcu.multiplicar(10, 5);
		resultadoDividir = calcu.dividir(10, 2);
		promedio = calcu.promediar(10, 8, 9);
		
		
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		System.out.println("RESULTADO MULTIPLICACIÓN: " + resultadoMultiplicacion);
		System.out.println("RESULTADO DIVISIÓN: "+resultadoDividir);
		System.out.println("PROMEDIO: "+promedio);
		calcu.mostrarResultado();
	}

}
