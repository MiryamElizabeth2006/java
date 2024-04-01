package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Inicio");
		String a = "ddddd";
		try{
			System.out.println("ABRE LA CONEXIÓN BDD");
			a.substring(3);
			System.out.println("Fin");
		}catch(Exception ex) {
			System.out.println("Entra al catch");
		}finally {
			System.out.println("Ingresa al finally");
			System.out.println("CIERRA LA CONEXION BDD");
		}
	
		System.out.println("fuera del catch");

	}

}
