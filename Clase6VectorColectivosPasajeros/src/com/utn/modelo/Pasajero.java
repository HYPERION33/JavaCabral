package com.utn.modelo;

public class Pasajero {

	public String nombre;
	public double dinero;
	public boolean sentado;
	
	public void bajar() {
		
		System.out.println("me bajo del bondi");
	}
	
	public double muestroDinero() {
		return dinero;
	}
}
