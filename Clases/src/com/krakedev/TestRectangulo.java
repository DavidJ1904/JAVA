package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		int areaR1;
		int areaR2;
		double peri1;
		double peri2;
		
		r1.base=10;
		r1.altura=5;
		r1.base1=3;
		r1.altura1=9;
		
		r2.base=8;
		r2.altura=5;
		r2.base1=4;
		r2.altura1=7;
		
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
