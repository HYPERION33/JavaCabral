package com.utn.ejercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {
		
	int C = 100;
	
	detallesDeVariable(C);
	
	}
	
	public static void detallesDeVariable(int C) {
		
	System.out.println("El valor de la variable C es = " + C);
	System.out.println(C + (C>=0? " Es positivo." : " Es negativo."));
	System.out.println(C + (C%2==0 ? " Es par." : " Es impar."));
	System.out.println(C + (C%5==0 ? " Es multiplo de 5." : " No es multiplo de 5."));
	System.out.println(C + (C%10==0 ? " Es multiplo de 10." : " No es multiplo de 10."));
	System.out.println(C + (C==100? " Es igual a 100." : (C>100? " Es mayor a 100." : " Es menor a 100.")));//100 es menor a 100? :V
	//agrego otro condicional ? para hacerlo igual a 100.
	
	}
}
