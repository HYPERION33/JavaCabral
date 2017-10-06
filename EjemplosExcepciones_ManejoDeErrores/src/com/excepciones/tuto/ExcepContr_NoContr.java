package com.excepciones.tuto;
import java.util.*;
public class ExcepContr_NoContr {

	public static void main(String[] args) throws InputMismatchException {
		// TODO Auto-generated method stub
		
		
		try {
			System.out.println("¿Qué deseas hacer?");
			System.out.println("1. Introducir datos...");
			System.out.println("2. Salir del programa...");
			
			Scanner entrada=new Scanner (System.in);
			
			int decision=entrada.nextInt();
			
			if (decision==1){
				
				pedirDatos();
				
			}else if(decision==2){
				
				System.out.println("Adios.");
				
				System.exit(2);
			}else {
				
				System.out.println("Opcion invalida.");
			}
			
			entrada.close();
			
		}catch(InputMismatchException e) {
			
			System.out.println("Opcion invalida.");
			
			ExcepContr_NoContr.main(args);//vuelvo a iniciar el metodo Main.
			
		}
	}
	
		static void pedirDatos() throws InputMismatchException{			
			
			
			/*
			 * THROWS = "lanzar" un error
			 * 
			 * si todo funciona bien, va a intentar ejecutar lo que se encuentra dentro de TRY.
			 * Si la cagas, va a generar un objeto del tipo "InputMismatchException" u otra "Exception" en
			 * la "e" asignada al CATCH y nos ejecutara el mensaje o la accion a tomar para el error atrapado.
			 * 
			 * el catch responde a la misma exception que lanza el metodo, si no es la misma
			 * debe ser una que este por encima en jerarquia.
			 *  
			 * "RuntimeException" y heredados:
			 * Es un error o excepcion NO COMPROBADA, esto implica que la 
			 * deficiencia del programa es responsabilidad del programador.
			 * Es decir, se puede codear mejor. 
			 *  
			 * "IOException" y heredados:
			 * Es un error o excepcion COMPROBADA.
			 * java nos obliga a capturar este error,de lo contrario no compila...
			 * utilizamos throws / try / catch
			 * 
			 * ambas clases antes mencionadas heredan de la clase padre "Exception"
			 *  
			 */
			
			
		try {
			
			Scanner entrada=new Scanner(System.in);
			
			System.out.println("Introduce tu nombre, por favor...");
			
			String nombre_usuario=entrada.nextLine();
			
			System.out.println("Introduce edad, por favor...");
			
			int edad=entrada.nextInt();	
				
			System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años.");
			
			entrada.close();
			
		}
		
		//Si en ves de "InputMismatchException" aca pongo "Exception"
		//el codigo va a funcionar igual, 
		//ya que Exception esta por encima de InputMismatchException en jerarquia
		
		catch(InputMismatchException e){//<-------
			
			System.out.println("La cagaste en la edad...");
		}
			System.out.println("Hemos terminado.");
		
		
	}
		
		
}