package com.cmc.repaso.entidades;

public class Validacion {
	public boolean validarMonto (int monto) {
		if (monto > 0) {
			System.out.println("Monto Corecto");
			return true;
		}else {
			System.out.println("Monto Incorecto");
			return false;
		}
	}
	
}
