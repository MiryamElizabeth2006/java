package com.krakedev.estaticos.ejercicos.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicos.entidades.Alarma;
import com.krakedev.estaticos.ejercicos.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicos.utils.DiasSemana;
import com.krakedev.estaticos.ejercicos.utils.Util;

public class TestAlarmas {

	public static void main(String[] args) {
		//V1
		int valor1H = Util.formatearHora(2);
		String valor1D= Util.formatearDia(0);
		
		//V2
		int valor2H = Util.formatearHora(11);
		String valor2D= Util.formatearDia(6);
				
	//V3
		int valor3H = Util.formatearHora(7);
		String valor3D= Util.formatearDia(3);

		Alarma a1= new Alarma(valor1D,valor1H,42);
		Alarma a2= new Alarma(valor2D,valor2H,30);
		Alarma a3= new Alarma(valor3D,valor3H,10);

		
		AdminAlarmas admin= new AdminAlarmas();
		admin.agregarAlarma(a1);
		admin.agregarAlarma(a2);
		admin.agregarAlarma(a3);
		
		
		ArrayList<Alarma> alarmasActuales = admin.getAlarmas();
		System.out.println(alarmasActuales);
		
	}

}
