package com.krakedev.conexionbdd;

import java.math.BigDecimal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","basedatoseli2006");
			System.out.println("Conexion exitosa");
			
			ps = connection.prepareStatement("insert into personas (cedula,nombre,apellido,numero_hijos,estado_civil,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
					+ "values (?,?,?,?,?,?,?,?,?)");
			ps.setString(1, "1745127874");
			ps.setString(2, "Elizabeth");
			ps.setString(3, "Nono");
			ps.setInt(4, 4);
			ps.setString(5, "U");
			ps.setDouble(6, 1.56);
			ps.setBigDecimal(7, new BigDecimal(1200.34));
			
			//Date - java.util.Date
			//Date - java.util.Date

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:05:04";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechamilis = fecha.getTime();
				System.out.println(fechamilis);
				//CREA un ajva.sql.Date, partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechamilis);
				System.out.println(fechaSQL);
				
				Time timeSQL = new Time(fechamilis);
				System.out.println(timeSQL);
				
				ps.setDate(8, fechaSQL);
				ps.setTime(9, timeSQL);
				
				ps.executeUpdate();
				System.out.println("Ejecutar insert");
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
