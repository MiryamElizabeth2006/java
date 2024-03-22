package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	
	//Imprimir para otros
	  public void imprimir() {
	  System.out.println("Información del Contacto:");
	  System.out.println("Cedula: " + cedula);
	  System.out.println("Nombre: " + nombre+" "+apellido); 
	  System.out.println("Dirección: ");
	  System.out.println("Calle Principal: " + direccion.getCallePrincipal());
	  System.out.println("Calle Secundaria: "+ direccion.getCalleSecundaria()); }
	  
	  
	  //IMPRIMIR PARA TestContactos2
	/*public void imprimir() {
		if (this.direccion != null) {
			System.out.println("***" + nombre + " " + apellido + "***");
			System.out.println(
					"Direccion; " + " " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
		} else {
			System.out.println("***" + nombre + " " + apellido + "***");
			System.out.println("No tiene asociada una direccion");
		}
	}*/
	  
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTelefonos() {
		System.out.println("Teléfonos con estado 'C':");
		for (Telefono telefono : telefonos) {
			if (telefono.getEstado().equals("C")) {
				System.out.println("Número: " + telefono.getNumero() + ", Tipo: " + telefono.getTipo());
			}
		}
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telefonosIncorrectos = new ArrayList<>();
		for (Telefono telefono : telefonos) {
			if (telefono.getEstado().equals("E")) {
				telefonosIncorrectos.add(telefono);
			}
		}
		return telefonosIncorrectos;
	}
}
 