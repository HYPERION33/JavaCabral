
package edu.utn.model;

import java.util.ArrayList;

public class Club {
	private String nombre;
	private ArrayList<Jugador> listaJugadores;

	
	
<<<<<<< HEAD
	public Club(String nombre) { //Constructor por defecto
=======
	public Club(String nombre) {// constructor de la clase club
>>>>>>> 4bf12827eef5bdc8191c8bba92ab04f9cca4186f
		this.nombre = nombre;
		this.listaJugadores = new ArrayList<Jugador>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Jugador> getListaJugadores() {//get
		return listaJugadores;
	}
	public void addJugador(Jugador jugador) {
		this.listaJugadores.add(jugador);
	}
	
	
}
