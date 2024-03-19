package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class testTelefono4 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("Movi", "0985741263", 20);
		Telefono t2 = new Telefono("Claro", "5454545455", 12);
		Telefono t3 = new Telefono("Claro", "0945131233", 35);
		Telefono t4 = new Telefono("Claro", "0974565465", 8);
		
		AdminTelefono comprobar = new AdminTelefono();
		AdminTelefono contar = new AdminTelefono();
		
		int conteo = contar.contarClaro(t1.getOperadora(), t2.getOperadora(), t3.getOperadora(), t4.getOperadora());
		

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
		
		System.out.println("***********TELEFONO 4************");
		System.out.println("Operadora: "+t4.getOperadora());
		System.out.println("Número: "+t4.getNumero());
		System.out.println("Código: "+t4.getCodigo());
		System.out.println("¿tieneWhatsapp? ");
		comprobar.activarMensajeria(t4.getNumero());
		System.out.println("----------------------------------");
		System.out.println("  ");
		System.out.println("Telefonos totales que tienen la operadora Claro: "+conteo);
	}

}
