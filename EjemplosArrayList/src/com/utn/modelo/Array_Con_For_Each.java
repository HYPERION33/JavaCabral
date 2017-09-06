package com.utn.modelo;
import javax.swing.*;

public class Array_Con_For_Each {
	
	public static void main(String[] args) {
		
		//for = por
		//each = cada
		
//		String [] paises = new String[8];
		
//		paises[0] = "Argentina";
//		paises[1] = "España";
//		paises[2] = "Mexico";
//		paises[3] = "Colombia";
//		paises[4] = "Peru";
//		paises[5] = "Chile";
//		paises[6] = "Uruguay";
//		paises[7] = "Ecuador";
				
		//ejemplo con for
		 
		/*for(int i=0; i<paises.length; i++) {
			
			System.out.println("Pais " + (i+1) + " " + paises[i]);
			
		}*/
	
//_______________________________________________________________________		
		//ejemplo for con JOption.pane
//		
//		for(int i=0; i<paises.length; i++) {
//			
//			paises[i]=JOptionPane.showInputDialog("introduce pais " + (i+1));
//			
//		}
//		
//		
//		//ejemplo for each
//		
//		for(String nombres:paises) {
//			
//						
//			System.out.println("Pais: " + nombres);
//		
//		}
//	____________________________________________________________________________	
		//ejemplo array random
		int[] matriz_aleatoria = new int[150];
	
		for(int i = 0; i < matriz_aleatoria.length; i++) {
			
			matriz_aleatoria[i]=(int)Math.round(Math.random()*100);
		}
		
		for(int numeros:matriz_aleatoria) {
			
			//System.out.println(numeros);
			
			System.out.print(numeros + " "); //para ver de manera horizontal
			
		}
		
		
		
	}
}
