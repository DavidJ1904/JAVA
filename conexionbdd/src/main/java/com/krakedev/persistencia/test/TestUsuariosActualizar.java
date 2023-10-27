package com.krakedev.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.Usuarios;
import com.krakedev.persistencia.servicios.AdminUsuarios;
import com.krakedev.persistencia.utils.Convertidor;

public class TestUsuariosActualizar {

	public static void main(String[] args) {
		Usuarios u = new Usuarios(10,"Felipe","Caicedo");
		try {
			Date fechaNac = Convertidor.convertirFecha("2015/09/12");
			u.setFechaNacimiento(fechaNac);
			AdminUsuarios.actualizar(u);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
		
	}

}
