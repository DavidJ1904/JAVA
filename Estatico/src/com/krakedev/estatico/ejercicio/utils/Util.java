package com.krakedev.estatico.ejercicio.utils;

public class Util {
	public static String formatearHora(int numero) {
		String valorHora;
		String valor = numero+"";
		if (valor.length()==1) {
			valorHora="0"+numero+"";
		}else {
			valorHora=numero+"";
		}
		return valorHora;

	}
	public static String formatearDia(int numero) {
		String dia;
		if(numero==0) {
			dia="Lunes";
		}else if(numero==1){
			dia="Martes";
		}else if(numero==2){
			dia="Miercoles";
		}else if(numero==3){
			dia="Jueves";
		}else if(numero==4){
			dia="Viernes";
		}else if(numero==5){
			dia="Sabado";
		}else if(numero==6){
			dia="Domingo";
		}else {
			dia=null;
		}
		
		return dia;
		
	}

}
