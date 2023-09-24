package com.krakedev.demon.test;

import com.krakedev.demon.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto produc1 = new Producto(912,"Manzana");
		produc1.setDescripcion("Es una fruta de color rojo, crece en los arboles");
		produc1.setPeso(12.3);
		
		System.out.println("Producto: "+produc1.getNombre());
		System.out.println("Codigo: "+produc1.getCodigo());
		System.out.println("Descripcion: "+produc1.getDescripcion());
		System.out.println("Peso: "+produc1.getPeso());
	}

}
