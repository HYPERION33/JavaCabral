package com.utn.modelo;
import java.util.*;

public class Club {
	
	//atributos
	private String nombre;
	private ArrayList<CuerpoTecnico> arrayCuerpoTecnico = new ArrayList<CuerpoTecnico>();
	private ArrayList<Jugador> arrayJugadores = new ArrayList<Jugador>();
	
	
	public Club (String nombre) {//Contructor club con array de jugadores y cuerpo tecnico
		
		this.nombre = nombre;
		this.arrayJugadores = new ArrayList<Jugador>();
		this.arrayCuerpoTecnico = new ArrayList<CuerpoTecnico>();
		
	}
	
	public ArrayList<CuerpoTecnico> getArrayCuerpoTecnico() {//get
		return arrayCuerpoTecnico;
	}

	public void agregarCuerpoTecnico(CuerpoTecnico profesional) {// metodo para agregar profesional al array
		this.arrayCuerpoTecnico.add(profesional);
	}

	public ArrayList<Jugador> getArrayJugadores() {//get
		return arrayJugadores;
	}

	public void setArrayJugadores(Jugador jugador) {// metodo para agregar jugador al array
		this.arrayJugadores.add(jugador);
	}

	public String getNombre() {//get
		return nombre;
	}

	public void setNombre(String nombre) {//set
		this.nombre = nombre;
	}

}


