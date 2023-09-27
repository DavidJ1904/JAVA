package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class AdminContactos {
	public double buscarMasPesado(Contacto c, Contacto c2) {
		double masPesado = 0;
		if (c.getPeso() > c2.getPeso()) {
			masPesado = c.getPeso();
		}
		if (c2.getPeso() > c.getPeso()) {
			masPesado = c2.getPeso();
		}
		return masPesado;
	}

	public boolean comprarOperadora (Telefono cont, Telefono cont2) {
		if(cont.getOperadora()== cont2.getOperadora()) {
			return true;
		} else {
			return false;
		}
}
	public void activarUsuario (Contacto cont) {
		if(cont.getTelefono().isTieneWhatsapp()==true) {
			cont.setActivo(true);
		}
		
	}

}
