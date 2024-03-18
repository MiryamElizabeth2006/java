package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class testValidacion {

	public static void main(String[] args) {
		Validacion validacion1 = new Validacion();

		validacion1.validarMonto(10);
		validacion1.validarMonto(-2);
	}

}
