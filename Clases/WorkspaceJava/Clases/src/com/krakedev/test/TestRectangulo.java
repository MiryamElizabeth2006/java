package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo pR1 = new Rectangulo();
		Rectangulo pR2 = new Rectangulo();
		
		int areaR1;
		int areaR2;
		double perimetroR1;
		double perimetroR2;
	
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(8);
		r2.setAltura(3);
		
		pR1.setBase(10);
		pR1.setAltura(5);
		
		pR2.setBase(8);
		pR2.setAltura(3);
		
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		perimetroR1 = pR1.calcularPerimetro();
		perimetroR2 = pR2.calcularPerimetro();
		
		System.out.println("El area de R1 es: "+areaR1);
		System.out.println("El area de R2 es: "+areaR2);
		System.out.println("El perimetro del R1 es: "+perimetroR1);
		System.out.println("El perimetro del R2 es: "+perimetroR2);
		
		}
}
