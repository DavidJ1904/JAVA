package com.krakedev;

public class Rectangulo {
	private double base;
	private double altura;
	private double base1;
	private double altura1;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase1() {
		return base1;
	}
	public void setBase1(double base1) {
		this.base1 = base1;
	}
	public double getAltura1() {
		return altura1;
	}
	public void setAltura1(double altura1) {
		this.altura1 = altura1;
	}
	
	public double calcularArea(){
		double area=base*altura;
		return area;
	}
	public double calcularPerimetro(){
		double peri=base+base1+altura+altura1;
		return peri;
	}
	

}
