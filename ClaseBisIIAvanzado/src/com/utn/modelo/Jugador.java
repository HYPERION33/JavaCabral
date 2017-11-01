package com.utn.modelo;

public class Jugador {

	private String nombre;
	private String posicion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
//	public void atajar() {
//		Portero p = new Portero();
//	}
	
	
	//Clase anidada
	class Portero{

		private String habilidad;
		
		public String getHabilidad() {
			return habilidad;
		}


		public void setHabilidad(String habilidad) {
			this.habilidad = habilidad;
		}


		public void atajar() {
			System.out.println("Estoy atajando");
		}
	}
}
