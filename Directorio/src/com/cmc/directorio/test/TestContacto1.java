package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "0923912123", 20);
		Contacto c = new Contacto("Juan", "Ignacio", telf, 14.2);
		System.out.println("Contacto");
		System.out.println("Nombre: " + c.getNombre() + " Apellido: " + c.getApellido() + " Telefono: " + telf.getNumero()
				+ " Operadora: " + telf.getOperadora()+" Código: "+telf.getCodigo()+" Peso: " + c.getPeso());
	}

}
