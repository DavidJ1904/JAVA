package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private Date fehaModificacion;
	private ArrayList<Contacto> contacto;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		contacto = new ArrayList<Contacto>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();

	}
	public boolean agregarContacto(Contacto buscarContacto) {
		Date fehaModificacion = new Date();
		boolean agregar = true;
		for (int i = 0; i < contacto.size(); i++) {
			if (contacto.get(i).getCedula().equals(buscarContacto.getCedula())) {
				agregar = false;
			}
		}
		if (agregar) {
			contacto.add(buscarContacto);
			this.fehaModificacion = fehaModificacion;
		}
		return agregar;
	}
	public Contacto buscarPorCedula(String cedula) {

		Contacto elementoEncontrado = null;
		for (int i = 0; i < contacto.size(); i++) {
			if (contacto.get(i).getCedula().equals(cedula)) {
				elementoEncontrado = contacto.get(i);
			}
		}
		return elementoEncontrado;
	}
	public String consultarUltimaModificacion() {
		SimpleDateFormat consultar = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
		return consultar.format(fehaModificacion);

	}
	public int contarPerdidos() {
		int contador = 0;
		for (int i = 0; i < contacto.size(); i++) {
			if (contacto.get(i).getDireccion() == null) {
				contador += +1;
			}
		}
		return contador;
	}
	public int contarFijos() {
		int contador = 0;
		Contacto c = null;
		Telefono t;
		for (int i = 0; i < contacto.size(); i++) {
			c = contacto.get(i);
			for (int i1 = 0; i1 < c.getTelefono().size(); i1++) {
				t = c.getTelefono().get(i1);
				if (t.getTipo().equalsIgnoreCase("convencional") && t.getEstado().equalsIgnoreCase("c")) {
					contador += 1;
				}
			}
		}
		return contador;
	}
	public void depurar() {
		
		boolean agregar = true;
		for (int i = 0; i < contacto.size(); i++) {
			if (contacto.get(i).getDireccion() == null) {
				agregar= false;
			}
			if(!agregar) {
				correctos.add(contacto.get(i));
			}
		}
		
		
		boolean agregar2 = true;
		for (int i1 = 0; i1 < contacto.size(); i1++) {
			if (contacto.get(i1).getDireccion() == null) {
				agregar2= false;
			}
			if(agregar2) {
				incorrectos.add(contacto.get(i1));
			}
		}
		
			contacto.clear();
	}

	// METODO GETTERS AND SETTERS
	public Date getFehaModificacion() {
		return fehaModificacion;
	}

	public void setFehaModificacion(Date fehaModificacion) {
		this.fehaModificacion = fehaModificacion;
		
	}

	public ArrayList<Contacto> getContacto() {
		return contacto;
	}

	public void setContacto(ArrayList<Contacto> contacto) {
		this.contacto = contacto;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

}
