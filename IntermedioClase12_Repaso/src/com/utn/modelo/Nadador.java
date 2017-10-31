package com.utn.modelo;

public abstract class Nadador {
	private String nombre;
	private int categoria;
	private int cantLargoPromedio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getCantLargoPromedio() {
		return cantLargoPromedio;
	}
	public void setCantLargoPromedio(int cantLargoPromedio) {
		this.cantLargoPromedio = cantLargoPromedio;
	}
	public Nadador() {
		// TODO Auto-generated constructor stub
	}
	public Nadador(String nombre, int categoria, int cantLargoPromedio) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.cantLargoPromedio = cantLargoPromedio;
	}
}
