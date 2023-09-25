package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item objeto1 = new Item();
		Item objeto2 = new Item();
		
		objeto1.nombre=("Paracetamol");
		objeto1.productosActuales=20;
		
		objeto1.imprimir();
		
		
		objeto1.devolver(8);
		objeto1.vender(2);
		System.out.println("////////////////////");
		
		objeto2.nombre=("Vitamina C");
		objeto2.productosActuales=20;
		
		objeto2.imprimir();
		objeto2.devolver(8);
		objeto2.vender(10);
		
	}

}
