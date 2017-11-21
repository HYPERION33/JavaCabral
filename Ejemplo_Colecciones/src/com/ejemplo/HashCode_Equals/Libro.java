package com.ejemplo.HashCode_Equals;

public class Libro {
	
	private String titulo;
	private String autor;
	private int ISBN;
		
	public String getdatos() {
		
		return "El titulo es: " + titulo + ". El autor es: " + autor + ". El ISBN es: " + ISBN;
	}

	public Libro(String titulo,String autor,int ISBN) {
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
		
		/*HashCode()...numero que localiza a un espacio de memoria unico.
		 * 
		 * Stack = espacio de memoria donde se almacena un tipo primitivo que puede variar.
		 * 
		 * Heap = espacio de memoria donde se crea una instancia de clase.
		 * Este espacio se vincula a Stack y a traves de una referencia de Stack a Heap.
		 *
		 */
		
		// el codigo ISBN es lo que define como diferente a un libro.
		
	}
	
	/* Eclipse trae la opcion para construir el metodo Equals()
	 * y el metodo HashCode() de manera automatica, solo debemos indicar en source
	 * cual va a ser el atributo que defina como identicos a las instancias de objetos.
	 * En este caso el ISBN...
	 * 
	 * Recordar que la coomparacion en clases predefinidas ya esta configurada,
	 * sin embargo en clases propias no ocurre lo mismo.
	 * 
	 * por ese motivo son metodos muy utilizados.
	 */

	@Override//HashCode() para ISBN automatico...
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}

	@Override//Equals() para ISBN automatico...
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	
//	//metodo equals a manopla....
//	public boolean equals(Object obj) {
//			
//		if(obj instanceof Libro) {
//			
//	//casting de obj para convertirlo en libro, asi lo podre evaluar...
//			Libro libroNew = (Libro) obj;		
//	//comparo el ISBN de los dos objetos.		
//			if(this.ISBN==libroNew.ISBN) {
//				return true;
//			}else {
//				return false;
//			}	
//		}
//		return false;
//	}
		
	
	
	
	
	
	
	
	
	
	
	
}
