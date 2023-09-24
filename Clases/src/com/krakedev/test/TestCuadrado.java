package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado r1 = new Cuadrado();
		Cuadrado r2 = new Cuadrado();
		
		double areaR1;
		double areaR2;
		double peri1;
		double peri2;
		
		r1.setLado(10);
		
		r2.setLado(8);
		
		areaR1=r1.calcularArea();
		areaR2=r2.calcularArea();
		
		peri1=r1.calcularPerimetro();
		peri2=r2.calcularPerimetro();
		
		System.out.println("Area de r1: "+areaR1);
		System.out.println("Area de r2: "+areaR2);
		
		System.out.println("Perimetro de r1: "+peri1);
		System.out.println("Perimetro de r2: "+peri2);

	}

}
