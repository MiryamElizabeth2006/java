package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Cuenta;
import com.krakedev.persistencia.servicios.AdminCuentas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarCuentas {

	public static void main(String[] args) {
		Date fechaCreacion;
		try {
			fechaCreacion = Convertidor.convertirFecha("2022/03/15");
			Cuenta c = new Cuenta("00002", "19874", fechaCreacion, new BigDecimal(80000.30));
			AdminCuentas.actualizarC(c);
		} catch (Exception e) {
			System.out.println("Error en el sistema " + e.getMessage());
		}

	}

}
