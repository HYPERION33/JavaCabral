package com.utn.modelo;

public class Persona {

	private final static  String saltoMistico="salto de cola";
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(final String nombre) {
//		nombre="lelo";
		this.nombre = nombre;
	}


	public void saltoALaPiletaAmeo() {
		System.out.println("salto de bomba");
	}
	
	
//	public static void setSaltoMistico(String saltoMistiko) {
//		saltoMistico= saltoMistiko;
//	}
	
	public static String getSaltoMistico() {
		return saltoMistico;
	}
	
	
}
