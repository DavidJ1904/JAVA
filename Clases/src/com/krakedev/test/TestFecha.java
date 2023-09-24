package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1 =new Fecha(01);
		Fecha fecha2 = new Fecha(10);
		Fecha fecha3 = new Fecha(04);
		
		System.out.println(fecha2.getMes());
		System.out.println(fecha3.getMes());
		
		fecha1.setAnio(2000);
		fecha1.setMes(12);
		fecha1.setDía(12);
		
		System.out.println(fecha1.getAnio());
		System.out.println(fecha1.getMes());
		System.out.println(fecha1.getDía());
	}

}
