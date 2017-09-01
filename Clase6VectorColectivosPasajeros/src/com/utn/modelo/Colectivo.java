package com.utn.modelo;

public class Colectivo {
	public String linea;
	public Pasajero[] pasajeros;
	public int cantMax = 25;
	public int cantAsientos = 10;
	public double precio;
	public boolean lleno;
	public int indice_pasajero = 0;
	public boolean asientos = true;
	public double recaudacion = 0;
	public int cantAsientoLibres=0;

	public void initialize() {
		pasajeros = new Pasajero[25];
	}

	public void cobrar(Pasajero pasajero) {
		// sube el pasajero
		if (indice_pasajero < cantMax) {
			System.out.println("hola pasajero " + pasajero.nombre);
			System.out.println("El precio es: " + precio);
			if (precio <= pasajero.dinero) {
				System.out.println("se le cobrara " + precio);
				pasajero.dinero = pasajero.dinero - precio;
				System.out.println("Su vuelto es de " + pasajero.dinero);
				pasajeros[indice_pasajero] = pasajero;
				
				recaudacion = recaudacion + precio;
				if (asientos) {
					if (  cantAsientoLibres <= cantAsientos) {
						System.out.println("El pasajero: " + pasajero.nombre + " ira sentado");
						pasajeros[indice_pasajero].sentado = true;
						cantAsientoLibres++;
					} else {

						System.out.println("Ya no hay mas asientos disponbiles ");
						asientos = false;
					}

				} else {
					pasajeros[indice_pasajero].sentado = false;
					System.out.println("El pasajero " + pasajero.nombre + " ira parado");
				}

			} else {
				System.out.println("No puede subir porque no tiene suficiente dinero");
			}
			
			indice_pasajero++;
		} else {
			System.out.println("El bondi esta lleno");
		}
	}

	public Pasajero[] pasajerosEnElColectivo() {
		return pasajeros;
	}

}
