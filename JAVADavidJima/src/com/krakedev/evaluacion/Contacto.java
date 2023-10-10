package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefono;
	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		telefono = new ArrayList<Telefono>();
	}
	public Contacto() {
		telefono = new ArrayList<Telefono>();
	}
	public void imprimir() {
		System.out.println("Cedula: " + cedula);
		System.out.println("Nombre " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Direccion");
		System.out.println("    Calle Principal: " + direccion.getCallePrincipal());
		System.out.println("    Calle Secundaria: " + direccion.getCalleSecundaria());
	}
	public void agregarTelefono(Telefono telefono) {
		this.telefono.add(telefono);
	}
	public void mostrarTelefonos() {
		System.out.println("Telefonos con estado 'C'");
		for (int i = 0; i < telefono.size(); i++) {
			if (telefono.get(i).getEstado().equalsIgnoreCase("c")) {
				System.out.println("Numero: " + telefono.get(i).getNumero() + " , Tipo: " + telefono.get(i).getTipo());
			}
		}

	}
	public ArrayList<Telefono> recuperarIncorrectos(){
		ArrayList<Telefono> incorrectos = new ArrayList<Telefono>();
		for(int i=0; i<telefono.size();i++) {
			if(telefono.get(i).getEstado().equals("E")) {
				incorrectos.add(telefono.get(i));
			}
		}
		return incorrectos;
	}
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefono() {
		return telefono;
	}

	public void setTelefono(ArrayList<Telefono> telefono) {
		this.telefono = telefono;
	}

}