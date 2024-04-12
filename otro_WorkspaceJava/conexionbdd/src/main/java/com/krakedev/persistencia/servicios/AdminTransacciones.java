package com.krakedev.persistencia.servicios;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.Time;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminTransacciones {
	private static final Logger LOGGER = LogManager.getLogger(AdminTransacciones.class);

	public static void insertarT(Transacciones transaccion) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Transaccion a insertar>>> " + transaccion);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();

			// preparedStament
			ps = con.prepareStatement(
					"insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)"
							+ "values (?,?,?,?,?,?)");
			ps.setInt(1, transaccion.getCodigo());
			ps.setString(2, transaccion.getNumeroCuenta());
			ps.setBigDecimal(3, transaccion.getMonto());
			ps.setString(4, transaccion.getTipo());
			ps.setDate(5, new java.sql.Date(transaccion.getFecha().getTime()));
			ps.setTime(6, new Time(transaccion.getHora().getTime()));
			

			ps.executeUpdate();

		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al Insertar en BDD Transacciones", e);
			throw new Exception("Error al Insertar en BDD Transacciones");

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

	public static void actualizarT(Transacciones transaccion) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"UPDATE transacciones set numero_cuenta = ?,monto = ?,tipo = ?,fecha = ?,hora = ? WHERE codigo=?");

			ps.setString(1, transaccion.getNumeroCuenta());
			ps.setBigDecimal(2, transaccion.getMonto());
			ps.setString(3, transaccion.getTipo());
			ps.setDate(4, new java.sql.Date(transaccion.getFecha().getTime()));
			ps.setTime(5, new Time(transaccion.getHora().getTime()));
			ps.setInt(6, transaccion.getCodigo());
			
			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al actualizar BDD Transacciones", e);
			throw new Exception("Error al actualizar BDD Transacciones");
		} finally {
			try {
				con.close();
			}catch(SQLException e) {
				LOGGER.error("Error en la base de Datos",e);
				throw new Exception("Error en la base de Datos");
			}
			
		}

	}

	public static void eliminarT(int codigo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"DELETE from transacciones WHERE codigo = ?");
			
			ps.setInt(1, codigo);
			ps.executeUpdate();
			
		} catch (Exception e) {
			LOGGER.error("Error al Eliminar BDD Transacciones",e);
			throw new Exception("Error al Eliminar BDD Transacciones");
		}finally {
			try {
				con.close();
			}catch(SQLException e) {
				LOGGER.error("Error en la base de Datos",e);
				throw new Exception("Error en la base de Datos");
			}
			
		}
}
}
