package com.utn.modelo;

public class Animales {
	
	private String nombre;
	private String tipo;
	private String raza;
	private int edad;
	private String motivoDeConsulta;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getmotivoDeConsulta() {
		return motivoDeConsulta;
	}
	public void setmotivoDeConsulta(String motivoDeConsulta) {
		this.motivoDeConsulta = motivoDeConsulta;
	}
	
	public Animales (String nombre,String tipo,String raza,int edad,String motivo) {//constructor de animales
		
		this.nombre="";
		this.tipo="";
		this.raza="";
		this.edad=0;
		this.motivoDeConsulta="";	
	}
	
}
