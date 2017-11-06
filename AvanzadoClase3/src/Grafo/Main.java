package Grafo;

public class Main {
	
	public static void main(String[] args) {
		
		Ciudad c1 = new Ciudad("Argentina");//asi no, asi NO!
		Ciudad c2 = new Ciudad("Buenos Aires");
		Ciudad c3 = new Ciudad("Cordoba");
		Ciudad c4 = new Ciudad("CABA");
		
		Nodo<Ciudad> n1 = new Nodo<Ciudad>(new Ciudad("Argentina"));//se hace asi
		
		Nodo<Ciudad> n2 = new Nodo<Ciudad>(c2); 
		Nodo<Ciudad> n3 = new Nodo<Ciudad>(c3); 
		Nodo<Ciudad> n4 = new Nodo<Ciudad>(c4); 
		
		System.out.println(c2.getNombre());
		n1.setAnterior(n1);
		System.out.println(n1.getAnterior());
		n1.setSiguiente(n4);
		System.out.println(n1.getSiguiente());
		
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
