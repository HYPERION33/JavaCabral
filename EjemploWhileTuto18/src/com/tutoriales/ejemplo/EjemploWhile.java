package com.tutoriales.ejemplo;

import javax.swing.*;

public class EjemploWhile {
	
	public static void main(String[]args) {
		
		String clave = "Pablo";
		
		String pass = "";
		
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseņa");
			
			if(clave.equals(pass)==false) {//si la clave no es igual a pass
				
				System.out.println("Contraseņa incorecta.");
				
			}
		}
		
		System.out.println("Contraseņa correcta. Accceso permitido. \n"+ "Bienvenido " + clave);
		
	}

}
