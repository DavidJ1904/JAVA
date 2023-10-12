package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;



	public Naipe() {
		numerosPosibles= new ArrayList<>();
		cartas=new ArrayList<>();
		numerosPosibles.add(new Numero("A",11));
		numerosPosibles.add(new Numero("2",2));
		numerosPosibles.add(new Numero("3",3));
		numerosPosibles.add(new Numero("4",4));
		numerosPosibles.add(new Numero("5",5));
		numerosPosibles.add(new Numero("6",6));
		numerosPosibles.add(new Numero("7",7));
		numerosPosibles.add(new Numero("8",8));
		numerosPosibles.add(new Numero("9",9));
		numerosPosibles.add(new Numero("10",10));
		numerosPosibles.add(new Numero("J",10));
		numerosPosibles.add(new Numero("Q",10));
		numerosPosibles.add(new Numero("K",10));

		String[] palos={"CR","CN","DI","TR"};
		for(int i=0;i<numerosPosibles.size();i++) {
			for(int j=0;j<palos.length;j++) {
				Carta carta=new Carta(numerosPosibles.get(i),palos[j]);
				cartas.add(carta);
			}
		}

	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<>();

		for(int i=0;i<cartas.size();i++) {
			Carta elemento=cartas.get(i);
			elemento.setEstado("N");
		}

		for(int i=0;i<100;i++) {
			int posicion=Random.obtenerPosicion();
			Carta carta=cartas.get(posicion);

			if(carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}

		for (int i=0;i<cartas.size();i++) {
			if(cartas.get(i).getEstado().equals("N")) {
				auxiliar.add(cartas.get(i));
			}
		}

		return auxiliar;
	}



	public ArrayList<Carta> getCartas() {
		return cartas;
	}

}
