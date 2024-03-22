package krakedev.entidades;

public class NotaN {
	private MateriaN materia;
	private double calificacion;
	
	

	public NotaN(MateriaN materia, double calificacion) {
		super();
		this.materia = materia;
		this.calificacion = calificacion;
	}

	public void mostrar() {
		System.out.println("Materia: " + materia.getNombre()+", Calificacion: "+calificacion);
	}

	public MateriaN getMateria() {
		return materia;
	}

	public void setMateria(MateriaN materia) {
		this.materia = materia;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
}
