package com.utn.modelo;

public class Clinica {

	private String nombre;
	private static int contadorPacientes = 0;
	private final int maxDiario = 20;

	public int getContadorPacientes() {
		return contadorPacientes;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMaxDiario() {
		return maxDiario;
	}
	
	public Clinica (String nombre) {
		
		this.nombre = nombre;
	
	}
		
	public void aumentaPacientes() {
		
		contadorPacientes++;
	
	}
}
