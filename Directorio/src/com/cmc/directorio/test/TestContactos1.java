package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		AdminContactos buscar = new AdminContactos();
		Telefono telf = new Telefono("Movi", "0923912123", 20);
		Contacto c = new Contacto("Juan", "Ignacio", telf, 14.2);
		System.out.println("Contacto");
		System.out.println("Nombre: " + c.getNombre() + " Apellido: " + c.getApellido() + " Telefono: "
				+ telf.getNumero() + " Operadora: " + telf.getOperadora() + " Código: " + telf.getCodigo() + " Peso: "
				+ c.getPeso()+" Tiene Whatsapp: "+telf.isTieneWhatsapp());
		
		Telefono telf1 = new Telefono("Movi", "0923912123", 10);
		Contacto c1 = new Contacto("Pepe", "Díaz", telf1, 10.2);
		System.out.println("Contacto");
		System.out.println("Nombre: " + c1.getNombre() + " Apellido: " + c1.getApellido() + " Telefono: "
				+ telf1.getNumero() + " Operadora: " + telf1.getOperadora() + " Código: " + telf1.getCodigo()+ " Peso: "
						+ c.getPeso()+" Tiene Whatsapp: "+telf.isTieneWhatsapp());
		System.out.println("El mas pesado es: "+buscar.buscarMasPesado(c1, c));
		System.out.println(buscar.comprarOperadora(telf, telf1));
		
		
	}
}
