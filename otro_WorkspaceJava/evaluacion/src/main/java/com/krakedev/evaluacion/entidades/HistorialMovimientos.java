package com.krakedev.evaluacion.entidades;
import java.util.Date;

public class HistorialMovimientos {
	private int idMovimientos;
	private Productos idProducto;
	private int cantidad;
	private Date fechaMovimiento;
	
	public HistorialMovimientos(int idMovimientos, Productos idProducto, int cantidad, Date fechaMovimiento) {
		super();
		this.idMovimientos = idMovimientos;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.fechaMovimiento = fechaMovimiento;
	}
	
	public HistorialMovimientos() {}
	
	public  int getIdMovimiento() {
		return idMovimientos;
	}
	
	public void setIdMovimiento(int idMovimientos) {
		this.idMovimientos = idMovimientos;
	}
	public Productos getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Productos idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}
	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}

	@Override
	public String toString() {
		return "HistorialMovimientos [idMovimientos=" + idMovimientos + ", idProducto=" + idProducto + ", cantidad="
				+ cantidad + ", fechaMovimiento=" + fechaMovimiento + "]";
	}
	
}
