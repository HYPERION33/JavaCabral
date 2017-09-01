package com.utn.modelo;

public class Vehiculo {

	
	//atributos
	public String marca;
	public String color;
	public String tipo;
	public int tarifa;
	
	//metodos
	public void valorRecorrido(double kmRecorrido) {
		
		if(kmRecorrido <= 5.0) {
			
			System.out.println("Se le cobrara : " + (kmRecorrido*tarifa));
			
		}else if (kmRecorrido<=10.0) {
			
			System.out.println("Se le cobrara : " + ((kmRecorrido*tarifa)*1.1));
			
		}else {
			
			System.out.println("Se le cobrara : " + ((kmRecorrido*tarifa)*1.2));
		}
	}
}
