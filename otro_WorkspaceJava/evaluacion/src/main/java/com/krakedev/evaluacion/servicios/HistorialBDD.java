package com.krakedev.evaluacion.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;


public class HistorialBDD {
	public void insertar(Categoria categoria) throws KrakeException {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps = con.prepareStatement("INSERT INTO categorias (id_categoria, nombre) VALUES (?, ?)");

			ps.setString(1, categoria.getIdCategoria());
			ps.setString(2, categoria.getNombre());
			
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al insertar Categoria. Detalle: " + e.getMessage());
		} catch (KrakeException e) {
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
	
	public void actualizar(Categoria categoria) throws KrakeException {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps = con.prepareStatement("UPDATE categorias SET nombre=? WHERE id_categoria = ?");

			ps.setString(1, categoria.getNombre());
			ps.setString(2, categoria.getIdCategoria());
			

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al actualizar Categorias. Detalle: " + e.getMessage());
		} catch (KrakeException e) {
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
	
	
	public Categoria buscarPorId(String idCategoria) throws KrakeException {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Categoria categoria = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("SELECT id_categoria, nombre FROM categorias WHERE id_categoria = ?");
			ps.setString(1, idCategoria);
			rs = ps.executeQuery();

			if (rs.next()) {
				String idCategorias = rs.getString("id_categoria");
				String nombre = rs.getString("nombre");
			
				categoria = new Categoria(idCategorias, nombre);

			}

		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al Consultar por Id. Detalle: " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return categoria;
	}
	
	
	public ArrayList<Categoria> recuperarTodos() throws KrakeException {
		ArrayList<Categoria> categorias = new ArrayList<Categoria>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Categoria categoria = null;

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("SELECT id_categoria, nombre FROM categorias");
			rs = ps.executeQuery();

			while (rs.next()) {
				String idCategorias = rs.getString("id_categoria");
				String nombre = rs.getString("nombre");

				categoria = new Categoria(idCategorias, nombre);
				categorias.add(categoria);
			}

		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al Consultar Todo. Detalle: " + e.getMessage());
		}
		return categorias;
	}
}
