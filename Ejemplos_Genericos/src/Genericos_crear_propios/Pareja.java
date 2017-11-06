package Genericos_crear_propios;

/*para transformar a CLASE GENERICA le colocamos los corchetes angulares
 * y le indicamos el tipo de argumento
 * 
 * T,U,K por convencion
 * 
 */

public class Pareja <T> {
	
	private T primero;
	
	public T getPrimero() {
		return primero;
	}

	public void setPrimero(T nuevoValor) {
		
		this.primero = nuevoValor;
	}
	
	public Pareja() {
		
		primero=null;
	}
	
	

}
