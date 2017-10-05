package com.excepciones.tuto;
import javax.swing.*;

public class Error {
	
	public static void main(String[] args) {
		
		//imprime el vector en pantalla
		
		int [] mi_matriz = new int [5];
		
		mi_matriz[0] = 0;
		mi_matriz[1] = 12;
		mi_matriz[2] = 20;
		mi_matriz[3] = 33;
		mi_matriz[4] = 50;
		mi_matriz[5] = 100; //RuntimeExcepcion "Excepcion no controlada" alias: mejora el codigo culiao!
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Posicion " + i + " = " + mi_matriz[i]);
		}
	
		// pide el nombre y la edad y lo imprime en pantalla
	
		String nombre = JOptionPane.showInputDialog("Introduce el nombre: ");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad: "));
		
		System.out.println("Hola " + nombre + ", tienes " + edad + " años." );
		
	}
}
