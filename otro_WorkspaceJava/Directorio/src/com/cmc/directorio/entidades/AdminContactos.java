package com.cmc.directorio.entidades;

public class AdminContactos {
	public boolean buscarMasPesado(double ctc1, double ctc2) {
		boolean pesado = false;
		if(ctc1 > ctc2) {
			pesado = true;
		}else if(ctc2 > ctc1) {
			pesado = false;
		}
		return pesado;
	}
	
	public boolean compararOperadoras(String ctc1, String ctc2) {
		
		if (ctc1 == ctc2) {
			return true;
		}else {
			return false;
		}
	}
	public void activarUsuario(String ctc1) {
		boolean activo = false;
		if(ctc1 == "Movi") {
			activo = true;
			System.out.println("WHATSSAPP ACTIVO");
		}else {
			activo = false;
			System.out.println("WHATSSAPP INACTIVO");
		}
	}
}
