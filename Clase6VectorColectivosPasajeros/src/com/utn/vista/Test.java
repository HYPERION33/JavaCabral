package com.utn.vista;

import com.utn.modelo.Colectivo;
import com.utn.modelo.Pasajero;
import com.utn.modelo.Reporte;

public class Test {

	public static void main(String[] args) {
		System.out.println("=================INICIO=========================");
		Colectivo cole1 = new Colectivo();
		cole1.linea = " Linea 51";
		cole1.precio = 5.0;
		cole1.initialize();

		// pasajero 1
		Pasajero p1 = new Pasajero();
		p1.nombre = "juan";
		p1.dinero = 10.0;

		// pasajero 2
		Pasajero p2 = new Pasajero();
		p2.nombre = "Mirna";
		p2.dinero = 6.0;

		// pasajero 3
		Pasajero p3 = new Pasajero();
		p3.nombre = "Ariel";
		p3.dinero = 4.0;

		// pasajero 4
		Pasajero p4 = new Pasajero();
		p4.nombre = "Donal Trump";
		p4.dinero = 99999;

		System.out.println("===COLECTIVO " + cole1.linea + " ========");
		cole1.cobrar(p1);
		cole1.cobrar(p2);
		cole1.cobrar(p3);

		Colectivo cole2 = new Colectivo();
		cole2.cantAsientos = 3;
		cole2.linea = "Linea 53";
		cole2.precio = 100;
		cole2.initialize();
		System.out.println("=======================================");

		System.out.println("===COLECTIVO " + cole2.linea + " ========");

		cole2.cobrar(p1);
		cole2.cobrar(p2);
		cole2.cobrar(p3);
		cole2.cobrar(p4);

		System.out.println("==============================");
		Reporte reporte = new Reporte();
		System.out.println("Reporte del Colectivo " + cole1.linea);
		reporte.muestroPasajeosColectivoDia(cole1);
		reporte.muestroDineroRecaudado(cole1);
		reporte.muestroAsientosLibres(cole1);

		System.out.println("==============================");
		System.out.println("Reporte del Colectivo " + cole2.linea);
		reporte.muestroPasajeosColectivoDia(cole2);
		reporte.muestroDineroRecaudado(cole2);
		reporte.muestroAsientosLibres(cole2);

		System.out.println("=================FIN=========================");

	}

}
