package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// Declar una variable de tipo Auto
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		//modificar los valores de las varables
		auto1.Marca = "Toyota";
		auto1.anio = 2010;
		auto1.precio = 15000.000;
		
		auto2.Marca = "Chevrolet";
		auto2.anio = 1995;
		auto2.precio = 12000.000;
		
		System.out.println("Datos de auto 1");
		System.out.println("Marca:"+auto1.Marca);
		System.out.println("Año:"+auto1.anio);
		System.out.println("Precio:"+auto1.precio);
		
		System.out.println("--------------------");
		
		System.out.println("Datos de auto 2");
		System.out.println("Marca:"+auto2.Marca);
		System.out.println("Año:"+auto2.anio);
		System.out.println("Precio:"+auto2.precio);
	}

}
