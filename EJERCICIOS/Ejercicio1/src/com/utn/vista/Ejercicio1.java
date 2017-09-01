package com.utn.vista;

public class Ejercicio1 {
	
	public static void main(String[] args) { //ojo aca! HAY QUE PONER EL TIPO DE PROCEDIMIENTO, EN ESTE CASO ES MAIN
	
	//1.doy valor a las variables
	int N=5;
	double A=4.56;
	char C='A';	
	//2.invoco el metodo variablesNAC
	variablesNAC(N,A,C);
	}
	
	//creo el metodo variablesNAC
	public static void variablesNAC(int N, double A, char C) {
	
	System.out.println("El valor de la variable N es: " + N);
	System.out.println("El valor de la variable A es: " + A);
	System.out.println("El valor de la variable C es: " + C);
	System.out.println("El resultado de N + A es igual a: " + (N + A));
	System.out.println("El resultado de A - N es igual a: " + (A - N));
	System.out.println("El valor numerico del caracter " + C + " es igual a: " + (int) C);
	}
}
