package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void incrementarPrecio (int incremento) {
		double precioIncrementado = precio + (precio*incremento/100);
		setPrecio(precioIncrementado);
	}
	
	public void disminuirPrecio(double descuento) {
		double precioDisminuido = precio - descuento;
		setPrecio(precioDisminuido);
	}
	public Producto(String codigo, String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	
}
