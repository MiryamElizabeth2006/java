package com.krakedev.evaluacion.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
			throw new KrakeException("Error al insertar Historial de Movimientos. Detalle: " + e.getMessage());
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
}
