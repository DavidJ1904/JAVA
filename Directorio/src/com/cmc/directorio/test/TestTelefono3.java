package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		int cell;
		AdminTelefono buscar = new AdminTelefono();
		Telefono telf=new Telefono("movi", "0923912123", 20);
		Telefono telf2=new Telefono("claro", "0923942123", 30);
		Telefono telf3=new Telefono("movi", "0912391212", 10);
		Telefono telf4=new Telefono("claro", "0912391212", 10);
		Telefono telf5=new Telefono("movi", "0912391212", 10);
		Telefono telf6=new Telefono("claro", "0912391212", 10);
		cell=buscar.buscarMovi(telf, telf2, telf3);
		System.out.println("Numero de operadores movi: "+ cell);
		cell=buscar.buscarClaro(telf, telf2, telf3, telf4, telf5, telf6);
		System.out.println("Numero de operadores claro: "+ cell);
	}

}
