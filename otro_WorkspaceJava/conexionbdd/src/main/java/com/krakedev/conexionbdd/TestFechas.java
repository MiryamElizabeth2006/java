package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
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
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
