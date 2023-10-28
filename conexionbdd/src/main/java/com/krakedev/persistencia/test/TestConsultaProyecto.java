package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.servicios.AdminProyecto;

public class TestConsultaProyecto {

	public static void main(String[] args) {
		try {
			Proyecto proyecto = AdminProyecto.buscarPorId(3);
			System.out.println(proyecto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
