package com.ejemplo.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Prueba_LinkedList {
	
	/*las LinkedList estan unidas por un "nodo" al elemento anterior y al siguiente elemento.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> persona=new LinkedList<String>();
		
		persona.add("Pablo");
		persona.add("Ivan");
		persona.add("Ambar");
		persona.add("Yael");
		
		System.out.println(persona.size());
		
		//por defecto se agrega al final.
		persona.add("Nayla");
		
		//tambien esta: persona.add(index, element);
		//pero...
		//como agregar si desconozco la posicion del indice?
	
		ListIterator<String> it=persona.listIterator();
		
		it.next();
		
		// aparece luego del primer indice.
		it.add("Victor");
		
		for(String p : persona) {
			
			System.out.println(p);
			
		}
		
	}

}
