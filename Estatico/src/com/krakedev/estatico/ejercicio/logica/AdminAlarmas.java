package com.krakedev.estatico.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estatico.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	
	private ArrayList<Alarma> alarma;
	
	public AdminAlarmas() {
		alarma = new ArrayList<Alarma>();
	}
	
	public void agregarAlarma(Alarma alarma) {
		this.alarma.add(alarma);
	}
	
	public ArrayList<Alarma> getAlarma() {
		return alarma;
	}

}