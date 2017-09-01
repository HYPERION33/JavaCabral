package edu.utn.controlador;

import edu.utn.modelo.Conductor;
import edu.utn.modelo.Pasajero;
import edu.utn.modelo.Vehiculo;

public class ViajeControlador {
	
	public void recorrido() {
		//Me creo el objeto del conductor		
		Vehiculo v1 = new Vehiculo();
		
		v1.marca="Peugeot";
		v1.color="amarillo";
		v1.tarifa=7;
		System.out.println("El vehiculo " + v1.marca +  " de color "+ v1.color + " con tarifa : $" + v1.tarifa + " va a cobrar!");
		v1.valorRecorrido(2.0);
		
		//Me creo el objeto del pasajero
		Pasajero p1 = new Pasajero();
		p1.nombre="Gustavo";
		p1.destino="a la luna";
		p1.dinero=10.20;
		System.out.println("Es Sr/Sra " + p1.nombre + " viajara " + p1.destino + ". Dispone de $" + p1.dinero);
		//p1.pagar(5); //Yo hago lo que quiero :V 
		
		p1.valorViaje(14);
		
		System.out.println("FIN");
		System.out.println("______________________________________________________________________");
		
		
		//Nuevo objeto del condutor		
		Vehiculo v2 = new Vehiculo();
		
		v2.marca="Hyundai";
		v2.color="verde";
		v2.tarifa=9;
		System.out.println("El vehiculo " + v2.marca + " de color "+ v2.color + " con tarifa : $" + v2.tarifa + " va a cobrar!" );
		v2.valorRecorrido(7.0);
		
		//nuevo objeto del pasajero
		Pasajero p2 = new Pasajero();
		p2.nombre="Fernando";
		p2.destino="1.0 km";
		p2.dinero=10.0;
		System.out.println("Es Sr/Sra " + p2.nombre + " viajara " + p2.destino + ". Dispone de $" + p2.dinero);
			
		System.out.println("FIN");
			
		//Objeto N1
		Conductor Pablo = new Conductor();
		Pablo.nombre="Pablo";
		Pablo.apellido="Cabral";
		Pablo.edad=27;
		Pablo.conducir();
		System.out.println("Se le otorgo la licencia " + Pablo.tipoLicencia);
		
		//Nuevo Vehiculo() para Pablo o null		
		Vehiculo vehi2 = Pablo.asignoVehiculo("camion");
		
		if(vehi2 != null ) {
			System.out.println("Vehiculo marca "+ vehi2.marca + ", color " + vehi2.color + ". Su tarifa es "+ vehi2.tarifa);
		}else {
			System.out.println("No hay vehiculos disponibles para Pablo");	
		}
		
		//creo otro objeto del conductor
		//Objeto N2
		Conductor c1 = new Conductor();
		c1.nombre="Sofia";
		c1.edad=4;
		c1.conducir();
		System.out.println("Se le otorgo la licencia " + c1.tipoLicencia);
		
		
		
		//new Vehiculo() para Sofia o null
		Vehiculo vehi1 = c1.asignoVehiculo("taxi");
		
		//vehi1.marca = null.marca != inversa del == 
		// !=  quiere decir "es distinto de..."
		if(vehi1 != null) {
			System.out.println("Vehiculo marca "+ vehi1.marca + ", color " + vehi1.color + ". Su tarifa es "+ vehi1.tarifa);
		}else {
			System.out.println("No hay vehiculos identicos para Sofia");
		}
		
		
		//Ejemplo
//		//Caso N1
//		Vehiculo v1 = new Vehiculo();
//		
//		//Caso N2
//		Vehiculo v2 = null;
	}
	
}
