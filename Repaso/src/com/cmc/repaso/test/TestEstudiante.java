package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante alumno1 = new Estudiante("Pepe");
		alumno1.setNota(8);
		System.out.println("Nombre: "+alumno1.getNombre());
		System.out.println("Nota: "+alumno1.getNota());
		alumno1.calificar(alumno1.getNota());
		
	}

}
