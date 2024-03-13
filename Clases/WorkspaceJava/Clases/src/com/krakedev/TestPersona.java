package com.krakedev;

/*
 * comentartio de varias lineas
 * 
 * */
public class TestPersona {

	public static void main(String[] args) {
		Persona p; // 1.Declaro una variable llamada p de tipo Persona
		p = new Persona();	 // 2.Insatancio o creo un objeto Persona , y se referencia a p
		Persona p2 = new Persona();
		Persona p3 = new Persona ("Pablo");
		Persona p4 = new Persona("Rocio", 43, 1.60);
		
		System.out.println("nombre:" + p4.getNombre());
		System.out.println("edad:" + p4.getEdad());
		System.out.println("estatura:" + p4.getEstatura());

		// 3. Accedo a los atributos
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());

		// 4.Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);

		System.out.println("-------------------");

		// 5.Accedo a los atributos
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());

		p2.setNombre("Angelina");

		System.out.println("********");
		System.out.println("p.nombre:" + p.getNombre());
		System.out.println("p2.nombre:" + p2.getNombre());
	}

}
