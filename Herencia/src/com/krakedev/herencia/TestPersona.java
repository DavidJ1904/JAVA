package com.krakedev.herencia;

public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona("1722909321","David");
		
		System.out.println("Hola");
		System.out.println(p);//p.toString 
		System.out.println(p.toString());
		
		Cuenta c = new Cuenta("0921390",132);
		System.out.println(c);
	}
	

}
