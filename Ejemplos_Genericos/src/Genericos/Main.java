package Genericos;

import java.io.File;
import java.util.ArrayList;


/*GENERICOS
 * 
 * Obj:
 * a.Reutilizacion de código por medio de "parametros de tipo" escrito entre "<Tipo>"
 * b.Sirve para manjear cualquier tipo de objeto.
 * c.Codigo mas sensillo.
 * d.Comprobacion de errores en tiempo de copilacion.
 * e.Evitar los errrores de casteo, los cuales son:
 * 		1e.Uso continuo de Castin, dificultad de leer y manejar
 * 		2e.La imposibilidad de comprobar errore en tiempo de compilacion, apareceran en tiempo de ejecucion.
 * 
 */

public class Main {

	public static void main(String[] args) {//main
		
		//Ejemplo 1 
		
		ArrayList archivos = new ArrayList(4);
		
		archivos.add("Mengano");
		
		archivos.add("Sultano");
		
		archivos.add("Fulano");
		
		archivos.add("Namequiano");
		
		/*String nombrePersona = archivos.get(2); 
		 * 
		 * ERROR, no puede covertir un String a un tipo Object.
		 * usamos Casting.
		 * 
		 */
		
		String nombrePersona = (String) archivos.get(2);//Casting 
		
		System.out.println(nombrePersona);//lo imprimo
		
		// Ejemplo 2
		
		ArrayList archivos2 = new ArrayList(4);
		
		archivos2.add(new File("FechasClientes2.odb.tar.7z"));
		
		File nombreArchivo = (File)archivos2.get(0);
		
		System.out.println(nombreArchivo);
		
		//Ejemplo 3
		
		ArrayList archivos3 = new ArrayList(5);
				
			archivos3.add("Mengano");
			
			archivos3.add("Sultano");
			
			archivos3.add("Fulano");
			
			archivos3.add("Namequiano");
			
			// ERROR ----->  archivos3.add(new File("fechasClientes2.odb.tar.7z"));
			
			String visualizar = (String) archivos3.get(3);// usar 4 para ejemplo ERROR
			
			System.out.println(visualizar);
			
		/*No hay error de COMPILACION, 
		 *sin embargo va a dar ERROR en tiempo de ejecucion.
		 */
				
	//Ejemplo 4 utilizando un generico <String>
				
	ArrayList<String> listaEmpleados = new ArrayList<String>(4);
	
		listaEmpleados.add("Mengano");
			
		listaEmpleados.add("Sultano");
			
		listaEmpleados.add("Fulano");
			
		listaEmpleados.add("Namequiano");
			
		//ERROR ---->	 listaEmpleados.add(new File("fechasClientes2.odb.tar.7z"));
						
		/*Utilizando un GENERICO del tipo <String> nos muestra el ERROR en tiempo de compilacion.
		 * 
		 * esto pasa xq el array esta defino SOLO para recibir datos del tipo String.
		 * 
		 */
		
	}
}


