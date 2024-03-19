package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class testTelefono {

	public static void main(String[] args) {
		Telefono telf = new Telefono("Movi", "09941234123", 10);
		
		System.out.println("-----------DATOS DE TELEFONO 1-------------");
		System.out.println("Operadora: "+telf.getOperadora());
		System.out.println("Telefono: "+telf.getNumero());
		System.out.println("Código: "+telf.getCodigo());
	}

}
