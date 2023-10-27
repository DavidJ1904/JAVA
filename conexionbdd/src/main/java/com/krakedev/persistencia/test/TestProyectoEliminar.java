package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminProyecto;

public class TestProyectoEliminar {

	public static void main(String[] args) {
		try {
			int id = 3;
			AdminProyecto.eliminar(id);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}

}
