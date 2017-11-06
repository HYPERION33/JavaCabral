package Genericos;

public class Ejemplo_ArrayList_1 {
	
	//contructor, recibe por parametros lo que será tamaño del Array.
	
	public Ejemplo_ArrayList_1 (int z) {
		
		datosElemento = new Object[z];
		
	}

	//nos devuelve un elemento en concreto seleccionado por el parametro.
	public Object getElemento(int i) {

		return datosElemento[i];
	}
	
	//recibe por parametro tipo Objeto y lo almacena en una posicion en concreto.
	public void addElemento(Object o) {
		
		datosElemento[i] = o;
		
		i++;
	}

	private Object[] datosElemento;

	private int i = 0;

}
