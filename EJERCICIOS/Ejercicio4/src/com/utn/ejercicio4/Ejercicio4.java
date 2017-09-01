package com.utn.ejercicio4;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		int A = 2;
		int B = 3;
		int C = 9;
		int D = 15;
		
		cambioDeVariablesABCD(A,B,C,D);
	}
		
		public static void cambioDeVariablesABCD(int A, int B, int C, int D) {
			
		System.out.println("La variable A es = " + A);
		System.out.println("La variable B es = " + B);
		System.out.println("La variable C es = " + C);
		System.out.println("La variable D es = " + D);
		System.out.println("La variable B = C => " + (B=C));
		System.out.println("La variable C = A => " + (C=A));
		System.out.println("La variable A = D => " + (A=D));
		System.out.println("La variable D = B => " + (D=B));
		
	}

}

	
	
	
	
	