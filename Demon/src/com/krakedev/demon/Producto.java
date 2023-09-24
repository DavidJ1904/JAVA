package com.krakedev.demon;

public class Producto {
	private int codigo;
	private String nombre;
	private String descripcion;
	private double Peso;
	
	public Producto (int codigo, String nombre){
		this.codigo=codigo;
		this.nombre=nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	
	
	
}
