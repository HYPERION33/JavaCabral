package com.utn.modelo;

public class Pasajero {
	
	//atributos	
	public String nombre;
	public String destino;
	public double dinero;
	
	public void pagar(double valorViaje) {
		
		System.out.println("Voy a pagar " + valorViaje);
		/*reutilizo la variable dinero 
		para calcular cuanto dinero debo pagar
		
		*/
		
		
		dinero = dinero - valorViaje;
		
		return dinero;
	}
	

}
