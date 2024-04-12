package com.krakedev.persistencias;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.utils.ConexionBDD;

public class ClientesBDD {
	public void insertar(Cliente cliente) throws KrakeDevException {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps = con
					.prepareStatement("INSERT INTO clientes(cedula, nombre, numerohijos) VALUES (?, ?, ?)");

			ps.setString(1, cliente.getCedula());
			ps.setString(2, cliente.getNombre());
			ps.setInt(3, cliente.getNumeroHijos());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al insertar cliente. Detalle: " + e.getMessage());
		} catch (KrakeDevException e) {
			throw e;
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void actualizar(Cliente cliente) throws KrakeDevException {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps = con.prepareStatement("UPDATE clientes SET nombre=?, numerohijos=? WHERE cedula = ?");

			ps.setString(1, cliente.getNombre());
			ps.setInt(2, cliente.getNumeroHijos());
			ps.setString(3, cliente.getCedula());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al actualizar cliente. Detalle: " + e.getMessage());
		} catch (KrakeDevException e) {
			throw e;
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public ArrayList<Cliente> recuperarTodo() throws KrakeDevException {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("SELECT cedula, nombre, numerohijos FROM clientes");
			rs = ps.executeQuery();

			while (rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numerohijos");

				cliente = new Cliente(cedula, nombre, numeroHijos);
				clientes.add(cliente);
			}

		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al Consultar. Detalle: " + e.getMessage());
		}
		return clientes;
	}

	public Cliente buscarPorPK(String cedulaBusqueda) throws KrakeDevException {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("SELECT cedula, nombre, numerohijos FROM clientes WHERE cedula = ?");
			ps.setString(1, cedulaBusqueda);
			rs = ps.executeQuery();

			if (rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numerohijos");

				cliente = new Cliente(cedula, nombre, numeroHijos);

			}

		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al Consultar. Detalle: " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return cliente;
	}

	public ArrayList<Cliente> buscarPornumeroHijos(int numeroHijosB) throws KrakeDevException {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("SELECT cedula, nombre, numerohijos FROM clientes WHERE numerohijos >= ? ");
			ps.setInt(1, numeroHijosB);
			rs = ps.executeQuery();

			while (rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numerohijos = rs.getInt("numerohijos");

				cliente = new Cliente(cedula, nombre, numerohijos);
				clientes.add(cliente);
			}
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al Consultar. Detalle: " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
		return clientes;
	}
}
