package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class testEstudiante {

	public static void main(String[] args) {
		
		Estudiante nota1 = new Estudiante("Jhon");
		
		System.out.println("********Estudiante 1**********");
		nota1.Calificar(10);
		System.out.println("Nombre: "+nota1.getNombre());
		System.out.println("Nota: "+nota1.getNota());
		System.out.println("Aprobación: "+ nota1.getResultado());
		
		Estudiante nota2 = new Estudiante("Julieta");
		
		System.out.println("********Estudiante 2**********");
		nota2.Calificar(7);
		System.out.println("Nombre: "+nota2.getNombre());
		System.out.println("Nota: "+nota2.getNota());
		System.out.println("Aprobación: "+ nota2.getResultado());
		
	}

}
