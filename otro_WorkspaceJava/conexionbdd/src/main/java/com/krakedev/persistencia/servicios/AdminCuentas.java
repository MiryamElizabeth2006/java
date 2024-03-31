package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Cuenta;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminCuentas {
	private static final Logger LOGGER = LogManager.getLogger(AdminCuentas.class);

	public static void insertarC(Cuenta cuenta) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Cuenta a insertar>>> " + cuenta);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();

			// preparedStament
			ps = con.prepareStatement(
					"insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)" 
							+ "values (?,?,?,?)");

			ps.setString(1, cuenta.getNumeroCuenta());
			ps.setString(2, cuenta.getCedulaPropietario());
			ps.setDate(3, new java.sql.Date(cuenta.getFechaCreacion().getTime()));
			ps.setBigDecimal(4, cuenta.getSaldo());

			ps.executeUpdate();

		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al Insertar en BDD Cuentas", e);
			throw new Exception("Error al Insertar en BDD Cuentas");

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

	public static void actualizarC(Cuenta cuenta) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"UPDATE cuentas set cedula_propietario = ?,fecha_creacion = ?,saldo = ? WHERE numero_cuenta = ?");
			
			ps.setString(1, cuenta.getCedulaPropietario());
			ps.setDate(2, new java.sql.Date(cuenta.getFechaCreacion().getTime()));
			ps.setBigDecimal(3, cuenta.getSaldo());
			ps.setString(4, cuenta.getNumeroCuenta());

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de Datos", e);
				throw new Exception("Error en la base de Datos");
			}

		}

	}

	public static void eliminarC(String numeroCuenta) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("DELETE from cuentas WHERE  numero_cuenta = ?");

			ps.setString(1, numeroCuenta);
			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al Eliminar en BDD Cuentas", e);
			throw new Exception("Error al Eliminar en BDD Cuentas");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de Datos", e);
				throw new Exception("Error en la base de Datos");
			}

		}
	}
}
