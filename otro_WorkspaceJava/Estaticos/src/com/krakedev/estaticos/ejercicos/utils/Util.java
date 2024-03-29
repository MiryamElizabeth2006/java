 
 
package com.krakedev.estaticos.ejercicos.utils;

public class Util {
	public static int formatearHora(int hora) {
		int valor = hora;
		return valor;
	}
	
	public static String formatearDia(int dia) {
		String valorD = null;
		if(dia == 0) {
			 valorD = "Lunes";
		}else if (dia == 1) {
			valorD = "Martes";
		}else if (dia == 2) {
			valorD = "Miercoles";
		}else if (dia == 3) {
			valorD = "Jueves";
		}else if (dia == 4) {
			valorD = "Viernes";
		}else if (dia == 5) {
			valorD = "Sábado";
		}else if (dia == 6) {
			valorD = "Domingo";
		}
		
		return valorD;
	}
}
