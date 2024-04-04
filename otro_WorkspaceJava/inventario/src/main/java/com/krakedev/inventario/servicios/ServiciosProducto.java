package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path ("productos")
public class ServiciosProducto {
	@Path ("insertar")
	@POST
	@Consumes (MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println(producto);
	}
	
	@Path ("actualizar")
	@PUT
	@Consumes (MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println(producto);
	}
	
	@Path ("recuperar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public static ArrayList<Producto> recuperarTodo() {
		Categoria c1 = new Categoria(001,"Jamon");
		Producto p1 = new Producto("001", "Jamón", c1, 5.26,20 );
		
		Categoria c2 = new Categoria(002,"Pollo");
		Producto p2 = new Producto("002", "Pollo", c2, 5.26,20 );
		
		Categoria c3 = new Categoria(003,"Carne de res");
		Producto p3 = new Producto("003", "Carne de res", c3, 5.26,20 );
		
		ArrayList<Producto> productos =  new ArrayList<Producto>();
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		
		return productos;
	}
}
