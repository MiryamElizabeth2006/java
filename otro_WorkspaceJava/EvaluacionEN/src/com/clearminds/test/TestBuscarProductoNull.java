package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.Maquinadulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		Maquinadulces maquina=new Maquinadulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod.getNombre());
		
	/*El error es causado por un null pinter una variable . algo intentando acceder a un método o algo y se encuentra en este archivo
	 * TestBuscarProductoNull en la linea número 16 el unico varable.algo es prod.getNombre() el cual es el error null pointer*/	
	}
}
