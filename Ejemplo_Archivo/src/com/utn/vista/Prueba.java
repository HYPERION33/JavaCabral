package com.utn.vista;

import com.utn.cotroller.Autito_Serializable;
import com.utn.modelo.Autito;

public class Prueba {
	
	public static void main(String[] args) {
			
	Autito_Serializable az=new Autito_Serializable();
	
	Autito a1=new Autito("Rojo", "Ferrari", 1000);
	Autito a2=new Autito("Azul", "Porche", 780);
	Autito a3=new Autito("Plata", "BMW", 890);
	
	
	az.serializoObjeto(a1);
	System.out.println();
	az.desserializoObjeto(a1);
	
	az.serializoObjeto(a2);
	System.out.println();
	az.desserializoObjeto(a2);
	
	az.serializoObjeto(a3);
	System.out.println();
	az.desserializoObjeto(a3);
	

	}
}
