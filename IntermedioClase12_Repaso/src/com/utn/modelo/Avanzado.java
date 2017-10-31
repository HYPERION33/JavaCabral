package com.utn.modelo;

public class Avanzado extends Nadador implements IEstilo{

	public Avanzado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Avanzado(String nombre, int categoria, int cantLargoPromedio) {
		super(nombre, categoria, cantLargoPromedio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double mariposa(int canLargo) {
		// TODO Auto-generated method stub
		return canLargo * 30.0;
	}

	@Override
	public double crol(int cantLargo) {
		// TODO Auto-generated method stub
		return cantLargo * 30.0;
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
