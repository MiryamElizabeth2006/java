package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class testTelefono2 {

	public static void main(String[] args) {
		
		Telefono telf = new Telefono("Movi", "098234234", 20);
		Telefono telf2= new Telefono("Claro", "098179201", 5);
		
		AdminTelefono at = new AdminTelefono();
		
		System.out.println("----------DATOS DE TELEFONO 1----------");
		System.out.println("Operadora: "+telf.getOperadora());
		System.out.println("Número:"+telf.getNumero());
		System.out.println("Código: "+telf.getCodigo());
		System.out.println("¿Tiene Whatsapp?");
		at.activarMensajeria(telf.getOperadora());
		
		System.out.println(" ");
		System.out.println("----------DATOS DE TELEFONO 2----------");
		System.out.println("Operadora: "+telf2.getOperadora());
		System.out.println("Número: "+telf2.getNumero());
		System.out.println("Código: "+telf2.getCodigo());
		System.out.println("¿Tiene Whatsapp?");
		 at.activarMensajeria(telf2.getOperadora());
		}

}
