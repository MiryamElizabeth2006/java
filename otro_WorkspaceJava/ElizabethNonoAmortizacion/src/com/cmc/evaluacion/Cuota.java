package com.cmc.evaluacion;

public class Cuota {
	private int numero;
	private double cuota;
	private double capital;
	private double inicio;
	private double interes;
	private double abonoCapital;
	private double saldo;
	
	public Cuota(int numero) {
		this.numero = numero;
	}
	
	public void mostrarPrestamo() {
	    System.out.printf("  %3d   | %7.2f | %7.2f | %7.2f | %7.2f | %7.2f%n", 
	        this.numero, 
	        Utilitarios.redondear(this.cuota), 
	        Utilitarios.redondear(this.inicio), 
	        Utilitarios.redondear(this.interes), 
	        Utilitarios.redondear(this.abonoCapital), 
	        Utilitarios.redondear(this.saldo));
	}
	
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getInicio() {
		return inicio;
	}
	public void setInicio(double inicio) {
		this.inicio = inicio;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
