package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class testTelefono3 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("Movi", "0974851263", 001);
		Telefono t2 = new Telefono("Claro", "0841572385", 002);
		Telefono t3 = new Telefono("Movi", "0974542632", 003);
		
		AdminTelefono comprobar = new AdminTelefono();
		AdminTelefono contar = new AdminTelefono();
		
		int conteo = contar.contarMovi(t1.getOperadora(), t2.getOperadora(), t3.getOperadora());
		
		
		System.out.println("***********TELEFONO 1************");
		System.out.println("Operadora: "+t1.getOperadora());
		System.out.println("Número: "+t1.getNumero());
		System.out.println("Código: "+t1.getCodigo());
		System.out.println("¿tieneWhatsapp? ");
		comprobar.activarMensajeria(t1.getOperadora());
		System.out.println("----------------------------------");
		System.out.println("  ");
		
		System.out.println("***********TELEFONO 2************");
		System.out.println("Operadora: "+t2.getOperadora());
		System.out.println("Número: "+t2.getNumero());
		System.out.println("Código: "+t2.getCodigo());
		System.out.println("¿tieneWhatsapp? ");
		comprobar.activarMensajeria(t2.getOperadora());
		System.out.println("----------------------------------");
		System.out.println("  ");
		
		System.out.println("***********TELEFONO 3************");
		System.out.println("Operadora: "+t3.getOperadora());
		System.out.println("Número: "+t3.getNumero());
		System.out.println("Código: "+t3.getCodigo());
		System.out.println("¿tieneWhatsapp? ");
		comprobar.activarMensajeria(t3.getNumero());
		System.out.println("----------------------------------");
		System.out.println("  ");
		System.out.println("Telefonos totales que tienen la operadora Movistar: "+conteo);
	}

}
