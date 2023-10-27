package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminUsuarios;

public class TestUsuariosEliminar {

	public static void main(String[] args) {
		try {
			int id = 10;
			AdminUsuarios.eliminar(id);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}

}
