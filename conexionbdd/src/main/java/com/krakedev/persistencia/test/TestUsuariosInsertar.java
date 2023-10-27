package com.krakedev.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.Usuarios;
import com.krakedev.persistencia.servicios.AdminUsuarios;
import com.krakedev.persistencia.utils.Convertidor;

public class TestUsuariosInsertar {

	public static void main(String[] args) {
		Usuarios u = new Usuarios(10,"Max","Ronaldo");
		try {
			Date fechaNac = Convertidor.convertirFecha("1995/05/13");
			u.setFechaNacimiento(fechaNac);
			AdminUsuarios.insertar(u);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
		
	}

}
