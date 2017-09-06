package com.utn.modelo;

public class CuerpoTecnico {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String cargo;
	
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
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public CuerpoTecnico() {//constructor por defecto
		
		this.nombre="";
		this.apellido="";
		this.edad=0;
		this.cargo="";
		
	}
}
