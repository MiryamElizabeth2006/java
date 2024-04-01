package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarPorCedula {

	public static void main(String[] args) {
		try {
			Persona p = AdminPersonas.buscarPorCedula("1784529623");
			System.out.println(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
