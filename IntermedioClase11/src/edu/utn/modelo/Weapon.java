package edu.utn.modelo;

public abstract class Weapon implements IWeapon{
	
	private String nombre;
	private double precio;
	private int danio;	
	private int capacidad;	
	private int balas;
	
	public int getBalas() {
		return balas;
	}
	public void setBalas(int balas) {
		this.balas = balas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDanio() {
		return danio;
	}
	public void setDanio(int danio) {
		this.danio = danio;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public Weapon(String nombre, double precio, int danio, int capacidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.danio = danio;
		this.capacidad = capacidad;
		balas=capacidad;
		
	}
	
	
	

}
