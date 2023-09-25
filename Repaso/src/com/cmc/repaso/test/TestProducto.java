package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto product1 = new Producto("Sandia", 2);
		System.out.println("Nombre: " +product1.getNombre());
		System.out.println("Resultado: " + product1.calcularPrecioPromo(90));
		System.out.print(product1.setPrecio(-10));
	}

}
