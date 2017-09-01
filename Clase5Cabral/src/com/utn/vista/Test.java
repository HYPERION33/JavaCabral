package com.utn.vista;

import com.utn.modelo.Persona;

public class Test {
	public static void main(String[] args) {// comienzo main en el cual voy a instancear a la clase Persona
	
	Persona[] tecnicos = new Persona[3];	//creamos el vector con Array tomado de la instancia Persona
	//lo nombramos tecnicos y le damos valor de indices "[10]" 
	
	Persona tec1 = new Persona();//creamos la instancia Persona tec1
	tec1.nombre = "Luciano";
	tec1.apellido = "Ortiz";
	tec1.edad = 24;
	tec1.turno = false;
	
	tecnicos[0] = tec1;			 //asigno la instancia tec1 al indice [0]
	
	Persona tec2 = new Persona();//creo la instancia Persona tec2
	tec2.nombre = "Lucas";
	tec2.apellido = "Tejada";
	tec2.edad = 26;
	tec2.turno = false;
	
	tecnicos[1] = tec2;			 //asigno la instancia tec2 al indice[1]
	
	Persona sup1 = new Persona();
	sup1.nombre = "Pablo";
	sup1.apellido = "Cabral";
	sup1.edad = 23;
	sup1.turno = true;
	
	tecnicos[2] = sup1;			 //asigno la instancia sup1 al indice[2]
	
	//muestro en la pantalla los datos de las instancias creadas.
	System.out.println("Cantidad de puestos disponibles en el sector = " + tecnicos.length);// tecnicos.length = cantidad de indices
	for (int i = 0; i < tecnicos.length; i++) { //nombre generico a los indices "i", int porque son enteros; condiciones de i; 
		//i++ (al valor i le suma una unidad y genera un bucle)
		if(i < tecnicos.length) {
			System.out.println("Datos del tecnico: ");
			System.out.println("Nombre :" + tecnicos[i].nombre);
			System.out.println("Apellido :" + tecnicos[i].apellido);
			System.out.println("Edad :" + tecnicos[i].edad);
			System.out.println("Es full time?: " + tecnicos[i].turno);
			System.out.println("________________________________________________");			
		}else {System.out.println("valor fuera del indice disponible" + i);// ESTA PARTE NO FUNCIONA 
		}
	}
	
	int[] edades = {2 , 3 , 4 , 7 , 9 , 17 , 18 , 20 , 22 , 25 , 33 , 40 , 47 , 49};
	for (int f = 0; f < edades.length; f++) 
		
		if (edades[f] > 9 && edades[f] <= 18) {
			System.out.println(edades[f] + " Pertenece al cilco superior");
		}else {
			System.out.println(edades[f] + " No pertenece al ciclo superior"); // COMO AGREGAR LA CONDICION PAR AMAYORES Y PARA MENORES?
		}

	}
	
	
}

	
	
		
	
	

