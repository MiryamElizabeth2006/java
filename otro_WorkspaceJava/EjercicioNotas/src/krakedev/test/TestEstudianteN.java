package krakedev.test;

import krakedev.entidades.EstudianteN;
import krakedev.entidades.MateriaN;
import krakedev.entidades.NotaN;

public class TestEstudianteN {

	public static void main(String[] args) {
		 EstudianteN estudiante = new EstudianteN("1234567890", "Juan2", "Perez");
		 EstudianteN estudiante2 = new EstudianteN("1234567890", "Juan", "Perez");
		 MateriaN ciencias= new MateriaN("3", "Ciencias");
		 MateriaN matematicas= new MateriaN("2", "Matematicas");
		 
		 NotaN nuevaNota = new NotaN(ciencias,9.0);
		 NotaN nuevaNota2 = new NotaN(ciencias, 9.0);
		 NotaN nuevaNota3 = new NotaN(matematicas,2.0);
		 NotaN nuevaNota4 = new NotaN(matematicas,-8.0);
	   
	     estudiante.agregarNota(nuevaNota);
	     //No deberia dejar ingresar esta nota ya que la calificacion esta duplicada.
	     estudiante.agregarNota(nuevaNota2);
	     //No deberia dejar ingresar esta nota ya que la calificacion es menor a 0.
	     estudiante.agregarNota(nuevaNota3);
	     estudiante.agregarNota(nuevaNota4);
	     
	     estudiante.modificarNota("3", 10.00);
	     //No deberia dejar modificar esta nota ya que la calificacion es menor a 0.
	     estudiante.modificarNota("3", -1);
	     System.out.println( estudiante.calcularPromedioNotasEstudiante());
	     
	     
	     estudiante.mostrar();
	     
	     
	}

	}


