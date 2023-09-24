package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		double areaR1;
		double areaR2;
		double peri1;
		double peri2;
		
		r1.setBase(10);
		r1.setAltura(5);
		r1.setBase1(3);
		r1.setAltura1(9);
		
		r2.setBase(8);
		r2.setAltura(5);
		r2.setBase1(4);
		r2.setAltura1(7);
		
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
