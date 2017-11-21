package com.ejemplo.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Prueba_TreeSet {
	
	/* No permite elemntos duplicados.
	 * No permite acceso aleatorio.
	 * Permite ordenar lo elementos de su interior.
	 * Poco eficiente.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		TreeSet<String> ordPersonas=new TreeSet<String>();
		
		ordPersonas.add("Marcos");
		ordPersonas.add("Jorge");
		ordPersonas.add("Diana");
		ordPersonas.add("Maria");
		
		for(String s : ordPersonas) {
			
			System.out.println(s);
			
		}
	//Se ordena por defecto, y por defecto String ordena alfabeticamente.
	//String implementa la interfaz Comprable que trae el metodo compareTo();
	//Utiliza compareTo para ordenar...
			
		Articulos primero=new Articulos(1, "c primero");
		Articulos segundo=new Articulos(2, "a segundo");
		Articulos tercero=new Articulos(3, "b tercero");	
		
		TreeSet<Articulos> ordenoArticulos=new TreeSet<Articulos>();
		
		ordenoArticulos.add(primero);
		ordenoArticulos.add(tercero);
		ordenoArticulos.add(segundo);
		
		for(Articulos art : ordenoArticulos) {
			
			System.out.println(art.getDescripcion());
		}
		
// utilizo el constructor vacio, ya que no me sirve el de dos elementos.
//		Articulos comparatorArticulos=new Articulos();
// los objetos se van a almacenar ordenados segun lo que marque el comparador.
//		TreeSet<Articulos> ordenoArticulos2=new TreeSet<Articulos>(comparatorArticulos);
		
// sin clase interna...agrego la instancia de ComparaArticulos() en el TreeSet.
		//ComparadorArticulos com_art=new ComparadorArticulos();
		//TreeSet<Articulos> ordenoArticulos2=new TreeSet<Articulo>(com_art);
		
// con clase interna...
		TreeSet<Articulos> ordenoArticulos2=new TreeSet<Articulos>(new Comparator<Articulos>() {
			
			public int compare(Articulos o1, Articulos o2) {
				String desA=o1.getDescripcion();
				String desB=o2.getDescripcion();
				
				return desA.compareTo(desB);
			
			}
		});
		
		ordenoArticulos2.add(primero);
		ordenoArticulos2.add(tercero);
		ordenoArticulos2.add(segundo);
		
		for(Articulos art : ordenoArticulos2) {
			
			System.out.println(art.getDescripcion());
			
		}
	}
}
	
//En el caso de introducir de objetos creados por mi...
//Comparable<> para las clases predefinidas y orden por default.
class Articulos implements Comparable<Articulos>{
	
	private int numero;
	private String descripcion;
	
	public Articulos(int numero, String descripcion) {
		
		this.numero=numero;
		this.descripcion=descripcion;
	}
	
	public String getDescripcion() {
		
		return descripcion;
	}
	
//implemento compareTo()....
	@Override
	public int compareTo(Articulos o) {
// Devolveme el numero de articulo - el numero de articulo de otro objeto...
// ordena con los numeros de articulos.
		return numero - o.numero;
	}
}

//Comparator<> para las clases propias y orden especificado por mi.
//implemento compare()...	
//para comparar con clases propias...
class ComparadorArticulos implements Comparator<Articulos>{

	@Override
	public int compare(Articulos o1, Articulos o2) {
		String desA=o1.getDescripcion();
		String desB=o2.getDescripcion();
		
		return desA.compareTo(desB);
	}
	
}
