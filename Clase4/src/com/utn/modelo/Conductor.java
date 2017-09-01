package com.utn.modelo;

public class Conductor {

	// atributos de la clase
	public String nombre;
	public String apellido;
	public boolean licencia;
	public String tipoLicencia;
	public int edad;

	// metodos
	public void conducir() {
		
		//verificacion de edad para vehiculos particulares
		if(edad >= 18 && edad <= 20) { // && es el AND de logica prepocicional
			
			if(licencia) {
				
				/*cuando trabajamos con booleanos 
				 * en un condicinonal no hace falta
				 * poner == para validar su estado¨
				 */		
				
			}
				System.out.println("Puede conducir vehiculos particulares");
				
			} if (edad >= 21) { // ojo el corchete
			
				System.err.println("Puede conducir pero no tiene licencia");
					
			} else {
				
				System.out.println("Puede sacar la licencia profesional");
				tipoLicencia= "Profesional";
				
			} else  { 
				
				System.err.println("no tiene la edad necesaria para conducir");
			}
			
		
	}

	public void asignoVehiculo(String tipoVehiculo) {
	
		switch (tipoVehiculo) {
		
		case"particular":
			System.out.println("Le asignamos un auto particular");
		case"taxi":
			System.out.println("Le asigno un taxi");
		case"camion":
			System.out.println("Le asigno un camion");
		default:
			System.out.println("Disculpe, el tipo no esta disoponible");
			break;
					
			}
			
	}
}
