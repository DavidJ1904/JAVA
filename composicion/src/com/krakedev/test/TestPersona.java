package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Ramiro");
		p1.setApellido("Meneses");
		
		Direccion dir=new Direccion();
		dir.setCallePrincipal("Av siempre viva");
		dir.setCalleSecundaria("La que cruza");
		dir.setNumero("N-47");
		p1.setDireccion(dir);		
		
		String nombre = p1.getNombre();
		Direccion d1 = p1.getDireccion();

		System.out.println("Nombre: "+nombre);
		//d1 esta en null y trato de invocar un metodo con esa variable
		System.out.println(d1.getCallePrincipal());
		               // null.algunMetodo();
		p1.imprimir();
		
		Persona p2=new Persona();
		Direccion d2=new Direccion("Av shyris","Eloy Alfaro","S/N");
		p2.setNombre("Anastasia");
		p2.setDireccion(d2);
		
		p2.imprimir();
		
		Persona p3 =new Persona();
		p3.setDireccion(new Direccion("xx","yy","123"));
		
		p3.imprimir();
		
		System.out.println("Fin");
	}

}
