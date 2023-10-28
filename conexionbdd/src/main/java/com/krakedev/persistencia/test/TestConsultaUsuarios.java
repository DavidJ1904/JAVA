package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Usuarios;
import com.krakedev.persistencia.servicios.AdminUsuarios;

public interface TestConsultaUsuarios {
	public static void main(String[] args) {
		try {
			ArrayList<Usuarios> usuario =AdminUsuarios.buscarPorNombre("a");
			System.out.println(usuario);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
