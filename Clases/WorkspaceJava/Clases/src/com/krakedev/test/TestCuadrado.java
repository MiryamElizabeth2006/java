package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado aC1 = new Cuadrado();
		Cuadrado aC2 = new Cuadrado();
		Cuadrado aC3 = new Cuadrado();
		
		Cuadrado pC1 = new Cuadrado();
		Cuadrado pC2 = new Cuadrado();
		Cuadrado pC3 = new Cuadrado();
		
		double areaC1;
		double areaC2;
		double areaC3;
		
		double perimetroC1;
		double perimetroC2;
		double perimetroC3;
		
		 aC1.setLado(5);
		 aC2.setLado(3);
		 aC3.setLado(10);
		 
		 pC1.setLado(5);
		 pC2.setLado(3);
		 pC3.setLado(10);
		 
		 areaC1 = aC1.calcularArea();
		 areaC2 = aC2.calcularArea();
		 areaC3 = aC3.calcularArea();
		 
		 perimetroC1 = pC1.calcularPerimetro();
		 perimetroC2 = pC2.calcularPerimetro();
		 perimetroC3 = pC3.calcularPerimetro();
		 
		 System.out.println("Area Cuadrado 1: "+areaC1);
		 System.out.println("Area Cuadrado 2: "+areaC2);
		 System.out.println("Area Cuadrado 3: "+areaC3);
		 System.out.println("**************************");
		 System.out.println("Perimetro Cuadrado 1: "+perimetroC1);
		 System.out.println("Perimetro Cuadrado 2: "+perimetroC2);
		 System.out.println("Perimetro Cuadrado 3: "+perimetroC3);
		 
	}
	
	 
}
