package com.utn.ejercicio6;

public class Ejercicio6 {

	public static void main(String[] args) {
	
	int X = 1;
	
	variablePositivaONegativa(X);
	
	}
	
	public static void variablePositivaONegativa(int X) {
		
	System.out.println("La variable X es = " + X);
	System.out.println(X + (X>=0? " Es positivo." : " Es negativo."));
	
	}
}
