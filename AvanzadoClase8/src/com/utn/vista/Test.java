package com.utn.vista;

import com.utn.modelo.Persona;

public class Test {

	public static void main(String[] args) {

		System.out.println("===INICIO===");
		Persona p = new Persona();
		
		p.setNombre("Gargamel");
		p.setApellido("Klein");
		
		System.out.println(p.fullname());
		System.out.println("======");
		p.muestroDatos();
		
		
		System.out.println("===FIN===");
	}

}
