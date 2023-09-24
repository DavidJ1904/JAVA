package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto("Mercedez");
		Auto auto2 = new Auto("Mazda");
		Auto auto3 = new Auto("Chevrolet");
		Auto auto4 = new Auto("Hundai");
		
		System.out.println(auto3.getMarca());
		System.out.println(auto4.getMarca());
		
		//Auto1
		System.out.println("marca:"+auto1.getMarca());
		System.out.println("anio:"+auto1.getAnio());
		System.out.println("precio:"+auto1.getPrecio());
		System.out.println("-----------------------");
		//Auto2
		System.out.println("marca:"+auto2.getMarca());
		System.out.println("anio:"+auto2.getAnio());
		System.out.println("precio:"+auto2.getPrecio());
		//Atributos auto1
		auto1.setMarca("Mercedes");
		auto1.setAnio(2004);
		auto1.setPrecio(1422);
		//Atributos auto2
		auto2.setMarca("Mazda");
		auto2.setAnio(2002);
		auto2.setPrecio(1822);
		System.out.println("-----------------------");
		//NuevosAtributos auto1
		System.out.println("marca:"+auto1.getMarca());
		System.out.println("anio:"+auto1.getAnio());
		System.out.println("precio:"+auto1.getPrecio());
		System.out.println("-----------------------");
		//NuevosAtriv=butos auto2
		System.out.println("marca:"+auto2.getMarca());
		System.out.println("anio:"+auto2.getAnio());
		System.out.println("precio:"+auto2.getPrecio());
	}

}
