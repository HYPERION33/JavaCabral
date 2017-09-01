package edu.utn.modelo;

//Clase conducir
public class Conductor {

	// Atributos de la clase
	public String nombre;
	public String apellido;
	public boolean licencia;
	public String tipoLicencia;
	public int edad;

	// metodos
	public void conducir() {
		
		System.out.println("______________________________________________________________________");
		System.out.println("Bienvenido Sr/Sra "+ nombre);
		
		if (edad >= 18 && edad <= 20) {
		// verficacion de edad para vehiculos particulares
			/*
			 * Cuando trabajamos con booleanos en un condicional no hace falta poner el ==
			 * para validar su estado
			 */

			if (licencia) {
				System.out.println("Puede conducir vehiculos particulares con licencia");
				tipoLicencia="Licencia comun";
			} else {
				System.err.println("Puede conducir pero no tiene licencia");
			}

		} else if (edad >= 21) {

			System.out.println("Puede sacar la licencia profesional");
			tipoLicencia = "profesional";
		}else {
			System.err.println("No tiene la edad requerida para sacar la licencia de conducir");
			tipoLicencia=". Licencia inactiva!";
		}
		
	}

	public Vehiculo asignoVehiculo(String tipoVehiculo) {
		//Opcion 1, creo un objeto y dependiendo el caso del switch
		//Se le asignaran valores
		Vehiculo v =new Vehiculo();
		switch (tipoVehiculo) {
		case "particular":
			System.out.println("Se le asigno un particular");
			v.marca="Ford";
			v.color="negro";
			v.tarifa=10;
			break;
		case "taxi":
			System.out.println("Se le asigno un taxi");
			v.marca="Renault";
			v.color="rojo";
			v.tarifa=30;
			break;
		case "camion":
			System.out.println("Se le asigno un camion");
			v.marca="Volvo";
			v.color="azul";
			v.tarifa=100;
			break;
		default:
			v=null;
			System.out.println("Sin opciones disponibles");
			break;
		}
		
		return v;
	}
}



