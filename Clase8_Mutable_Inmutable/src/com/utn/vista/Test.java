package com.utn.vista;

import com.utn.controlador.Persona;

public class Test {
	
	public static void main(String[] args) {
		
		//Ejemplo de variable mutable
		
		/* String nombre = "Pablo";
		System.out.println(nombre);
		
		nombre = "Ivan";
		System.out.println(nombre); */
		
		//Ejemplo de variable inmutable
		final String nombre = "Pablooo";
		System.out.println(nombre);
		
		// nombre = "Ivan"; no se puede volver a inicializar xq es inmutable
		// System.out.println(nombre);
		
		//Ejemplo de instancia inmutable
		final Persona p = new Persona();
		
		p.nombre = "Cabral";
		
		System.out.println(p.nombre);
		
		p.nombre="Amilcar";
		p.apellido="Albertino";
		
		System.out.println(p.nombre);
		
		// p = new Persona(); no se puede volver a dar un valor a la instancia
		
		Persona p1 = p; // p = p1
		System.out.println("=====TRABAJO CON P1 =====");
		System.out.println(p1.nombre);
		System.out.println(p1.apellido);
		p.edad=25;
		
		p1.nombre = "Axel";
		p1.apellido = "Berlot";
		
		System.out.println("=====TRABAJO CON P =====");
		System.out.println(p.nombre);
		System.out.println(p.apellido);
		System.out.println(p1.edad);
		
		//ver posicion de memoria
		System.out.println(p);
		System.out.println(p1);
		System.out.println("===============================");
		
		p1=new Persona();
		System.out.println(p1);
		p1.nombre="Agustin";
		p1.apellido="De la iglesia";
		System.out.println(p1.nombre);
		System.out.println(p1.apellido);
	
		
		
	}

}
