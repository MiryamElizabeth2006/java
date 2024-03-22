package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		maquina.agregarCelda(new Celda("C1"));
		maquina.agregarCelda(new Celda("C2"));

		Producto producto1 = new Producto("KA11","Papitas", 0.85);
		maquina.cargarProducto(producto1, "A1", 4);

		Producto producto2 = new Producto("KA12","Doritos", 0.5);
		maquina.cargarProducto(producto2, "A2", 7);

		Producto producto3 = new Producto("KB13","Takis", 0.25);
		maquina.cargarProducto(producto3, "B1", 8);

		Producto producto4 = new Producto("KB14","Get", 0.45);
		maquina.cargarProducto(producto4, "B2", 2);

		Producto producto5 = new Producto("KC15","De todito", 0.75);
		maquina.cargarProducto(producto5, "C1", 5);

		Producto producto6 = new Producto("KC16","Cachitos", 0.45);
		maquina.cargarProducto(producto6, "C1", 5);

		ArrayList<Producto> menores = new ArrayList<Producto>();
		Producto lista;
		menores = maquina.buscarMenores(0.50);
		System.out.println("Productos Menores: "+menores.size());
		for (int i = 0; i < menores.size(); i++) {
			lista = menores.get(i);
			if(lista != null) {
				System.out.println("Nombre: "+lista.getNombre()+", Precio: "+lista.getPrecio());
			}
		}
	}

}
