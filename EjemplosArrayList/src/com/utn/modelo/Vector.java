package com.utn.modelo;

public class Vector {
	
	public static void main(String[] args) {
		
		int [] mi_vector = new int[5];
		
		mi_vector[0]=5;
		mi_vector[1]=12;		
		mi_vector[2]=51;
		mi_vector[3]=-35;
		mi_vector[4]=-500;
		
		
		
//		int [] mi_vector = {5,12,51,-35,-500,100,200,300,1234,12,3,4,5,9}; modo simplificado
		
//		System.out.println(mi_vector[0]); muy engorroso
//		System.out.println(mi_vector[1]);
//		System.out.println(mi_vector[2]);
//		System.out.println(mi_vector[3]);
//		System.out.println(mi_vector[4]);
		
//		usamos bucle for
		
		for(int i = 0; i < mi_vector.length; i++){
			//iniciacion del bucle: i=0
			//condicion: menor a 5, si no se cuantos indices tengo uso .lenght
			//incremental del bucle: i++
			
			System.out.println("El valor del indice " + i + " es: " + mi_vector[i]);
		}
	}
}
