package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminCuentas;

public class TestEliminarCuentas {

	public static void main(String[] args) {
		try {
			AdminCuentas.eliminarC("00001");
		} catch (Exception e) {
			System.out.println("Error en el sistema " + e.getMessage());
		}
	}

}
