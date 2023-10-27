package com.krakedev.persistencia.test;


import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		try {
			String cedula = "1727154561";
			AdminPersonas.eliminar(cedula);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}

}