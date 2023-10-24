package com.krakedev.estatico.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estatico.ejercicio.entidades.Alarma;
import com.krakedev.estatico.ejercicio.logica.AdminAlarmas;
import com.krakedev.estatico.ejercicio.utils.DiasSemana;

public class TestAlarma {

	public static void main(String[] args) {
		Alarma a = new Alarma(DiasSemana.LUNES,13,25);
		Alarma a1 = new Alarma(DiasSemana.MARTES,16,46);
		Alarma a2 = new Alarma(DiasSemana.MIERCOLES,14,00);
		Alarma a3 = new Alarma(DiasSemana.JUEVES,10,30);
		Alarma a4 = new Alarma(DiasSemana.VIERNES,11,30);
		Alarma a5 = new Alarma(DiasSemana.SABADO,03,32);
		Alarma a6 = new Alarma(DiasSemana.DOMINGO,10,46);
		AdminAlarmas ag = new AdminAlarmas();
		ag.agregarAlarma(a);
		ag.agregarAlarma(a1);
		ag.agregarAlarma(a2);
		ag.agregarAlarma(a3);
		ag.agregarAlarma(a4);
		ag.agregarAlarma(a5);
		ag.agregarAlarma(a6);
		
		ArrayList<Alarma> alarmasActuales = ag.getAlarma();
		for(int i=0;i<alarmasActuales.size();i++) {
			System.out.println(alarmasActuales.get(i));
		}
	}

}
