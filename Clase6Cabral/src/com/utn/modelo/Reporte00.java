package com.utn.modelo;

public class Reporte00 {
//metodos que me dan informacion

	public void viajerosPorDiaColectivo(Colectivo00 colectivo) { //insancia colectivo de clase Colectivo00
		
		System.out.println("Han viajado en el colectivo " + colectivo.linea);
		System.out.println(colectivo.pasajerosEnElColectivo().length + " pasajeros");
		int cantPasajeros = 1;
		for(int i = 0; i < colectivo.pasajerosEnElColectivo().length; i++ ) {
			if(colectivo.pasajerosEnElColectivo() [i] != null) {
				System.out.println("Ha viajado el pasajero " + colectivo.pasajerosEnElColectivo()[i].nombre);
				cantPasajeros++;
			}
		}
		System.out.println("Han subido " + cantPasajeros + " pasajeros");
	}
	
	public void dineroRecaudado(Colectivo00 colectivo) {
		System.out.println("La recaudacion de dia es: " + colectivo.recaudacion);	
	}
	
	public void asientosLibres(Colectivo00 colectivo) {
		System.out.println("Para el colectivo " + colectivo.linea + " fueron ocupados " + colectivo.cantAsientosLibres);
	}
}
