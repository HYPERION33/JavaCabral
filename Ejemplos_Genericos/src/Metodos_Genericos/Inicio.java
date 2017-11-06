package Metodos_Genericos;

/*Un METODO que podemos utilizar con cualquier tipo de Objetos.
 * 
 * podemos crearlo dentro de una clase generico y 
 * tambien dentro de una clase ordinaria
 *
 */
public class Inicio {
	
	public static void main(String[] args) {
		
		
		String nombres[] = {"Pablo", "Gustavo", "Nicolas"};
		
		String elementos = MisMatrices.getElementoArray(nombres);//invoco al metodo STATIC
	
		System.out.println(elementos);
		
		Persona listaPersonas[] = { new Persona("Jose"),
									new Persona("Pepe"),
									new Persona("Cholo"),
									new Persona("Victor")
		};
		
		System.out.println(MisMatrices.getElementoArray(listaPersonas));
		
		//la impresion con el metodo estatico MisMatrices se adapta al parametro que recibe.
	
	
		System.out.println(MisMatrices.getMenorArray(nombres));
		
		// ERROR ----> System.out.println(MisMatrices.getMenorArray(listaPersonas));
	}
	
}
