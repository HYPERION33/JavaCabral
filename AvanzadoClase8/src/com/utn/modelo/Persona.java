package com.utn.modelo;

public class Persona {

	private String nombre;
	private String apellido;
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
	
	
	public Persona() {
	}
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void muestroDatos() {
		System.out.println(nombre);

		System.out.println(apellido);
	}
	
	
	public String fullname() {
		return "nombre: " + this.nombre + ", apellido: " + this.apellido;
	}
	
	
}
