package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// Declar una variable de tipo Auto
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		//modificar los valores de las varables
		auto1.setMarca("Toyota");
		auto1.setAnio(2010);
		auto1.setPrecio(15000.000);
		
		auto2.setMarca("Chevrolet");
		auto2.setAnio(1995);
		auto2.setPrecio(12000.000);
		
		System.out.println("Datos de auto 1");
		System.out.println("Marca:"+auto1.getMarca());
		System.out.println("Año:"+auto1.getAnio());
		System.out.println("Precio:"+auto1.getPrecio());
		
		System.out.println("--------------------");
		
		System.out.println("Datos de auto 2");
		System.out.println("Marca:"+auto2.getMarca());
		System.out.println("Año:"+auto2.getAnio());
		System.out.println("Precio:"+auto2.getPrecio());
	}

}
