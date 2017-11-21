package com.ejemplo.Map;

import java.util.HashMap;
import java.util.Map;

public class Prueba_Mapas {
	
	public static void main(String[] args) {
		
		HashMap<String,Empleado> mapa_personal = new HashMap<String,Empleado>();
		
		mapa_personal.put("1", new Empleado("German"));
		mapa_personal.put("2", new Empleado("Natalia"));
		mapa_personal.put("3", new Empleado("Pablo"));
		mapa_personal.put("4", new Empleado("Pablo"));
	
		System.out.println(mapa_personal);
		
		mapa_personal.remove("4");
		
		System.out.println(mapa_personal);
	
		mapa_personal.put("1", new Empleado("Reemplazo"));
		
		System.out.println(mapa_personal);
		
		//lo devuelve entre corchetes, esi se imprime un SET.
		System.out.println(mapa_personal.entrySet());
		
		for(Map.Entry<String,Empleado> entrada : mapa_personal.entrySet()) {
			
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			
			System.out.println("Clave= " + clave + " Valor= " + valor );
		}
		
	}

}

class Empleado{
	
	public Empleado(String n) {
		
		nombre=n;
		sueldo=200;
	}
	
	public String toString() {
		
		return "[Nombre= " + nombre + ",Sueldo= " + sueldo + "]";
	}
	
	private String nombre;
	
	private double sueldo;
}

