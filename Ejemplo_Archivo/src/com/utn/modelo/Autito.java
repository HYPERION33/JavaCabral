package com.utn.modelo;

import java.io.Serializable;

public class Autito implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5340785306523733704L;
	private String color;
	private String marca;
	private transient int cv;//transient no persistira este atributo
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCv() {
		return cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	
	public Autito() {}
	
	public Autito(String color, String marca, int cv) {
		this.color=color;
		this.marca=marca;
		this.cv=cv;
	}
}
