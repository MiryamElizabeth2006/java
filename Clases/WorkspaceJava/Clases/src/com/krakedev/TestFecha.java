package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha();
		Fecha fecha2 = new Fecha(2020,12,5);
		Fecha fecha3 = new Fecha(2010,6,12);
		
		
		fecha1.setAnio(2000);
		fecha1.setMes(12);
		fecha1.setDia(12);
		
		System.out.println("Fecha 1");
		System.out.println("AÑO: "+fecha1.getAnio());
		System.out.println("MES:"+fecha1.getMes() );
		System.out.println("DÍA: "+fecha1.getDia());
		System.out.println("------------------------");
		
		System.out.println("Fecha 2");
		System.out.println("AÑO: "+fecha2.getAnio());
		System.out.println("MES:"+fecha2.getMes() );
		System.out.println("DÍA: "+fecha2.getDia());
		System.out.println("------------------------");
		
		System.out.println("Fecha 3");
		System.out.println("AÑO: "+fecha3.getAnio());
		System.out.println("MES:"+fecha3.getMes() );
		System.out.println("DÍA: "+fecha3.getDia());
		System.out.println("------------------------");
	}

}
