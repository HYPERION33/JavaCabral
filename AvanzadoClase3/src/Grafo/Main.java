package Grafo;

public class Main {
	
	public static void main(String[] args) {
		
		Nodo<Ciudad> n1 = new Nodo<Ciudad>(new Ciudad("Argentina"));//se hace asi
		Nodo<Ciudad> n2 = new Nodo<Ciudad>(new Ciudad("Bs.As")); 
		Nodo<Ciudad> n3 = new Nodo<Ciudad>(new Ciudad("CABA")); 
		Nodo<Ciudad> n4 = new Nodo<Ciudad>(new Ciudad("Cordoba")); 
		
		System.out.println(n2.getDato());
		n2.setAnterior(n1);
		System.out.println(n2);
		
		/*Colecciones (LIST - MAP - SET)
		 * 
		 * STACK-OVERFLOW
		 * 
		 * key value (puede ser cualquier cosa) es el "indice" del mapa
		 * 
		 * hash map 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
	}

}
