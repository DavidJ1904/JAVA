package com.krakedev.herencia;

public class Gato extends Animal {
	@Override
	public void dormir () {
		super.dormir();
		System.out.println("El gato esta durmiendo");
	}

	public void maullar() {
		System.out.println("Gato maullando");
	}
	public void maullar(String nombre) {
		System.out.println("El gato de " +nombre+ " esta maullando");
	}
}
