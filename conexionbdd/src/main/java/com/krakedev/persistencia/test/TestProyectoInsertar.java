package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.servicios.AdminProyecto;
import com.krakedev.persistencia.utils.Convertidor;

public class TestProyectoInsertar {

	public static void main(String[] args) {
		Proyecto p = new Proyecto(3,"Proyecto Cuenca",new BigDecimal(10000000.34));
		try {
			Date fechaIni = Convertidor.convertirFecha("2004/07/20");
			Date fechaEnt = Convertidor.convertirFecha("2012/12/12");
			p.setFechaInicio(fechaIni);
			p.setFechaEntrega(fechaEnt);
			AdminProyecto.insertar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
		
	}

}
