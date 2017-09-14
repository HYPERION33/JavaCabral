package com.utn.herencia;

public class Vehiculo {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero,climatizador;
	
	public Vehiculo() {// contructor inicial objeto tipo coche
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	public String dime_datos_generales() {//getter de objeto
		
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas. \n"
		+ "Mide " + largo/1000 + " metros. \n"
		+ "Tiene un ancho de " + ancho + " cm. \n"
		+ "Su plataforma pesa " + peso_plataforma + " Kg.\n"
		+ "El motor que utiliza tiene una capacidad de " + motor + "CC";
		
	}
	
	public void configura_color(String color) {//setter de color
		this.color = color;
	}

	public String dime_color() {//getter de color
		
		return "El color del vehiculo es: " + color;
	
	}
	
	public void configura_asientos(String asientos_cuero) {//tiene asientos de cuero o no
		
		if(asientos_cuero.equalsIgnoreCase("Si")) {
			
			this.asientos_cuero=true;
		}else {
			
			this.asientos_cuero =false;
		}
	}
	
	public String dime_asientos() {//getter que me dice si los asientos son o no son de cuero
		
		if(asientos_cuero=true) {
			
			return "El coche tiene asientos de cuero.";
		
		}else{
		
			return "El coche tiene asientos de serie.";
		}
	}
	
	public void configura_climatizador(String climatizador) {//setter
		
		if(climatizador.equalsIgnoreCase("Si")) {
			
			this.climatizador=true;
		}else {
			
			this.climatizador=false;
		}
		
	}
	
	public String dime_climatizador() {
		
		if(climatizador=true) {
		
			return "El auto posee climatizador."; 
			
		}else {
			
			return "El auto posee aire acondicionado";
		}
	}
	
	public void calcula_peso_vehiculo() {//setter peso
		
		int peso_carroceria = 500;
		
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero==true) {
			
			peso_total = peso_total + 50;
			
		}if(climatizador==true){
			
			peso_total = peso_total + 20;
		}
		
	}
	
	public String dime_peso_vehiculo() {//getter peso
		
		return "El peso del coche es: " + peso_total;
	}
	
}
