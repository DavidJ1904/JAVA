package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
    private Naipe naipe;
    private ArrayList<ArrayList<Carta>> cartasJugadores;
    private ArrayList<Carta> naipeBarajado;

    public Juego(ArrayList<String> jugadores) {
    	naipe= new Naipe();
    	 naipeBarajado = naipe.barajar();
    	cartasJugadores=new ArrayList<>();

    	for(int i=0;i<jugadores.size();i++) {
    		cartasJugadores.add(new ArrayList<>());
    	}
    }


    public Juego() {

	}




	public void entregarCartas(int cartasPorJugador) {
    	int jugadoresNum=cartasJugadores.size();
    	int cartasNum=cartasPorJugador*jugadoresNum;
    	int jugadoresID = 0;
    	for(int i=0;i<cartasNum;i++) {
    		Carta carta=naipeBarajado.get(i);
    		cartasJugadores.get(jugadoresID).add(carta);
    		jugadoresID=(jugadoresID+1)%jugadoresNum;
    	}
    }

    public int devolverTotal(int jugadorID) {
    	ArrayList<Carta> cartas= cartasJugadores.get(jugadorID);
    	int total=0;
    	for(Carta carta:cartas) {
    		total+=carta.getNumero().getValor();

    	}
    	return total;
    }

    public int determinarGanador() {
        int idGanador = 0;
        int sumaGanador = devolverTotal(0);

        for (int i = 1; i < cartasJugadores.size(); i++) {
            int sumaActual = devolverTotal(i);
            if (sumaActual >= sumaGanador) {
                idGanador = i;
                sumaGanador = sumaActual;
            }
        }

        return idGanador;
    }


	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}




}