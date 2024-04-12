package com.krakedev.evaluacion.entidades;

import java.math.BigDecimal;

public class Productos {
	private String idProductos;
	private String nombre;
	private BigDecimal precioVenta;
	private BigDecimal precioCompra;
	private Categoria idCategorias;

	public Productos(String idProductos, String nombre, BigDecimal precioVenta, BigDecimal precioCompra,
			Categoria idCategorias) {
		super();
		this.idProductos = idProductos;
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
		this.idCategorias = idCategorias;
	}
	
	public Productos() {}

	public String getIdProductos() {
		return idProductos;
	}

	public void setIdProductos(String idProductos) {
		this.idProductos = idProductos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Categoria getIdCategorias() {
		return idCategorias;
	}

	public void setIdCategorias(Categoria idCategorias) {
		this.idCategorias = idCategorias;
	}

	@Override
	public String toString() {
		return "Productos [idProductos=" + idProductos + ", nombre=" + nombre + ", precioVenta=" + precioVenta
				+ ", precioCompra=" + precioCompra + ", idCategorias=" + idCategorias + "]";
	}

}
