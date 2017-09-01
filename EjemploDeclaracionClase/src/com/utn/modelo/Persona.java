package com.utn.modelo;

import java.util.Scanner;

public class Persona {

//	atributos
	private Scanner teclado;
	private String nombre;
	private int edad;
	
//	metodos (son los que no llevan static)
//	primer metodo inicializar() 
	public void inicializar () {
		
		teclado = new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Ingrese edad:");
		edad = teclado.nextInt();
		
	}
//	segundo metodo imprimir()
	public void imprimir() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	
	}
//	tercer metodo esMayorDeEdad
	public void esMayorDeEdad() {
		
		if(edad >= 18) {
			System.out.println(nombre + " es mayor de edad.");
		}
		
		else {
			System.out.println("No es mayor de edad");
		}
		
	}
}
