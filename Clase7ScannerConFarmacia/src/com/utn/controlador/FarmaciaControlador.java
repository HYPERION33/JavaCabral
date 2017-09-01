package com.utn.controlador;

import java.util.Scanner;

import com.utn.modelo.Cliente;

public class FarmaciaControlador {

	public void vendoMedicamentos(Cliente cliente) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("amiguito escriba cualquier cosa");
		String variable = "salir";
		
		while(variable.equals("salir")) {
			
			System.out.println("Que desea comprar?");
			System.out.println("1 - Mejoralito");
			System.out.println("2 - Bayaspirina");
			System.out.println("3 - Rivotril");
			
			if(variable.equals("1")) {
				System.out.println("El señor compro una bayaspirina");
			}
			
			System.out.println("Si desea salir escriba 'salir'");
//			variable = input.nextLine();
			
		}
		System.out.println("fin del el bucle");
		
		System.out.println(variable);
	/*}
	
	public void atiendo() {
		Scanner input = new Scanner(System.in);
		String var="salir";
		int i =1;
		do {
			System.out.println(i);
			i++;
			
		} while (var.equals("salir")); //esto va a dar verdadero y la voy a cagar!
		*/	
	}
}
