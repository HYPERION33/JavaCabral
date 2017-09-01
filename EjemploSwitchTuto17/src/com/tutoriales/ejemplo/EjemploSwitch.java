package com.tutoriales.ejemplo;

import java.util.*; 	//para la clase Scanner
import javax.swing.*; 	//para la clase JOptionPane.

public class EjemploSwitch { 
	
	public static void main(String[] args) { // La consola nos muestra el area de la opcion seleccionada
	
		Scanner entrada = new Scanner(System.in);
		// \n muestra la linea y despues va hacia la linea de abajo
		System.out.println("Elige una opcion.....: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo\n4: Circulo");
	
		int figura = entrada.nextInt(); // vamos a almacenar en la variable figura el proximo entero que el user introduzca en consola.
		
		switch(figura) { //quiero evaluar lo que hay almacenado en la variable figura
		
		case 1:
			//showImputDialog es estatico asi que no hace falta crear un nuevo objeto de la clase
			//ImputDialog resuelve un string, Int pide un entero.
			//lo solucionamos con metodo parseInt perteneciente a la clase Integer.
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:"));
			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
			break;
		
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
			System.out.println("El area del rectangulo es: " + base*altura);
			break;
	
		case 3:// no volver a colocar int, ya que la variable sera duplicada. ya ha sido creada en el rectangulo.
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
			System.out.println("El area del triangulo es: " + (base*altura)/2);
			break;
		
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio:"));
			//
			System.out.print("El area del circulo es: ");	
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2))); // printf para limitar la cantidad de decimales que nos da el resulta
			break;
			
		default:
			System.out.println("La opcion no es correcta.");
			break;
		}
	}	
}
