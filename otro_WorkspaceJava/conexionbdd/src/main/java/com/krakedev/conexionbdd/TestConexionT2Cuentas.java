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

public class TestConexionT2Cuentas {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","basedatoseli2006");
			System.out.println("Conexion exitosa");
			
			
			
			ps = connection.prepareStatement("insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)"
					+ "values (?,?,?,?)");
			ps.setString(1, "00001");
			ps.setString(2, "17556");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr = "2016/11/11/";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechamilis = fecha.getTime();
				System.out.println(fechamilis);
				
				//CREA un ajva.sql.Date, partiendo de un java.util.Date
				
				java.sql.Date fechaSQL = new java.sql.Date(fechamilis);
				System.out.println(fechaSQL);
				
				//Time timeSQL = new Time(fechamilis);
				//System.out.println(timeSQL);
				
				ps.setDate(3, fechaSQL);
				ps.setBigDecimal(4, new BigDecimal(200.50));
				
				ps.executeUpdate();
				System.out.println("Ejecutar EL INSERT Realizado Cuentas");
				
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			
		
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
	}

