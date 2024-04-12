package com.krakedev.evaluacion.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Convertidor {
	private static final String FORMATO_FECHA = "yyyy/MM/dd"; 
	private static final String FORMATO_HORA = "hh:mm"; 
	
	public static Date convertirFecha (String fechaStr) throws Exception  {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate = null;
		try {
			fechaDate  = sdf.parse(fechaStr);
		} catch (ParseException e) {
			throw new Exception("La fecha no tiene el formato corecto "+ fechaStr); 
		} 
		return fechaDate;
	}
	
	public static Date convertirHora (String horaStr) throws Exception  {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);
		Date horaDate = null;
		try {
			horaDate  = sdf.parse(horaStr);
		} catch (ParseException e) {
			throw new Exception("La hora no tiene el formato corecto "+horaStr); 
		} 
		return horaDate;
	}
}
