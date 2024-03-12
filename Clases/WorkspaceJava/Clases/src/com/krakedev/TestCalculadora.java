package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDividir;
		
		calcu = new Calculadora();
		resultadoSuma = calcu.sumar(5,3);
		resultadoResta = calcu.restar(12 ,2);
		resultadoMultiplicacion = calcu.multiplicar(4, 5);
		resultadoDividir = calcu.dividir(10, 2);
		
		
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		System.out.println("RESULTADO MULTIPLICACIÓN: " + resultadoMultiplicacion);
		System.out.println("RESULTADO DIVISIÓN: "+resultadoDividir);
	}

}
