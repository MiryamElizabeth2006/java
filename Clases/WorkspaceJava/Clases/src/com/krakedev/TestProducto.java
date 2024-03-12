package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// Crear 3 varables y referenciarlas a la clase productos
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		//Modificar con productos de farmacia
		productoA.nombre = "Fnalin";
		productoA.descripcion = "para el dolor de cabeza";
		productoA.precio = 0.75;
		productoA.stockActual = 50;
		
		productoB.nombre = "Mascarilla";
		productoB.descripcion = "Quirurgica color celeste";
		productoB.precio = 1.50;
		productoB.stockActual = 100;
		
		productoC.nombre = "Alchol";
		productoC.descripcion = "de 500ml";
		productoC.precio = 7.50;
		productoC.stockActual = 85;
		
		System.out.println("ProductoA");
		
		System.out.println("Nombre: "+productoA.nombre);
		System.out.println("Descripcion: "+productoA.descripcion);
		System.out.println("Precio: "+productoA.precio);
		System.out.println("Stock Actual: "+productoA.stockActual);
		
		System.out.println("***************************");
		
System.out.println("ProductoB");
		
		System.out.println("Nombre: "+productoB.nombre);
		System.out.println("Descripcion: "+productoB.descripcion);
		System.out.println("Precio: "+productoB.precio);
		System.out.println("Stock Actual: "+productoB.stockActual);
		
		System.out.println("***************************");
		
System.out.println("ProductoC");
		
		System.out.println("Nombre: "+productoC.nombre);
		System.out.println("Descripcion: "+productoC.descripcion);
		System.out.println("Precio: "+productoC.precio);
		System.out.println("Stock Actual: "+productoC.stockActual);
		
		System.out.println("***************************");
		
	}

}
