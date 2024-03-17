package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// Crear 3 varables y referenciarlas a la clase productos
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		Producto productoD = new Producto("Agua Oxigenanda", "1 Lt entero", 3.70, 55);
		
		//Modificar con productos de farmacia
		productoA.setNombre("Fnalin");
		productoA.setDescripcion("para el dolor de cabeza");
		productoA.setPrecio(0.75);
		productoA.setStockActual(50);
		
		productoB.setNombre("Mascarilla");
		productoB.setDescripcion("Quirurgica color celeste");
		productoB.setPrecio(1.50);
		productoB.setStockActual(100);
		
		productoC.setNombre("Alchol");
		productoC.setDescripcion("de 500ml");
		productoC.setPrecio(7.50);
		productoC.setStockActual(85);
		
		System.out.println("ProductoA");
		
		System.out.println("Nombre: "+productoA.getNombre());
		System.out.println("Descripcion: "+productoA.getDescripcion());
		System.out.println("Precio: "+productoA.getPrecio());
		System.out.println("Stock Actual: "+productoA.getStockActual());
		
		System.out.println("***************************");
		
System.out.println("ProductoB");
		
		System.out.println("Nombre: "+productoB.getNombre());
		System.out.println("Descripcion: "+productoB.getDescripcion());
		System.out.println("Precio: "+productoB.getPrecio());
		System.out.println("Stock Actual: "+productoB.getStockActual());
		
		System.out.println("***************************");
		
System.out.println("ProductoC");
		
		System.out.println("Nombre: "+productoC.getNombre());
		System.out.println("Descripcion: "+productoC.getDescripcion());
		System.out.println("Precio: "+productoC.getPrecio());
		System.out.println("Stock Actual: "+productoC.getStockActual());
		
		System.out.println("***************************");
		
System.out.println("ProductoD");
		
		System.out.println("Nombre: "+productoD.getNombre());
		System.out.println("Descripcion: "+productoD.getDescripcion());
		System.out.println("Precio: "+productoD.getPrecio());
		System.out.println("Stock Actual: "+productoD.getStockActual());
		
		System.out.println("***************************");
		
	}

}
