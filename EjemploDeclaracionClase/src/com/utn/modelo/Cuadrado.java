package com.utn.modelo;

import java.util.Scanner;

public class Cuadrado {
	
	private Scanner teclado;
	private int lado;
	
	public void inicializar() {
		
		teclado = new Scanner(System.in);
		System.out.println("Ingrese valor de los lados: ");
		lado = teclado.nextInt();
	
	}
	
	public void imprimirPerimetro() {
	
		int perimetro;
		perimetro = lado*4;
		System.out.println("El perimetro del cuadrado es: " + perimetro);
	
	}

	public void imprimirSuperficie() {
		
		int superficie;
		superficie = lado*lado;
		System.out.println("La superficie del cuadrado es: " + superficie);
		
	}
}
