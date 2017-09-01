package com.utn.modelo;

import java.util.Scanner;

public class Triangulo {
	
	private Scanner teclado;
	private int lado1,lado2,lado3;

	public void inicializar() {
		
		teclado = new Scanner(System.in);
		System.out.println("Medida del Lado 1: ");
		lado1=teclado.nextInt();
		System.out.println("Medida del Lado 2: ");
		lado2=teclado.nextInt();
		System.out.println("Medida del Lado 3: ");
		lado3=teclado.nextInt();
		
	}

	public void ladoMayor() {
		
		System.out.println("Lado Mayor");
		if(lado1 > lado2 && lado2 > lado3) {
			System.out.println(lado1);
		}else {
			if(lado2 > lado3) {
				System.out.println(lado2);
			}else {
				System.out.println(lado3);
			}
			
		}	
	}
	
	public void equilatero() {
		
		if(lado1==lado2 && lado2==lado3) {
			System.out.println("El triangulo es equilatero.");	
		}else {
			System.out.println("El triangulo no es equilatero");
		}
		
	}
}
