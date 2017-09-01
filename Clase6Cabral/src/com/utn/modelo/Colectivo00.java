package com.utn.modelo;

public class Colectivo00 {
//atributos
	public String linea;
	public Pasajero00[] pasajeros;
	public int maxPasajeros = 25;
	public int cantAsientos = 3;
	public double precioBoleto = 0;
	public boolean lleno;
	public int indice_pasajeros = 0;
	public boolean asientos = true;
	public double recaudacion;
	public int cantAsientosLibres = 0;
	
	public void initialize() {
		pasajeros = new Pasajero00[25]; //creo el vector.
	}
//metodos
	
	public void cobrar(Pasajero00 pasajero) {//comienza el metodo para cobrarle a la instancia pasajero de Pasajero00..
		//con sus respectivas restricciones
		if (indice_pasajeros < maxPasajeros) {//utiliza a maxPasajeros como limitador, 
			//el vector depende del indice_pasajeros pero este no puede superar a maxPasajeros
			System.out.println("Bienvenido " + pasajero.nombre);
			System.out.println("El precio del boleto es: " + precioBoleto);
			if (pasajero.dinero >= precioBoleto) {
					System.out.println("Se le cobraran: " + precioBoleto);
					pasajero.dinero = pasajero.dinero - precioBoleto;//de aca se calcula el vuelto, por eso es importante el return en pasajeros.
					System.out.println("Su vuelto es " + pasajero.dinero);//va a dar el vuelto con el dinero retornado desp de la cuenta
					pasajeros[indice_pasajeros] = pasajero;// a partir de aca mete a los nuevos pasajeros al vector
	
					recaudacion = recaudacion + precioBoleto;
			if(asientos) {//solo actua para asientos
					if(cantAsientosLibres <= cantAsientos) {
							System.out.println("El pasajero " + pasajero.nombre +" viajara sentado");
							pasajeros[indice_pasajeros].sentado = true; //sentarse es un atributo de Persona00
							cantAsientosLibres++;// suma uno. cuando supere la cantAsientos va a tener que viajar parado			
					}else {
						System.out.println("No hay asientos libres");
						asientos = false;
						}
					}else{
						System.out.println("El pasajero " + pasajero.nombre +" viajara parado");
			}

			}else {	
				System.out.println("El pasajero no puede subir, saldo insuficiente");
					}
		
				indice_pasajeros++;//pasa al siguiente pasajero
		}
	
	}
		
	public Pasajero00[]  pasajerosEnElColectivo() { //vector para contar pasajeros de colectivo. fuera del metodo cobrar.
		return pasajeros;
	}	
	
}
