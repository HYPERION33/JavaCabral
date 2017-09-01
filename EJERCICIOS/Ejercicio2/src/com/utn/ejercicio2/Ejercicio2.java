package com.utn.ejercicio2;

public class Ejercicio2 {
		//creo el procedimiento
	public static void main(String[] args) {
	
		//1.le doy valor a las variables X,Y,N, y M
		int X=1;
		int Y=2;
		double N=3.2;
		double M=4.7;
		//2.invoco el metodo variablesXYNM
		variablesXYNM(X,Y,N,M);			
	}
		//creo el metodo variablesXYNM
		public static void variablesXYNM (int X, int Y, double N, double M) {
			
			System.out.println("El valor de la variable X es: " + X);
			System.out.println("El valor de la variable Y es: " + Y);
			System.out.println("El valor de la variable N es: " + N);
			System.out.println("El valor de la variable M es: " + M);
			System.out.println("La suma X + Y es: " + (X + Y));
			System.out.println("La diferencia X - Y es: " + (X - Y));
			System.out.println("El producto X * Y es: " + (X * Y));
			System.out.println("El cociente X / Y es: " + (X / Y));
			System.out.println("El resto X % Y es: " + (X % Y));
			System.out.println("La suma N + M es: " + (N + M));
			System.out.println("La diferencia N - M es: " + (N - M));
			System.out.println("El producto N * M es: " + (N * M));
			System.out.println("El cociente N / M es: " + (N / M));
			System.out.println("El resto N % M es: " + (N % M));
			System.out.println("El doble de cada variable es: " + "X=" + (X * 2) + " ,Y=" + (Y * 2) + " ,N=" + (N * 2) + " ,M=" + (M * 2));
			System.out.println("La suma de todas las variables es: " + (X + Y + N + M));
			System.out.println("El producto de todas las variables es: " + (X * Y * N * M));
	}

}
