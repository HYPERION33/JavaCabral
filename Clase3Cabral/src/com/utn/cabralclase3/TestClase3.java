package com.utn.cabralclase3;

public class TestClase3 {

	public static void main(String[] args) {
		
		/*String name = "Pablo";	Estas son variables globales.
		int edad = 23;				de ahora en mas es mejor utilizar variables locales,
		double peso = 75.6;			en el caso de que una nueva clase llame a este metodo 
		double altura = 1.74;		solo recibira la info del metodo y no de toda esta clase "TestClase3" */
		
		//cargoDatos(name,edad,peso,altura)
		
		cargoDatos("Pablo",23,75.3,1.75);
				
	}

	
	public static void cargoDatos(String nombre, int edad, double peso, double altura) {
		System.out.print("Nombre " + nombre + ", ");
		calculoIMC(altura, peso);
	}
	
	
	// menor 18.5 estas flaco
	// entre 18.5 y 24.9 ( peso normal)
	// 25 a 29.9 sos un gordito feliz
	// 30 gordo obeso
	public static void calculoIMC(double altura, double peso) {

		double res = peso / (altura * altura);

		if (res <= 18.5) {
			System.out.println("Estas flaco");
		} else if (res > 18.5 && res <= 24.9) {
			System.out.println("Estas optimo");
		} else if (res >= 25 && res <= 29.9) {
			System.out.println("Tenes sobrepeso");
		} else {
			System.out.println("Estas obeso");
		}

	}

}
