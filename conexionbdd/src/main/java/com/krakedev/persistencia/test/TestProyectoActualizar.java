package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.servicios.AdminProyecto;
import com.krakedev.persistencia.utils.Convertidor;

public class TestProyectoActualizar {

	public static void main(String[] args) {
		Proyecto p = new Proyecto(3,"Proyecto Quit",new BigDecimal(9500000.00));
		try {
			Date fechaIni = Convertidor.convertirFecha("2014/09/10");
			Date fechaEnt = Convertidor.convertirFecha("2020/10/22");
			p.setFechaInicio(fechaIni);
			p.setFechaEntrega(fechaEnt);
			AdminProyecto.actualizar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
		
	}

}
