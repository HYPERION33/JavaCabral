package com.utn.modelo;

public class Intermedio extends Nadador implements IEstilo {

	public Intermedio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intermedio(String nombre, int categoria, int cantLargoPromedio) {
		super(nombre, categoria, cantLargoPromedio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double mariposa(int canLargo) {
		// TODO Auto-generated method stub
		return canLargo * 120.0;
	}

	@Override
	public double crol(int cantLargo) {
		// TODO Auto-generated method stub
		return cantLargo * 50.0;
	}

	@Override
	public double pecho(int cantLargo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double espalda(int cantLargo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
