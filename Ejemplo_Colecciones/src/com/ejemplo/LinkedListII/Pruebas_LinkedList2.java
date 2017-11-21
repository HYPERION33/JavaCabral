package com.ejemplo.LinkedListII;

import java.util.LinkedList;
import java.util.ListIterator;

public class Pruebas_LinkedList2 {
	
	public static void main(String[] args) {

		LinkedList<String> paises=new LinkedList<String>();
		
		paises.add("Argentina");
		paises.add("España");
		paises.add("Peru");
		paises.add("Alemania");
		paises.add("Japon");
		
		LinkedList<String> capitales=new LinkedList<String>();
		
		capitales.add("Buenos Aires");
		capitales.add("Madrid");
		capitales.add("Lima");
		capitales.add("Berlin");
		capitales.add("Tokio");
		
		System.out.println(paises);
		System.out.println(capitales);
		
		//creo un ListIterator de las dos LinkedList
		ListIterator<String> iterA=paises.listIterator();
		ListIterator<String> iterB=capitales.listIterator();
	
		//hasNext() devuelve un boolean true si hay mas elementos
		//next()  devolvernos el objeto de la lista que acabamos de sobrepasar.
	
		while(iterB.hasNext()) {
			
			if(iterA.hasNext()) {
				
				iterA.next();
				
			}
			
			iterA.add(iterB.next());
		}
		
		System.out.println(paises);
		
		//para volver al principio de las listas, reiniciamos los iteradores.
		iterB=capitales.listIterator();
		//le borro los valores pares.
		while(iterB.hasNext()) {
			
			iterB.next();//avanzo al impar
			
			if(iterB.hasNext()) {
				
				iterB.next();
				
				iterB.remove();//avanzo al par y lo elimino
			}
			
			System.out.println(capitales);
		}
		
		//borra toda una coleecion
		paises.removeAll(capitales);
		
		System.out.println(paises);
		
	}
}
