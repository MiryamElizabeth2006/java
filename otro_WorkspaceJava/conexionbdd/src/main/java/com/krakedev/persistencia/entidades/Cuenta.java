package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Cuenta {
	private String numeroCuenta;
	private String cedulaPropietario;
	private Date fechaCreacion;
	private BigDecimal saldo;
	
	public Cuenta() {}
	
	public Cuenta(String numeroCuenta, String cedulaPropietario, Date fechaCreacion, BigDecimal saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.cedulaPropietario = cedulaPropietario;
		this.fechaCreacion = fechaCreacion;
		this.saldo = saldo;
	}
	
	

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", cedulaPropietario=" + cedulaPropietario + ", fechaCreacion="
				+ fechaCreacion + ", saldo=" + saldo + "]";
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getCedulaPropietario() {
		return cedulaPropietario;
	}

	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	
}
