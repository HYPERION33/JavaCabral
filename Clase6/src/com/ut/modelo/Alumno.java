package com.ut.modelo;

public class Alumno {

	private int id;
	private int id_materia;
	private String nombre;
	private int nota;
	
	//getter & setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_materia() {
		return id_materia;
	}
	public void setId_materia(int id_materia) {
		this.id_materia = id_materia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}

	public Alumno() {}
	
	public Alumno(int id, int id_materia, String nombre, int nota) {
		this.id = id;
		this.id_materia = id_materia;
		this.nombre = nombre;
		this.nota = nota;
	}
	
	
	
	
}
