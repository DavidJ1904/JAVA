package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		AdminTelefono validar=new AdminTelefono();
		AdminContactos activar=new AdminContactos();
		Telefono telf = new Telefono("Movi", "0923789223", 89);
		Contacto c = new Contacto("Felipe", "Fernandez", telf, 10);
		System.out.println("Contacto");
		System.out.println("Nombre: " + c.getNombre() + " Apellido: " + c.getApellido() + " Telefono: "
				+ telf.getNumero() + " Operadora: " + telf.getOperadora() + " Código: " + telf.getCodigo() + " Peso: "
				+ c.getPeso()+" Tiene Whatsapp: "+telf.isTieneWhatsapp());
		validar.ActivarMensajeria(telf);
		activar.activarUsuario(c);
	}
}
