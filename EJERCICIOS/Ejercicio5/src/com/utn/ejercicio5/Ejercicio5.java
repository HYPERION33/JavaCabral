package com.utn.ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		
	int X = 60;
	
	variableParOImpar(X);
	
	}
	
	public static void variableParOImpar(int X) {
		
	System.out.println("X = " + X);
	System.out.println(X + (X%2==0 ? " Es par." : " Es impar."));
		
		
	}
	
}

