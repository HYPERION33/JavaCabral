package com.ejemplo.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Cuenta_Clientes {

	public static void main(String[] args) {
		
		Cliente cl1=new Cliente("Pablo Cabral", "100023", 32.000);
		Cliente cl2=new Cliente("Penelope Cruz", "100080", 100.000);
		Cliente cl3=new Cliente("Carlos Tevez", "100011", 4000000);
		Cliente cl4=new Cliente("Lio Messi", "000001", 999999999);
		Cliente cl5=new Cliente("Lio Messi", "000001", 999999999);
		
		Set<Cliente> clientesBanco=new HashSet<Cliente>();
		
		/*Add()...
		 *Agrega objetos del tipo generico que le hemos indicado...
		 */
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		
		//ojo aca...objeto duplicado.
		//solucionado con hashcode y equals automaticos...
		clientesBanco.add(cl5);
		
		
		//remover un nombre utilizando el Iterator
		//declaro la interfaz Iterator y llamo al metodo iterator().
		Iterator<Cliente> it=clientesBanco.iterator();
		
		while(it.hasNext()) {
			
			String nombre_cliente=it.next().getNombre();
			if(nombre_cliente.equals("Carlos Tevez")) {
				
				it.remove();
			}
			
		}
		
		//recorrer nombres con Iterator
		//OJO, no se muestra xq el Iterador ya recorrio arriba..
		//mientras halla un siguiente elemento it
		while(it.hasNext()) {
			
			//va a ser igual a lo que el it examine LUEGO de saltar...	
			String nombre_cliente=it.next().getNombre();
			System.out.println();
			System.out.println(nombre_cliente);
		}
		
		//recorrer los elementos almacenados...
		for (Cliente c : clientesBanco) {
			
			System.out.println(c.getNombre() + " " + c.getN_cuenta() + " " + c.getSaldo());
			
		}
		
//		ERROR- no se puede modificar una Coleccion mientras es recorrida.
		
//		for (Cliente c : clientesBanco) {
//			
//			if(c.getNombre().equals("Carlos Tevez")) {
//				
//				clientesBanco.remove(c);
//			}
//		}
		
	}
		
}