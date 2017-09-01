package edu.utn.modelo;

public class Pasajero {
	//atributos
	public String nombre;
	public String destino;
	public double dinero;
	
	//metodo
	public Vehiculo valorViaje(double valorRecorrido) {		// esto agregue para hacer el calculo de vuelto
		
		if (valorRecorrido <= dinero) {
			System.out.println("Su vuelto: " + (dinero - valorRecorrido));
		}else 
			System.out.println("Saldo insuficiente");
		
		return null;
		
		} 
}
