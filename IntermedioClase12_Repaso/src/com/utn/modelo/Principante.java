package com.utn.modelo;

public class Principante extends Nadador implements IEstilo {

	public Principante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Principante(String nombre, int categoria, int cantLargoPromedio) {
		super(nombre, categoria, cantLargoPromedio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double mariposa(int cantLargo) {

		return cantLargo * 240.0;
	}

	@Override
	public double crol(int cantLargo) {
		// TODO Auto-generated method stub
		return cantLargo * 60;
	}

	@Override
	public double pecho(int cantLargo) {
		// TODO Auto-generated method stub
		return cantLargo * 80;
	}

	@Override
	public double espalda(int cantLargo) {
		// TODO Auto-generated method stub
		return cantLargo * 120;
	}

}
