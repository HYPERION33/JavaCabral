package com.utn.modelo;

public class Test {

	
	public static void main(String[] args) {
		Jugador j = new Jugador();
		j.setNombre("El mono Gatti");
		//la forma de instanciar una clase anidada
		//es por medio de la instancia de la clase global
		//poniendo instancia.new + Clase Anidada();
		Jugador.Portero p = j.new Portero();
		
		p.setHabilidad("Atajar perfecto");
		
		System.out.println(j.getNombre());
		System.out.println(p.getHabilidad());
		
		
		
	}
}
