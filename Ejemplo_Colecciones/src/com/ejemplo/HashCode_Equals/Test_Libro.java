package com.ejemplo.HashCode_Equals;

public class Test_Libro {

	public static void main(String[] args) {
	
		Libro lib1=new Libro("P en JAVA", "Cabral", 10);
		Libro lib2=new Libro("P en JAVA", "Cabral", 12);

		//lib1=lib2; igualo referencia de objetos a manopla...
		
//		equals() no distingue lo que hay en clases propias, solo revisa memorias.
		if(lib1.equals(lib2)) {
			
			System.out.println("Son iguales...");
			System.out.println(lib1.hashCode());
			System.out.println(lib2.hashCode());
		
		}else {
			
			System.out.println("No son iguales...");
			System.out.println(lib1.hashCode());
			System.out.println(lib2.hashCode());
		}
		
		
	}

}
