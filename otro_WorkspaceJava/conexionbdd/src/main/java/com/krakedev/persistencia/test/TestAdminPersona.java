package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

//System.out.println() solo se va poder usar en los tests

public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("S", "Soltero");
		Persona p = new Persona("2578496312", "Mario", "Simarro", ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2000/09/28");
			Date horaNac = Convertidor.convertirHora("12:25");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(789.50));
			p.setNumeroHijos(0);
			p.setEstatura(1.75);
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	}

}
