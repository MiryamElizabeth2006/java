package com.krakedev.estaticos.ejercicos.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicos.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> alarmas = new ArrayList<Alarma>();
	
	public void agregarAlarma(Alarma alarma) {
		alarmas.add(alarma);	
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
}