package Metodos_Genericos;

public class MisMatrices {
	
	/*
	 * para definir un metodo generico debemos, como en las clases genericas,
	 * establecer el tipo de variable entre corchetes angulares <>
	 * 
	 * utilizo T para definir el arguemnto que recibe el metodo como un generico.
	 * 
	 * 
	 */
	public static <T> String getElementoArray(T[] z) {
		
		return "El Array tiene " + z.length + " elementos."; 
				
	}
	
	/*	Definimos <T> para indicar que es un metodo generico.
	 * 	Definimos T para indicar que el metodo DEVUELVE un valor generico.
	 * 
	 * ej.: 
	 * si paso un entero recibo un entero, 
	 * si paso una clase devuelvo una clase.
	 * 
	 */
	
	public static <T extends Comparable> T getMenorArray(T[] z){
		
		/*Usar comareTo
		 * pertenece a la interfaz Comparable
		 * 
		 * compara los Objetos de dos listas y los ordena.
		 * 
		 * devuelve un int negativo si el Objeto es menor
		 * devuelve 0 si son iguales
		 * devuelve un int positivo si es mayor
		 * 
		 * uso extends dentro de la definicions de generico para
		 * implementar la INTERFAZ Comparable
		 *
		 *se usa EXTENDS y NO IMPLEMENTS
		 *ya que necesito que TODOS los Objetos que le pasemos como 
		 *argumento implenten la interfaz Comparable.
		 *
		 *ej.:
		 *
		 *Persona no implementa Comparable, es por eso que va a dar error.
		 * 
		 */
		
		if(z==null || z.length==0) {
			
			return null;
		}
		
		T elementoMenor = z[0];
		
		for(int i=1; i<z.length; i++) {
			
			if(elementoMenor.compareTo(z[i])>0){
				
				elementoMenor=z[i];
			}
		}
		
		return elementoMenor;
	}

}

class Persona{
	
	private String nombre;
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String toString() {
		
		return nombre;
	}
	
}