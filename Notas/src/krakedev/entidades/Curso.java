package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Curso() {
		this.estudiantes = new ArrayList<Estudiante>();
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		if (buscarEstudiantePorCedula(estudiante.getCedula()) == null) {
			estudiantes.add(estudiante);
		}
	}
	
	public String buscarEstudiantePorCedula(String cedulaEstudiante) {
		Estudiante cedulaEncontrada;
		for (int i = 0; i < estudiantes.size(); i++) {
			cedulaEncontrada = estudiantes.get(i);
			if (cedulaEncontrada.getCedula() == cedulaEstudiante) {
				return ("Estudiante Registrado");
			}
		}
		return null;
	}

	public double calcularPromedioCurso() {
		double total = 0;
		double promedio = 0;
		Estudiante notasEncontradas;
		for (int i = 0; i < estudiantes.size(); i++) {
			notasEncontradas = estudiantes.get(i);
			total = promedio + notasEncontradas.calcularPromedioNotasEstudiante();
		}
		promedio = total / estudiantes.size();
		return promedio;
	}

	public void mostrar() {
		System.out.println("Estudiantes revisados="+estudiantes.size()+" Promedio curso="+calcularPromedioCurso());
	}
}
