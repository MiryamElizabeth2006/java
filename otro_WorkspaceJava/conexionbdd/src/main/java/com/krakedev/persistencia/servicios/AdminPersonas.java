package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();

			// preparedStament
			ps = con.prepareStatement(
					"insert into personas (cedula,nombre,apellido,numero_hijos,estado_civil,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
							+ "values (?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setInt(4, persona.getNumeroHijos());
			ps.setString(5, persona.getEstadoCivil().getCodigo());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));

			ps.executeUpdate();

		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al Insertar", e);
			throw new Exception("Error al Insertar");

		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de Datos");
			}

		}
	}

	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"UPDATE personas set nombre =?,apellido=?,numero_hijos=?,estado_civil=?,estatura=?,cantidad_ahorrada=?,fecha_nacimiento = ?,hora_nacimiento = ? WHERE cedula=?");

			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setInt(3, persona.getNumeroHijos());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.setString(9, persona.getCedula());

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				con.close();
			}catch(SQLException e) {
				LOGGER.error("Error en la base de Datos",e);
				throw new Exception("Error en la base de Datos");
			}
			
		}

	}

	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"DELETE from personas WHERE cedula = ?");
			
			ps.setString(1, cedula);
			ps.executeUpdate();
			
		} catch (Exception e) {
			LOGGER.error("Error al Eliminar",e);
			throw new Exception("Error al Eliminar");
		}finally {
			try {
				con.close();
			}catch(SQLException e) {
				LOGGER.error("Error en la base de Datos",e);
				throw new Exception("Error en la base de Datos");
			}
			
		}
	}
	
	//Buscar POR NOMBRE RETORNA Lista de Personas
	
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception{
		ArrayList<Persona> personas= new ArrayList<Persona>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("Select * from personas WHERE nombre LIKE ?");
			ps.setString(1, "%"+nombreBusqueda+"%");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				String apellido = rs.getString("apellido");
				//EstadoCivil estadoCivil =rs.getEstadoCivil("estado_civil");
				int numeroHijos = rs.getInt("numero_hijos");
				double estatura = rs.getDouble("estatura");
				BigDecimal cantidadAhorrada = rs.getBigDecimal("cantidad_ahorrada");
				Date fechaNacimiento = rs.getDate("fecha_nacimiento");
				Date horaNacimiento = rs.getTime("hora_nacimiento");
				
				Persona p = new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				p.setApellido(apellido);
				//p.setEstadoCivil(estadoCivil);
				p.setNumeroHijos(numeroHijos);
				p.setEstatura(estatura);
				p.setCantidadAhorrada(cantidadAhorrada);
				p.setFechaNacimiento(fechaNacimiento);
				p.setHoraNacimiento(horaNacimiento);
				personas.add(p);
				
				System.out.println(cantidadAhorrada);
			}
			
		} catch (Exception e) {
			LOGGER.trace("No se encontro", e);
			throw  new Exception("No se encontro");
		}finally {
			try {
				con.close();
			}catch(SQLException e) {
				LOGGER.error("Error en la base de Datos",e);
				throw new Exception("Error en la base de Datos");
			}
			
		}
		
		return personas;
	}
	
	//Buscar por Cedula retorna Una Persona
	
	public static Persona buscarPorCedula(String cedula) throws Exception {	
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Persona p = new Persona();
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("Select * from personas WHERE cedula = ?");
			ps.setString(1, cedula);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				String nombre = rs.getString("nombre");
				String cedulaP = rs.getString("cedula");
				String apellido = rs.getString("apellido");
				String estadoCivil = rs.getString("estado_civil");
				int numeroHijos = rs.getInt("numero_hijos");
				double estatura = rs.getDouble("estatura");
				//BigDecimal cantidadAhorrada = rs.getBigDecimal("cantidad_ahorrada");
				Date fechaNacimiento = rs.getDate("fecha_nacimiento");
				Date horaNacimiento = rs.getTime("hora_nacimiento");
				
				
				p = new Persona();
				EstadoCivil es = new EstadoCivil(estadoCivil);
				es.getCodigo();	
				p.setCedula(cedulaP);
				p.setNombre(nombre);
				p.setApellido(apellido);
				p.setEstadoCivil(es);
				p.setNumeroHijos(numeroHijos);
				p.setEstatura(estatura);
				//p.setCantidadAhorrada(cantidadAhorrada);
				p.setFechaNacimiento(fechaNacimiento);
				p.setHoraNacimiento(horaNacimiento);
			
			}else {
				return null;
			}
			
		} catch (Exception e) {
			LOGGER.error("No se encontro",e);
			throw new Exception("No se encontro");
		}finally {
			try {
				con.close();
			}catch(SQLException e) {
				LOGGER.error("Error en la base de Datos",e);
				throw new Exception("Error en la base de Datos");
			}
			
		}

		return p;
	}
	
}
