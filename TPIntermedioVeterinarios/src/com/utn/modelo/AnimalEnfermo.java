package com.utn.modelo;

public class AnimalEnfermo extends Animales{
	
	private String motivoConsulta;
	
	public String getMotivoConsulta() {//getter
		return motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {//setter
		this.motivoConsulta = motivoConsulta;
	}

	public AnimalEnfermo(String tipo,String nombre,String raza,int edad,double peso,String motivoConsulta) {
	
		super( tipo, nombre, raza, edad, peso);
		
		this.motivoConsulta = motivoConsulta;
		
			
	}
}
