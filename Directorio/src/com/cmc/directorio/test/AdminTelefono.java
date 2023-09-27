package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class AdminTelefono {
	public void ActivarMensajeria(Telefono telf) {
		if(telf.getOperadora()=="movi") {
			telf.setTieneWhatsapp(true);
		}
	}
	public int buscarMovi(Telefono telf, Telefono telf2, Telefono telf3) {
		int contarMovi=0;
		if (telf.getOperadora()=="movi") {	
			contarMovi++;
		}
		if (telf2.getOperadora()=="movi") {
			contarMovi++;
		}
		if(telf3.getOperadora()=="movi") {
			contarMovi++;
		}
		return contarMovi;
	}
	
	public int buscarClaro(Telefono telf, Telefono telf2, Telefono telf3, Telefono telf4, Telefono telf5, Telefono telf6) {
		int contarClaro=0;
		if (telf.getOperadora()=="Claro") {	
			contarClaro++;
		}
		if (telf2.getOperadora()=="Claro") {
			contarClaro++;
		}
		if(telf3.getOperadora()=="Claro") {
			contarClaro++;
		}
		if(telf4.getOperadora()=="Claro") {
			contarClaro++;
		}
		if(telf5.getOperadora()=="Claro") {
			contarClaro++;
		}
		if(telf6.getOperadora()=="Claro") {
			contarClaro++;
		}
		return contarClaro;
	}
	
	
}
