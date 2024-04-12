package com.krakedev.evaluacion.servicios;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.krakedev.evaluacion.persistencia.TestConexionBDD;

@Path("bases")
public class ServiciosConexion {
	
	@Path("probarConexion")
	@POST
	public void probarConn() {
		TestConexionBDD cli = new TestConexionBDD();
		cli.crearConexion();
	}
}
