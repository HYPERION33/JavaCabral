package com.utn.vista;

public class Test {
	static String nombre = "Mariano";//variable global

	public static void main(String[] args) {
		//invoco o llamo al procedimiento saludar()
		saludar();
		
		//creo dos variables de tipo enteros
		//invoco el procedimiento sumodosNumeros
		//las variables pueden tener cualquier nombre, solo deben entregar el TIPO de variable que el procedimiento esta solicitando
		int num1=4;
		int num2=4;
		sumoDosNumeros(num1, num2);
		
		//invoco al metodo datosPersonales
		//Acordarse siempre de primero dar valor a las variabels y luego invocar el metodo
		String nombre="Victor";
		int edad=40;
		boolean fuma=true;		
		datosPersonales(nombre,edad,fuma);
		
	}
	
		//creo procedimiento que salude
	public static void saludar() {
		// variable de forma local, descomentar si quieren utilizar: String nombre="Pablo";
		System.out.println("Hola " + nombre);
			
	}

		// suma de numeros
		// cuando trabajan con parametros verifican el orden, el tipo y cantidad
		// Ej: String, Int, boolean
	public static void sumoDosNumeros(int num1, int num2) {// firma

		System.out.println("El resultado es: " + (num1 + num2));
	}
	
		//procedieminto de datos personales
	public static void datosPersonales(String nombre,int edad,boolean fuma) {
		System.out.println("Su nombre es " + nombre);
		System.out.println("Su edad es " + edad);
		System.out.println("El sujeto fuma?: " + fuma);
		
	}
		//funcion que retorna a un valor de tipo cadena (String)
	public static String bienvenida() {
		return "Bienvenido a la aplicacion";
	}
	

}
