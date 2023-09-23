package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;
	public int base1;
	public int altura1;
	
	public int calcularArea(){
		int area=base*altura;
		return area;
	}
	public double calcularPerimetro(){
		double peri=base+base1+altura+altura1;
		return peri;
	}

}
