package com.cmc.repaso.entidades;

public class Item {
	public String nombre;
	public double productosActuales;
	public double productosDevueltos;
	public double productosVendidos;
	
	public void imprimir() {
		System.out.println("Nombre: "+nombre);
	}
	
	public void vender (double productosVendidos) {
		this.productosVendidos=productosVendidos;
		this.productosActuales=productosActuales-productosVendidos;
		System.out.println("Productos Actuales: "+productosActuales);
		System.out.println("Productos Vendidos: "+productosVendidos);
		
	}
	
	
	
	public void devolver (double productosDevueltos) {
		this.productosDevueltos=productosDevueltos;
		this.productosActuales=productosDevueltos+productosActuales;
		System.out.println("Productos Devueltos: "+productosDevueltos);
	}
}
