package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class testItem {

	public static void main(String[] args) {
		Item productos1 = new Item();
		Item productos2 = new Item();
		
		productos1.setNombre("Papas");
		productos1.setProductosActuales(20);
		productos1.vender(5);
		
		System.out.println("-----------------Productos Vendidos-----------------");
		System.out.println("Nombre: "+productos1.getNombre());
		System.out.println("Productos Actuales: "+productos1.getProductosActuales());
		System.out.println("Productos Vendidos: "+productos1.getProductosVendidos ());  
		System.out.println("Productos Devueltos: "+productos1.getProductosDevueltos());
		
		//Productos Modificados con devueltos
		productos1.devolver(2);
		
		System.out.println("");
		System.out.println("--------Productos modificado con devoluciones-------");
		System.out.println("Nombre: "+productos1.getNombre());
		System.out.println("Productos Actuales: "+productos1.getProductosActuales());
		System.out.println("Productos Vendidos: "+productos1.getProductosVendidos ());  
		System.out.println("Productos Devueltos: "+productos1.getProductosDevueltos());
		
		//Producto número 2
		productos2.setNombre("Chifles");
		productos2.setProductosActuales(50);
		productos2.vender(10);
		
		System.out.println("");
		System.out.println("*******************************************************");
		System.out.println("-----------------Productos Vendidos 2-----------------");
		System.out.println("Nombre: "+productos2.getNombre());
		System.out.println("Productos Actuales: "+productos2.getProductosActuales());
		System.out.println("Productos Vendidos: "+productos2.getProductosVendidos ());  
		System.out.println("Productos Devueltos: "+productos2.getProductosDevueltos());
		
		//Productos Modificados con devueltos
		productos2.devolver(7);
		
		System.out.println("");
		System.out.println("--------Productos modificado con devoluciones 2-------");
		System.out.println("Nombre: "+productos2.getNombre());
		System.out.println("Productos Actuales: "+productos2.getProductosActuales());
		System.out.println("Productos Vendidos: "+productos2.getProductosVendidos ());  
		System.out.println("Productos Devueltos: "+productos2.getProductosDevueltos());
	}

}

