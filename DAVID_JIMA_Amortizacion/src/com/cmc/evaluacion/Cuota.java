package com.cmc.evaluacion;

public class Cuota {
	private int numero;
	private double cuota;
	private double capital;
	private double inicio;
	private double interes;
	private double abonoCapital;
	private double saldo;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = Math.round(cuota * 100.0) / 100.0;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = Math.round(capital * 100.0) / 100.0;
	}

	public double getInicio() {
		return inicio;
	}

	public void setInicio(double inicio) {
		this.inicio = inicio;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = Math.round(interes * 100.0) / 100.0;
	}

	public double getAbonoCapital() {
		return abonoCapital;
	}

	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = Math.round(abonoCapital * 100.0) / 100.0;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = Math.round(saldo * 100.0) / 100.0;
	}
	
	public Cuota(int numero) {
		this.numero = numero;
	}
	
	public void mostrarPrestamo() {
		System.out.println(numero+" | "+getCuota()+" | "+getCapital()+" | "+getInteres()+" | "+getAbonoCapital()+" | "+getSaldo());
	}
	
}
