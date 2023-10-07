package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.notas=new ArrayList<Nota>();
	}
	
	public void agregarNota(Nota nota) {
		if (nota.getCalificacion() >= 0 && nota.getCalificacion() <= 10) {
			boolean ingresar = true;
			for (int i = 0; i < notas.size(); i++) {
				if (notas.get(i).getMateria() == nota.getMateria()) {
					ingresar = false;
				}
			}
			if (ingresar) {
				notas.add(nota);
			}
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		Nota codigoEncontrado;
		if (nuevaNota >= 0 && nuevaNota <= 10) {
			for (int i = 0; i < notas.size(); i++) {
				codigoEncontrado = notas.get(i);
				if (codigoEncontrado.getMateria().getCodigo() == codigo) {
					codigoEncontrado.setCalificacion(nuevaNota);
				}
			}
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double total = 0;
		double promedio;
		for (int i = 0; i < notas.size(); i++) {
			total = total + notas.get(i).getCalificacion();
		}
		promedio = total / notas.size();
		return promedio;
	}

	public void mostrar() {
		System.out.println("Nombre=" + getNombre() + ", Apellido=" + getApellido() + ", Cedula=" + getCedula()
				+ ", promedio=" + calcularPromedioNotasEstudiante());
	}
}
