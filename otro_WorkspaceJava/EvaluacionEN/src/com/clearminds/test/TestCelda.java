package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		System.out.println(celda.getProducto().getNombre());
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
	
	/*Me arroja un nullpointer y me da en este documento en la linea numeros 8 y eso se da cuando hay una variable en null.algo que eso
	 daria el NullPinter entonces estoy tratando de llamar a un metodo y no va a valer si la variable esta en null y aprecio que es en 
	 celda.getProducto().getNombre()*/
}
