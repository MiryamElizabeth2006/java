package krakedev.test;

import krakedev.entidades.CursoN;
import krakedev.entidades.EstudianteN;
import krakedev.entidades.MateriaN;
import krakedev.entidades.NotaN;

public class TestCursoN {

	public static void main(String[] args) {
		 CursoN curso1 = new CursoN();
		 MateriaN sociales= new MateriaN("COD1", "Sociales");
		 MateriaN matematicas= new MateriaN("COD2", "Matematicas");
		 MateriaN lenguaje= new MateriaN("COD3", "Lenguaje");

		 EstudianteN estudiante = new EstudianteN("1234567890", "Juan", "Perez");
		 EstudianteN estudiante2 = new EstudianteN("12345678290", "Juan", "Perez");
	     NotaN nota1 = new NotaN(sociales, 10.0);
	     NotaN nota2 = new NotaN(matematicas, 10.0);
	     NotaN nota3 = new NotaN(lenguaje, 10.0);
	     
	     
	     NotaN nota11 = new NotaN(sociales,5.0);
	     NotaN nota12 = new NotaN(matematicas, 5.0);
	     NotaN nota13 = new NotaN(lenguaje, 10.0);
	     
	     //Agrega 3 nuevas calificaciones  a Estudiante 1
	     estudiante.agregarNota(nota1);
	     estudiante.agregarNota(nota2);
	     estudiante.agregarNota(nota3);

	     
	     //Agrega 3 nuevas calificaciones  a Estudiante 2
	     estudiante2.agregarNota(nota11);
	     estudiante2.agregarNota(nota12);
	     estudiante2.agregarNota(nota13);

	     
	    
	     
	     curso1.matricularEstudiantes(estudiante);
	     curso1.matricularEstudiantes(estudiante2);
	     
	     System.out.println(curso1.getEstudiante().size());
	     
	     System.out.println(curso1.calcularPromedioCurso());

	     
	     curso1.mostrar();
}
	}


