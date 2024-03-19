package com.cmc.directorio.entidades;

public class AdminTelefono {
	boolean tieneWhatssapp = false;
	boolean contadorOperadora = false;

	public void activarMensajeria(String telefono) {
		if (telefono == "Movi") {
			tieneWhatssapp = true;
			System.out.println("Si tiene Whatssapp");
		} else {
			tieneWhatssapp = false;
			System.out.println("No tiene Whatssapp");
		}
	}

	public int contarClaro(String telf1, String telf2, String telf3, String telf4) {
		int contador = 0;

		if (telf1 == "Claro") {
			contadorOperadora = true;
			contador = contador + 1;
		}
		if (telf2 == "Claro") {
			contadorOperadora = true;
			contador = contador + 1;
		}
		if (telf3 == "Claro") {
			contadorOperadora = true;
			contador = contador + 1;
		}
		if (telf4 == "Claro") {
			contadorOperadora = true;
			contador = contador + 1;
		}
		return contador;
	}
	
	public int contarMovi(String telf1, String telf2, String telf3) {
		int contador = 0;

		if (telf1 == "Movi") {
			contadorOperadora = true;
			contador = contador + 1;
		}
		if (telf2 == "Movi") {
			contadorOperadora = true;
			contador = contador + 1;
		}
		if (telf3 == "Movi") {
			contadorOperadora = true;
			contador = contador + 1;
		}

		return contador;
	}
}
