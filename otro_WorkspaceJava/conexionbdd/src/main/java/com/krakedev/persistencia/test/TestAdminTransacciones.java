package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.servicios.AdminTransacciones;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminTransacciones {

	public static void main(String[] args) {
		Date fecha;
		Date hora;
		try {
			fecha = Convertidor.convertirFecha("2002/11/03");
			hora = Convertidor.convertirHora("14:30");

			Transacciones trcc = new Transacciones(1002, "22003", new BigDecimal(455.30), "C", fecha, hora);
			AdminTransacciones.insertarT(trcc);

		} catch (Exception e) {
			System.out.println("Error en el sistema " + e.getMessage());
		}

	}

}
