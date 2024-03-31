package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Cuenta;
import com.krakedev.persistencia.servicios.AdminCuentas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminCuentas {

	public static void main(String[] args) {
		
		Date fechaCreacion;
		try {
			fechaCreacion = Convertidor.convertirFecha("2021/11/15");
			Cuenta cue = new Cuenta("00003", "45876", fechaCreacion, new BigDecimal(12.50));
			AdminCuentas.insertarC(cue);
		} catch (Exception e) {
			System.out.println("Error en el sistema " + e.getMessage());
		}
		
		
	}

}
