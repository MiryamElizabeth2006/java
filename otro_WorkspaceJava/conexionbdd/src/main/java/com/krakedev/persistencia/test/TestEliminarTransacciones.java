package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminTransacciones;

public class TestEliminarTransacciones {

	public static void main(String[] args) {
		try {
			AdminTransacciones.eliminarT(1001);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}

	}

}
