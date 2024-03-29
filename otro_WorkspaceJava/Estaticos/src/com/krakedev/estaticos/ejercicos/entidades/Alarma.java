package com.krakedev.estaticos.ejercicos.entidades;

public class Alarma {
	private String dia;
	private int hora;
	private int minuto;
	
	public Alarma(String dia, int hora, int minuto) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}

	

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	@Override
	public String toString() {
		String alr = null;
		if(hora<10) {
			return alr = "Alarma [" + dia + ", " + "0" + hora + ":" + minuto + "]";
		}else if(hora >= 10) {
			return alr = "Alarma [" + dia + ", " + hora + ":" + minuto + "]";
		}
		return alr;
	}
	
	
}
