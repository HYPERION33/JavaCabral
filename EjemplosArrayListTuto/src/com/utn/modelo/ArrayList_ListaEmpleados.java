package com.utn.modelo;
import java.util.*;//aca esta el ArrayList

public class ArrayList_ListaEmpleados {
	
	public static void main(String[] args) {//metodo main ........ vista en MVC
	
		/*Empleado listaEmpleados [] = new Empleado[3];  con vector...
	
		listaEmpleados [0] = new Empleado("Jose","Lopez",45,2000);
		listaEmpleados [1] = new Empleado("Marcos","Arrodillado",23,9000);
		listaEmpleados [2] = new Empleado("Debora", "Meltrozo",18,12000);*/
	
		//con ArrayList...
		//nota: el array list ,por defecto, aloja una clase entre <>. no aloja valores primitivos
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		//1.llamo al metodo Arraylist
		//2.dentro de <> va el tipo de clase que quiero que el array guarde
		//3.nombro al array "listaEmpleados" en este caso
		//4.creo un nuevo arraylist con: new Arraylist y le vuelvo a especificar la clase y luego ()
		//5. para cada nuevo objeto dentro del array se usa el metodo add.
		
		listaEmpleados.add(new Empleado("Jose","Lopez",45,2000));
		listaEmpleados.add(new Empleado("Marcos","Arrodillado",23,9000));
		listaEmpleados.add(new Empleado("Debora", "Meltrozo",18,12000));
		listaEmpleados.add(new Empleado("Ojos", "D´huevo",21,12000));
		listaEmpleados.add(new Empleado("Pito", "Corto",22,12000));
		listaEmpleados.add(new Empleado("Hippie", "Maldonado",21,12000));
	//	listaEmpleados.add(new Empleado("Macri", "Gato",55,12000));
		
		/*con .set elegimos el indice de nuestro objeto
		 * Ej. macri gato estaba ultimo y lo mandamos al primer lugar
		 */
		
		listaEmpleados.set(0, new Empleado("Macri", "Gato",55,12000));
		
		
		//con .get (indice) elegimos el indice que queremos mostrar por pantalla
		System.out.println("Prueba de ArrayList.get " + listaEmpleados.get(2));
		System.out.println();
		//agrego .dameDatos para ver el contenido de ese indice
		System.out.println("Prueba de ArrayList.get " + listaEmpleados.get(2).dameDatos());
		System.out.println();
		
		
		//no tiene limite como el vector, pero ocupa mas memoria.
		
			System.out.println(listaEmpleados.size() + " son los indices de este ArrayList.");
			System.out.println();
			
			//en caso de saber cunatos indices tiene mi Array
			
			
			listaEmpleados.ensureCapacity(3);
			
			/*si desconozco la cantidad de indices que voy a usar:
			 * array por defecto tiene 10 espacios, 
			 * con trimtosize lo transformo en 3 espacios y 
			 * me ahorro la memoria de los otros 7
			 */
		
			listaEmpleados.trimToSize();
		
		for(Empleado e : listaEmpleados) {//for each
		
			System.out.println(e.dameDatos());
		
		}
		
		
		//con for tradicional
		
//		for(int i = 0; i<listaEmpleados.size(); i++) {
//			
//			Empleado e = listaEmpleados.get(i);
//			
//			System.out.println(e.dameDatos());
//		}
		
		
		
		
// se puede transformar el ArrayLisat a Vector asi:
		
		Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];
		
		listaEmpleados.toArray(arrayEmpleados);
		
// y despues utilizarlo como un Vector normalmente:
		
		for(int j=0; j < arrayEmpleados.length; j++) {
			
			System.out.println(arrayEmpleados[j].dameDatos());
		}
	}
	
}
class Empleado{ //en MVC seria modelo
		
		//atributos de empleado
		private String nombre;
		private String apellido;
		private int edad;
		private double salario;
		
		public Empleado(String nombre, String apellido, int edad, double salario) {//constructor de la clase Empleado
			
			this.nombre=nombre;
			this.apellido=apellido;
			this.edad=edad;
			this.salario=salario;
	
		}
		
		public String dameDatos() {//getter que entrega la info del empleado
			
			return "El empleado se llama: " + apellido + ", " + nombre + ". Tiene " + edad + " años de edad y cobra: " + salario;
		}	
		
}
	

