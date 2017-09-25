package com.utn.modelo;

public class Animales {
	
	private String nombre;
	private String tipo;
	private String raza;
	private double peso;
	private int edad;
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
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
		
	public Animales (String tipo,String nombre,String raza,int edad,double peso) {//constructor de animales
		
		this.tipo=tipo;
		this.nombre=nombre;
		this.raza=raza;
		this.edad=edad;
		this.peso=peso;	
	}
	
	
}
