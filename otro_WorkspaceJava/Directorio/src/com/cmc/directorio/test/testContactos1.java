package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class testContactos1 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("Movi", "0974323133", 15);
		Contacto c1 = new Contacto("Mía", "Colucci", t1, 48.2);
		
		Telefono t2 = new Telefono("Movi", "0316854566", 45);
		Contacto c2 = new Contacto("Rene", "Silva", t2, 65);
		
		AdminContactos prueba = new AdminContactos();
		
		String comparacion = null;
		String pesoR = null;
		boolean comparar = prueba.compararOperadoras(t1.getOperadora(), t2.getOperadora());
		if(comparar == true) {
			comparacion = "Son operadoras iguales";
		}else {
			comparacion = "No son operadoras iguales";
		}
		
		boolean peso = prueba.buscarMasPesado(c1.getPeso(), c2.getPeso());
		if(peso == true) {
			pesoR = "El peso del Contacto: "+c1.getNombre()+" "+c1.getApellido()+" "+"con su peso de: "+c1.getPeso()+" Kg "+ "es mucho más pesado"; 
		}else {
			pesoR = "El peso del Contacto: "+c2.getNombre()+" "+c2.getApellido()+" "+"con su peso de: "+c2.getPeso()+" kg "+ "es mucho más pesado"; 
		}
		
		System.out.println("***************Telefono 1******************");
		System.out.println("Nombre: "+c1.getNombre()+" "+c1.getApellido());
		System.out.println("Peso: "+c1.getPeso()+" Kg");
		System.out.println(" ");
		System.out.println("INFORMACION SOBRE EL TELEFONO");
		System.out.println("Telefono: "+t1.getNumero());
		System.out.println("Operadora: "+t1.getOperadora());
		System.out.println("Código: "+t1.getCodigo());
		System.out.println(" ");
		System.out.println("***************Telefono 2******************");
		System.out.println("Nombre: "+c2.getNombre()+" "+c2.getApellido());
		System.out.println("Peso: "+c2.getPeso()+" Kg");
		System.out.println(" ");
		System.out.println("INFORMACION SOBRE EL TELEFONO");
		System.out.println("Telefono: "+t2.getNumero());
		System.out.println("Operadora: "+t2.getOperadora());
		System.out.println("Código: "+t2.getCodigo());
		System.out.println(" ");
		System.out.println("----------------------------------------------");
		System.out.println(pesoR);
		System.out.println("Comparación: "+comparacion);
		
		
	}

}
