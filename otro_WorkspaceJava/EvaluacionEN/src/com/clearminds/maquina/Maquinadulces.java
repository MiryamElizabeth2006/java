package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class Maquinadulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		celda1 = new Celda(codigoCelda1);
		celda2 = new Celda(codigoCelda2);
		celda3 = new Celda(codigoCelda3);
		celda4 = new Celda(codigoCelda4);
	}

	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: " + celda1.getCodigo());
		System.out.println("CELDA 2: " + celda2.getCodigo());
		System.out.println("CELDA 3: " + celda3.getCodigo());
		System.out.println("CELDA 4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigoCelda) {
		Celda encontrada = null;
		if (this.celda1.getCodigo().equals(codigoCelda)) {
			encontrada = this.celda1;
		} else if (this.celda2.getCodigo().equals(codigoCelda)) {
			encontrada = this.celda2;
		} else if (this.celda3.getCodigo().equals(codigoCelda)) {
			encontrada = this.celda3;
		} else if (this.celda4.getCodigo().equals(codigoCelda)) {
			encontrada = this.celda4;
		}
		return encontrada;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidadInicial) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidadInicial);
		} else {
			System.out.println("Error");
		}
	}

	public void mostrarProductos() {
		Producto p1 = celda1.getProducto();
		Producto p2 = celda2.getProducto();
		Producto p3 = celda3.getProducto();
		Producto p4 = celda4.getProducto();

		// Producto 1
		System.out.println("**********Celda: " + celda1.getCodigo());

		if (celda1 != null && p1 != null) {
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("Nombre: " + p1.getNombre());
			System.out.println("Precio: " + p1.getPrecio());
			System.out.println("Código: " + p1.getCodigo());
		} else {
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("La celda no tiene producto!!!");
		}

		// Producto2
		System.out.println("**********Celda: " + celda2.getCodigo());

		if (celda1 != null && p2 != null) {
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("Nombre: " + p2.getNombre());
			System.out.println("Precio: " + p2.getPrecio());
			System.out.println("Código: " + p2.getCodigo());
		} else {
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("La celda no tiene producto!!!");
		}

		// Producto3
		System.out.println("**********Celda: " + celda3.getCodigo());

		if (celda1 != null && p3 != null) {
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("Nombre: " + p3.getNombre());
			System.out.println("Precio: " + p3.getPrecio());
			System.out.println("Código: " + p3.getCodigo());
		} else {
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("La celda no tiene producto!!!");
		}

		// Producto4
		System.out.println("**********Celda: " + celda4.getCodigo());

		if (celda1 != null && p4 != null) {
			System.out.println("Stock: " + celda4.getStock());
			System.out.println("Nombre: " + p4.getNombre());
			System.out.println("Precio: " + p4.getPrecio());
			System.out.println("Código: " + p4.getCodigo());
		} else {
			System.out.println("Stock: " + celda4.getStock());
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println(" ");
		System.out.println("Saldo: " + getSaldo());

	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		Producto productoEncontrado = null;
		if (celdaRecuperada != null) {
			return productoEncontrado = celdaRecuperada.getProducto();
		} else {
			return productoEncontrado;
		}
	}

	public double consultarPrecio(String codigoCelda) {
		Producto productoEncontrado = buscarProductoEnCelda(codigoCelda);
		double precio = 0.0;
		if (productoEncontrado != null) {
			precio = productoEncontrado.getPrecio();
		}
		return precio;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1 != null && celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
			return celda1;
		}
		if (celda2 != null && celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
			return celda2;
		}
		if (celda3 != null && celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
			return celda3;
		}
		if (celda4 != null && celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto)) {
			return celda4;
		}

		return null;
	}

	public void incrementarProductos(String codigoProducto, int cantidadItemsIncrementar) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada != null) {
			int unStock = celdaEncontrada.getStock();
			unStock = unStock + cantidadItemsIncrementar;
			celdaEncontrada.setStock(unStock);
		}

	}

	public void vender(String codigoCelda) {
		int stockBajo;
		// celda1
		if (codigoCelda == celda1.getCodigo()) {
			stockBajo = celda1.getStock() - 1;
			celda1.setStock(stockBajo);
			Celda celdaAVender = buscarCelda(codigoCelda);
			if (celdaAVender != null) {
				Producto productoVenta = celdaAVender.getProducto();
				double precioVenta = productoVenta.getPrecio();
				this.saldo += precioVenta;
			}
		}
		// celda2
		if (codigoCelda == celda2.getCodigo()) {
			stockBajo = celda2.getStock() - 1;
			celda2.setStock(stockBajo);
			Celda celdaAVender = buscarCelda(codigoCelda);
			if (celdaAVender != null) {
				Producto productoVenta = celdaAVender.getProducto();
				double precioVenta = productoVenta.getPrecio();
				this.saldo += precioVenta;

			}
		}
		// celda3
		if (codigoCelda == celda3.getCodigo()) {
			stockBajo = celda3.getStock() - 1;
			celda3.setStock(stockBajo);
			Celda celdaAVender = buscarCelda(codigoCelda);
			if (celdaAVender != null) {
				Producto productoVenta = celdaAVender.getProducto();
				double precioVenta = productoVenta.getPrecio();
				this.saldo += precioVenta;

			}
		}
		// celda4
		if (codigoCelda == celda4.getCodigo()) {
			stockBajo = celda4.getStock() - 1;
			celda4.setStock(stockBajo);
			Celda celdaAVender = buscarCelda(codigoCelda);
			if (celdaAVender != null) {
				Producto productoVenta = celdaAVender.getProducto();
				double precioVenta = productoVenta.getPrecio();
				this.saldo += precioVenta;

			}
		}
	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {
		int stockNuevo;
		double cambio = 0.0;

		//celda1
		if (codigoCelda == celda1.getCodigo()) {
			stockNuevo = celda1.getStock() - 1;
			celda1.setStock(stockNuevo);
			Celda cambioVender = buscarCelda(codigoCelda);
			if (cambioVender != null) {

				Producto productoVenta = cambioVender.getProducto();
				double precioVenta = productoVenta.getPrecio();
				cambio = valorIngresado - precioVenta;
				this.saldo += precioVenta;
			}
		}
		//celda2
		if (codigoCelda == celda2.getCodigo()) {
			stockNuevo = celda2.getStock() - 1;
			celda2.setStock(stockNuevo);
			Celda cambioVender = buscarCelda(codigoCelda);
			if (cambioVender != null) {

				Producto productoVenta = cambioVender.getProducto();
				double precioVenta = productoVenta.getPrecio();
				cambio = valorIngresado - precioVenta;
				this.saldo += precioVenta;
			}

		}
		//celda3
		if (codigoCelda == celda3.getCodigo()) {
			stockNuevo = celda3.getStock() - 1;
			celda3.setStock(stockNuevo);
			Celda cambioVender = buscarCelda(codigoCelda);
			if (cambioVender != null) {

				Producto productoVenta = cambioVender.getProducto();
				double precioVenta = productoVenta.getPrecio();
				cambio = valorIngresado - precioVenta;
				this.saldo += precioVenta;
			}
		}
		//celda4
		if (codigoCelda == celda4.getCodigo()) {
			stockNuevo = celda4.getStock() - 1;
			celda4.setStock(stockNuevo);
			Celda cambioVender = buscarCelda(codigoCelda);
			if (cambioVender != null) {

				Producto productoVenta = cambioVender.getProducto();
				double precioVenta = productoVenta.getPrecio();
				cambio = valorIngresado - precioVenta;
				this.saldo += precioVenta;
			}
		}
		return cambio;
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
