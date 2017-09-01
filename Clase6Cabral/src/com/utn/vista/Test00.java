package com.utn.vista;

import com.utn.modelo.Reporte00;
import com.utn.modelo.Colectivo00;//importamos la clase colectivo para que tome de aca los pasajeros y las lineas, empieza la magia ;)
import com.utn.modelo.Pasajero00;

public class Test00 {
	
	public static void main(String[] args) {
		
		System.out.println("=======================INICIO DE RECORRIDO==================");
		Colectivo00 colec1 = new Colectivo00();//no olvidar la firma "()" del contrato Colectivo00
		colec1.linea = "126";
		colec1.cantAsientos = 3;
		colec1.precioBoleto = 5.00;
		colec1.initialize();
	
		//pasajeros 
		
		Pasajero00[] pasajeros = new Pasajero00[30];
		
		pasajeros[0] = new Pasajero00();
		pasajeros[0].nombre = "Pablo";
		pasajeros[0].dinero = 180.00;
		
		pasajeros[1] = new Pasajero00();
		pasajeros[1].nombre = "German";
		pasajeros[1].dinero = 190.00;
		
		pasajeros[2] = new Pasajero00();
		pasajeros[2].nombre = "Victor";
		pasajeros[2].dinero = 200.00;
		
		pasajeros[3] = new Pasajero00();
		pasajeros[3].nombre = "Amanda";
		pasajeros[3].dinero = 210.00;
		
		pasajeros[4] = new Pasajero00();
		pasajeros[4].nombre = "Chano";
		pasajeros[4].dinero = 220.00;
		
		pasajeros[5] = new Pasajero00();
		pasajeros[5].nombre = "Elias";
		pasajeros[5].dinero = 240.00;
		
		pasajeros[6] = new Pasajero00();
		pasajeros[6].nombre = "Sofia";
		pasajeros[6].dinero = 300.00;
		
		pasajeros[7] = new Pasajero00();
		pasajeros[7].nombre = "Walter";
		pasajeros[7].dinero = 130.00;
		
		pasajeros[8] = new Pasajero00();
		pasajeros[8].nombre = "Rodrigo";
		pasajeros[8].dinero = 190.00;
		
		pasajeros[9] = new Pasajero00();
		pasajeros[9].nombre = "Tio Sam";
		pasajeros[9].dinero = 4000.00;
		
		pasajeros[10] = new Pasajero00();
		pasajeros[10].nombre = "Nahuel";
		pasajeros[10].dinero = 180.00;
		
		pasajeros[11] = new Pasajero00();
		pasajeros[11].nombre = "Palermo";
		pasajeros[11].dinero = 999.00;
			
		pasajeros[12] = new Pasajero00();
		pasajeros[12].nombre = "Riquelme";
		pasajeros[12].dinero = 1000.00;
		
		pasajeros[13] = new Pasajero00();
		pasajeros[13].nombre = "Pablo";
		pasajeros[13].dinero = 1900.00;
		
		pasajeros[14] = new Pasajero00();
		pasajeros[14].nombre = "Tavo";
		pasajeros[14].dinero = 180.00;
		
		pasajeros[15] = new Pasajero00();
		pasajeros[15].nombre = "Taya";
		pasajeros[15].dinero = 600.00;
		
		pasajeros[16] = new Pasajero00();
		pasajeros[16].nombre = "Matias";
		pasajeros[16].dinero = 1800.00;
		
		pasajeros[17] = new Pasajero00();
		pasajeros[17].nombre = "Prodan";
		pasajeros[17].dinero = 200.00;
		
		pasajeros[18] = new Pasajero00();
		pasajeros[18].nombre = "Ivan";
		pasajeros[18].dinero = 100.00;
	
		System.out.println("==========COMIENZA RECORRIDO COLECTIVO " + colec1.linea);
		
		for(int i = 0 ; i < pasajeros.length; i++) {
			if (i < colec1.maxPasajeros) {
				colec1.cobrar(pasajeros[i]);			
			}else {System.out.println("Indice vacio.");
			}
		}
		
		Colectivo00 colec2 = new Colectivo00();
		colec2.cantAsientos = 5;
		colec2.linea = "Linea PLUS";
		colec2.precioBoleto = 200.00;
		colec2.initialize();
		System.out.println("==================================================");
		
		System.out.println("==========COMINEZA RECORRIDO LINEA " + colec2.linea);
		
		for(int j = 0 ; j < pasajeros.length; j++) {
			if (j < colec2.maxPasajeros) {
				colec2.cobrar(pasajeros[j]);
			}else {System.out.println("Indice vacio.");
			}
		}
		
		System.out.println("===================================================");
		
		Reporte00 reporte = new Reporte00();
		System.out.println("Reporte diaro de la linea " + colec1.linea );
		reporte.viajerosPorDiaColectivo(colec1);
		reporte.dineroRecaudado(colec1);
		reporte.asientosLibres(colec1);
		
		System.out.println("===================================================");
		System.out.println("Reporte diao de la linea " + colec2.linea);
		reporte.viajerosPorDiaColectivo(colec2);
		reporte.dineroRecaudado(colec2);
		reporte.asientosLibres(colec2);
		
		System.out.println("=======================FIN=========================");

	}

}
