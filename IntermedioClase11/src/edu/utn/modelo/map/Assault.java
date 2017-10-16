package edu.utn.modelo.map;

import edu.utn.modelo.Counter;

public class Assault extends Map{

	public Assault(int cantJug, double timeOut, int puntaje) {
		super(cantJug, timeOut, puntaje);

	}
	public void rescatarRehenes(Counter counter) {

		counter.rescatarRehenes();

	}



}
