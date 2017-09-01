package com.tutoriales.ejercicio;

import java.util.*;

public class Adivina_Numero {
	
	public static void main(String[] args) {
		
		//math.random es double, yo necesito un entero.
		//lo convierto en Int asi:
		
		int aleatorio = (int)(Math.random()*100);
		
	//	System.out.println(aleatorio);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;
		
		while(numero!=aleatorio) {
			
			intentos++;
			
			System.out.println("Introduce un numero por favor:");
			
			numero=entrada.nextInt();// numero sera igual al proximo entero que introduzcas en la consola.
			
			if(aleatorio < numero) {
				
				System.out.println("Demasiado alto.");
			}
			
			else if(aleatorio > numero) {
				
				System.out.println("Demasiado bajo.");
			}
		}
		
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intento/s.");
	}

}
