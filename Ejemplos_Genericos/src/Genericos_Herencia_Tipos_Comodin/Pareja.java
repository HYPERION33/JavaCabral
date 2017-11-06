package Genericos_Herencia_Tipos_Comodin;

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
	
	public static void imprimirTrabajador(Pareja<? extends Empleado> e) {
		
		Empleado primero = e.getPrimero();
		
		System.out.println(primero);
		
		/*para poder utilizar las subclases como parametro agregamos
		 * 
		 * ? extends y solucionamos el error.
		 * 
		 * ver inicio...
		 */
		
		
	}

}
