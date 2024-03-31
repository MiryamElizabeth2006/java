package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.servicios.AdminTransacciones;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarTransacciones {

	public static void main(String[] args) {
		Date fecha;
		Date hora;

		try{
			fecha = Convertidor.convertirFecha("2001/08/01");
			hora = Convertidor.convertirHora("11:36");

			Transacciones trcc = new Transacciones(1002, "22003", new BigDecimal(9000.30), "D", fecha, hora);
			AdminTransacciones.actualizarT(trcc);

		}catch(
		Exception e)
		{
			System.out.println("Error en el sistema " + e.getMessage());
		}

	}

}
