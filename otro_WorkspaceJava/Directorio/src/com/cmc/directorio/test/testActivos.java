package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class testActivos {

	public static void main(String[] args) {
		Telefono tlf = new Telefono("Movi", "0987451623", 14);
		Contacto ctc = new Contacto("Jhonny", "Deep", tlf, 58);
		AdminTelefono at = new AdminTelefono();
		AdminContactos what = new AdminContactos();
		
		
		System.out.println("Nombre: "+ctc.getNombre()+" "+ctc.getApellido());
		System.out.println("Peso: "+ctc.getPeso()+" Kg");
		System.out.println(" ");
		System.out.println("INFORMACION SOBRE EL TELEFONO");
		System.out.println("Telefono: "+tlf.getNumero());
		System.out.println("Operadora: "+tlf.getOperadora());
		System.out.println("Código: "+tlf.getCodigo());
		System.out.println("¿Tiene Whatsapp?");
		at.activarMensajeria(tlf.getOperadora());
		System.out.println(" ");
		//Indica si esta en true o false el activo
		what.activarUsuario(tlf.getOperadora());

	}

}
