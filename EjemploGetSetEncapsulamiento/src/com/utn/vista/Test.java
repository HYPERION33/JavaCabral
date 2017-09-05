package com.utn.vista;

import com.utn.modelo.*;

public class Test {//Clase ejecutable
	
	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Fernando","Ureña",23, 8000.00); 
		
		Empleado empleado2 = new Empleado("Matias", "Gonzales", 55,10000.00);
	
//	mostramos el salario del empleado1
	System.out.println("El salario del empleado1 es: " + empleado1.getSalario());
//	modificamos la edad del empleado1
	empleado1.setEdad(60);
	empleado1.plus(120);
	
//	mostramos el nuevo salario del empleado1 con el plus de 100$
	System.out.println("El nuevo salario del empleado1 es: " + empleado1.getSalario());
	
//  modificamos el nombre del empleado2
	empleado2.setNombre("Sultanito");
	
//	mostramos el nuevo nombre del empleado2
	System.out.println("El empledo2 se llama: " + empleado2.getNombre());
		
	}

}
