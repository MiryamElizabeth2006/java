package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarPersonas {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("S", "Soltera");
		Persona p = new Persona("1784529623", "Sofia", "Robayo", ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2000/11/03");
			Date horaNac = Convertidor.convertirHora("14:30");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(796.50));
			p.setNumeroHijos(3);
			p.setEstatura(1.60);
			AdminPersonas.actualizar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}

	}

}
