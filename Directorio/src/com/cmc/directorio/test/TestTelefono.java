package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("Movi", "09941234123", 10);
		telf.setOperadora("Movi");
		telf.setNumero("09941234123");
		telf.setCodigo(10);
		
		System.out.println("Operado: "+telf.getOperadora()+ " Numero: "+telf.getNumero()+" Código: "+telf.getCodigo());
	}

}
