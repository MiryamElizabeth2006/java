package com.krakedev.evaluacion.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
@Path("funciones")
public class ServiciosCategoria {
	@Path("probarInsertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Categoria categoria) {
		System.out.println("********" + categoria);
		HistorialBDD cli = new HistorialBDD();
		try {
			cli.insertar(categoria);
			return Response.ok().build();

		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();

		}
	}
}

