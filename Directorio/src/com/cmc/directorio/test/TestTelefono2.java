package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf2 = new Telefono("movi", "098234234", 20);
		telf2.setOperadora("Movi");
		telf2.setNumero("098234234");
		telf2.setCodigo(20);

		System.out.println("Operado: " + telf2.getOperadora() + " Numero: " + telf2.getNumero() + " Código: "
				+ telf2.getCodigo() + " Tiene Whatsapp: " + telf2.isTieneWhatsapp());

		Telefono AdminTelefono = new Telefono("movi", "098234234", 20);
		AdminTelefono = telf2;
		AdminTelefono.isTieneWhatsapp();

		AdminTelefono at = new AdminTelefono();
		at.ActivarMensajeria(telf2);
		
		System.out.println("Operado: " + telf2.getOperadora() + " Numero: " + telf2.getNumero() + " Código: "
				+ telf2.getCodigo() + " Tiene Whatsapp: " + telf2.isTieneWhatsapp());

	}

}
