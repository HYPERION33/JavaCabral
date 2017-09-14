package com.utn.polimorfismocastingfinal;

public class Test {

	public static void main(String[] args) {
		
		Jefe jefeRRHH = new Jefe ("Ortiva", 55000, 2017,02,10);;
		
		jefeRRHH.dar_incenctivo(3333333);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado ("Jorge", 10000, 2017,1,12);
		misEmpleados[1] = new Empleado ("Gustavo", 11000,2010,10,11);
		misEmpleados[2]	= new Empleado ("Melina", 900,2010,10,3);	
		misEmpleados[3]	= new Empleado ("Nacho", 11000,2015,1,11);
		misEmpleados[4] = jefeRRHH;//POLIMORFISMO. principio de sustitucion.
		
		/* POLIMORFISMO:
		 * se puede utilizar un objeto de la SUBclase
		 * siempre que el programa espere un objeto 
		 * de la SUPERclase */
		
		misEmpleados[5] = new Jefe ("Luca", 30000, 2000,5,26);//Polimorfismo
		
		/*CASTING
		 *  Es un....?
		 *  Un Jefe es obligatoriamente un Empleado.
		 *  Un Empleado no es siempre un Jefe.
		 */
		
		//si quiero establecer incentivo a [5] por medio de .dar_incentivo no nos deja.
		//xq hace referenceia a el array y el array es un empleado, no un Jefe.
		
		// Casteo en variables primitivas:
		
		double num1 = 7.5; //declaro la variable
		int num2= (int) num1;//declaro la nueva variable, indico a que tipo de valor lo quiero transformar y declaro la variable a transformar.
		
		//Casteo con objetos es igual:
		
		Jefe jefeAdministracion = (Jefe) misEmpleados[5];//casting de indice 5.
		
		jefeAdministracion.dar_incenctivo(8888888);//ahora si podemos acceder al metodo de la clase Jefe.
		
		
		for(Empleado e : misEmpleados) {
			
			e.sube_sueldo(5);
			
		//no se podria usar por ejemplo con el indice 1, xq un Empleado no es siempre un Jefe.

		}
		
		for(Empleado e : misEmpleados) {
			
			System.out.println("Nombre: " + e.dime_nombre());
			System.out.println("Sueldo: " + e.dime_sueldo());
			System.out.println("Fecha de alta: " + e.dime_fecha_contrato());
			
		}
	} 
}
