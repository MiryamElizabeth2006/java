package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class testContacto1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("Movi", "0987451269", 10);
		Contacto c = new Contacto("Leonel","Cuenca", telf, 45.2);
		
		System.out.println("Nombre: "+c.getNombre()+" "+c.getApellido());
		System.out.println("Peso: "+c.getPeso()+" Kg");
		System.out.println(" ");
		System.out.println("INFORMACION SOBRE EL TELEFONO");
		System.out.println("Telefono: "+telf.getNumero());
		System.out.println("Operadora: "+telf.getOperadora());
		System.out.println("Código: "+telf.getCodigo());

	}

}
