 
package com.krakedev.servcios;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;


public class Juego {
	private Naipe naipe;
    private ArrayList<Carta> naipeBarajado; 
    private ArrayList<ArrayList<Carta>> cartasJugadores;
    
    public Juego() {
    	naipe = new Naipe();
    	naipeBarajado = naipe.barajar();
    }
    
    public Juego(ArrayList<String> idsJugadores) {
    	naipe = new Naipe();
    	naipeBarajado = naipe.barajar();
    	cartasJugadores = new ArrayList<ArrayList<Carta>>();
        for (int i=0;i<idsJugadores.size();i++) {
            ArrayList<Carta> cartasJ = new ArrayList<Carta>();
            cartasJugadores.add(cartasJ);
        }
    }

	public Naipe getNaipe() {
		return naipe;
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}
	
	public void entregarCartas(int cartasPorJugador) {
        int numJugadores = cartasJugadores.size();

        for (int i = 0; i < cartasPorJugador; i++) {
            for (int j = 0; j < numJugadores; j++) {
                Carta carta = naipeBarajado.remove(0);
                cartasJugadores.get(j).add(carta);
            }
        }
	}
	
	public int devolverTotal(int idJugador) {
        ArrayList<Carta> cartasJ = cartasJugadores.get(idJugador);
        int total = 0;

        for (Carta carta : cartasJ) {
            total += carta.getNumero().getValor();
        }

        return total;
    }
	
	public String determinarGanador() {
		int idGanador = 0;
        int sumaGanador = devolverTotal(0);
        
        for (int i = 1; i < cartasJugadores.size(); i++) {
            int sumaActual = devolverTotal(i);
            if (sumaActual > sumaGanador) {
                idGanador = i;
                sumaGanador = sumaActual;
            }
        }

        return "jugador "+(idGanador+1);
    }
}
