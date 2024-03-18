package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class testProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto("Queso Crema", 6.50);
		Producto producto2 = new Producto("Pierna de Cerdo", 30);
		double descuento;
		producto1.setPrecio(6.50);
		descuento = producto1.calcularPrecioPromo(10);
		
		System.out.println("----------------------Producto1--------------------");
		System.out.println("Nombre del Producto: "+producto1.getNombre());
		System.out.println("Precio: "+ producto1.getPrecio());
		System.out.println("Descuento: "+descuento);
		System.out.println("");
		
		producto2.setPrecio(30);
		descuento = producto2.calcularPrecioPromo(25);		
		System.out.println("----------------------Producto2--------------------");
		System.out.println("Nombre del Producto: "+producto2.getNombre());
		System.out.println("Precio: "+ producto2.getPrecio());
		System.out.println("Descuento: "+descuento);
		
	}

}

