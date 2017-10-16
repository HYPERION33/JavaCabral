package edu.utn.modelo.map;

import edu.utn.modelo.Counter;
import edu.utn.modelo.Terror;

public class Dust extends Map{

	public Dust(int cantJug, double timeOut, int puntaje) {
		super(cantJug, timeOut, puntaje);
		// TODO Auto-generated constructor stub
	}
	
	public void activarC4(Terror terror) {
		terror.activarC4();
	}
	
	public void desactivarC4(Counter counter) {
		counter.desactivarBomba();
	}


}
