package com.utn.modelo;

public class Jugador {

	private String nombre;
	private String apellido;
	private int edad;
	private int posicion;
	private boolean titular = true;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public boolean isTitular() {
		return titular;
	}
	public void setTitular(boolean titular) {
		this.titular = titular;
	}
	
	public Jugador(String nombre, String apellido, int edad,int posicion, boolean titular ) {//constructor por defecto
		
		this.nombre="";
		this.apellido="";
		this.edad=0;
		this.posicion=0;
		this.titular=false;
	}
	
	public String datosJugador() {
		
		return nombre + " " + apellido + " tiene " + edad + " años. " + "juega de " + posicion ;
	}
}
