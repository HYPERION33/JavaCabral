package com.utn.modelo;

public class Reporte {

	public void muestroPasajeosColectivoDia(Colectivo colectivo) {

		System.out.println("han viajado en el dia para para el colectivo: " + colectivo.linea);
		System.out.println("la cantidad de pasajeros fueron: " + colectivo.pasajerosEnElColectivo().length);
		int cantPasajeros =1;
		for (int i = 0; i < colectivo.pasajerosEnElColectivo().length; i++) {
			if(colectivo.pasajerosEnElColectivo()[i] != null) {
				System.out.println("ha viajado el pasajero: " + colectivo.pasajerosEnElColectivo()[i].nombre);
				cantPasajeros++;
			}

		}
		System.out.println("han subido " + cantPasajeros + "  pasajeros");
	}
	
	public void muestroDineroRecaudado(Colectivo colectivo) {
		System.out.println("el dinero recaudado del dia fue " + colectivo.recaudacion + " $");
	}
	
	public void muestroAsientosLibres(Colectivo colectivo) {
		System.out.println("Para el colectivo " + colectivo.linea + " fueron ocupados " + colectivo.cantAsientoLibres + " disponibles" );
	}
}
