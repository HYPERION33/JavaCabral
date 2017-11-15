package com.utn.modelo;

import java.io.Serializable;

public class Alumno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 410994215231479493L;

	
	private  String nombre;
	private  String materia;
	/*
	 * Transient sirve para no persistir 
	 * el objeto tanto sea en el binario 
	 * como en una base de datos
	 * ignora la propiedad
	 */
	private  transient int nota;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	
}
