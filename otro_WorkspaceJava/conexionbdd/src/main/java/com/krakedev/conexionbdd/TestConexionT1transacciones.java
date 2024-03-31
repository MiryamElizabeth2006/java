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

public class TestConexionT1transacciones {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","basedatoseli2006");
			System.out.println("Conexion exitosa");
			
			ps = connection.prepareStatement("insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)"
					+ "values (?,?,?,?,?,?)");
			ps.setInt(1, 1001);
			ps.setString(2, "22002");
			ps.setBigDecimal(3, new BigDecimal(100.12));
			ps.setString(4, "C");
			
			//Date - java.util.Date
			//Date - java.util.Date

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2022/02/12 12:45:00";
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
				
				ps.setDate(5, fechaSQL);
				ps.setTime(6, timeSQL);
				
				ps.executeUpdate();
				System.out.println("Ejecutar EL INSERT Realizado");
				
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			
		
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
