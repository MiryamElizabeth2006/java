package krakedev.entidades;

import java.util.ArrayList;

public class CursoN {
private ArrayList<EstudianteN> estudiante = new ArrayList<EstudianteN>();
	

	public ArrayList<EstudianteN> getEstudiante() {
		return estudiante;
	}

	public String buscarEstudiantePorCedula(EstudianteN estudiantes) {
		String mensaje=null;
		if(estudiante.size()>0) {
			for(EstudianteN buscarEstudiantes: estudiante) {
				if(buscarEstudiantes.getCedula().equals(estudiantes.getCedula())) {
					mensaje="Ya existe un estuidante";
				}
			}
		}
		return mensaje;
	}

	public void matricularEstudiantes(EstudianteN estudiantes) {
		String mensaje = buscarEstudiantePorCedula(estudiantes);
		if(mensaje==null) {
			estudiante.add(estudiantes);
		} else {
			System.out.println(mensaje);
		}
		
	}

	public double calcularPromedioCurso() {
		double total = 0.0;
		double promedioC;
		for(EstudianteN estudiante1 :estudiante) {
			total += estudiante1.calcularPromedioNotasEstudiante();
		}
		
		promedioC = total / estudiante.size();
		
		return promedioC;
	}
	
	public void mostrar() {
		for (EstudianteN informacion :estudiante) {
			informacion.mostrar();
		}
		
	}
}
