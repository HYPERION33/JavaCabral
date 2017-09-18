package com.utn.ejemplo;

import java.util.Scanner;

public class EjemploScanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //crear un objeto Scanner
		
		String nombre;
		double radio;
		int n;
		
		System.out.println("Introduzaca su nombre: ");
		nombre = sc.nextLine(); //leer un String y lo coloca en la proxima linea (nextLine)
		System.out.println("Hola " + nombre + " !!!");
		System.out.println("Introduzca el radio de la circunferencia: ");
		radio = sc.nextDouble();//leer un double
		System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);   
		System.out.println("Introduzca un numero entero: ");
		n = sc.nextInt(); 		//leer un entero
		System.out.println("El cuadrado es: " + Math.pow(n,2));
	
		sc.close();//cerrar Scanner
	}

}
