package com.utn.modelo;

public class Empleado extends Persona{

	private int id_legajo;
	
	private String cargo;
	
	public int getId_legajo() {
		return id_legajo;
	}
	
	public void setId_legajo(int id_legajo) {
		this.id_legajo = id_legajo;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
		
	//constructor con herencia de clase persona
	public Empleado(String nombre, String apellido, int edad,int id_legajo, String cargo ) {
		super(nombre, apellido, edad);
		this.id_legajo=id_legajo;
		this.cargo=cargo;		
	}
	
}
