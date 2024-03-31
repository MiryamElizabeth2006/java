package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;


public class TestEliminarPersona {

	public static void main(String[] args) {
		try {
			AdminPersonas.eliminar("1745642349");
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}


	}

}
