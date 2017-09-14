package com.utn.herencia;

public class Furgoneta extends Vehiculo {
	//Vehiculo = clase padre
	//Furgoneta = clase hija
	//Furgoneta hereda a Vehiculos  + sus atributos propios.
	
	private int capacidad_carga;
	private int plazas_extra;
	
	//dar estado inicial.
	//hereda , ademas, al metodo constructor de vehiculo.
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {//constructor de Furgoneta
	
	//llamo al contructor de la clase padre Vehiculo
	super();
	/* ademas de llamar al constructor de la clase padre, 
	 * le doy estado inical a los nuevos atributos.
	 */
	
	this.capacidad_carga=capacidad_carga;
	this.plazas_extra=plazas_extra;
	
	}
	
	public String dime_datos_furgoneta() {
		
		return "La capacidad de carga es: " + capacidad_carga + ". Y las plazas extras son: " + plazas_extra;
	}
	
}
