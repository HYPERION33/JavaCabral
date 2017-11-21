package Colecciones;

public class Teoria {
	
	/*
	 *COLECCION:
	 *almacen de objetos DINAMICOS durante la ejecucion de un programa.
	 * 
	 * Ventajas:
	 * Cambian de tamaño dinamicamente.
	 * Se puden ordenar los objetos dentro de la coleccion.
	 * Se pueden insertar o eliminar elementos. (no almacena primitivos).
	 * 
	 * 
	 * Interfaz PADRE COLLECTION
	 * 
	 * extiende SET, LIST, QUEUE	
	 * 
	 * No extiende MAP.
	 * 
	 * SET extiende SortedSet.
	 * MAP extiende SortedMap.
	 * __________________________________________________________________
	 * 
	 * SET: Almacena objetos NO repetidos y lo hace sin ordenar.
	 * 
	 * QUEUE: Cola, no permita acceso aleatorio. su acceso se puede hacer desde el principo o el final.
	 * MAP: Coleccion de elementos repetibles indexados por una clave (KEY) unica arbitraria.
	 * 
	 * LIST:
	 * 
	 * Ventajas:
	 *	Acceso aleatorio.
	 *	Objetos ordenados.(se puede usar collection.sort()).
	 *	Se pude añadir y eliminar sin restricciones, incluyendo repetidos.
	 *  ListIterator modifica en cualquier ubicacion.
	 * 	Sintaxis similar a los Arrays
	 * 
	 * Desventajas:
	 * 	Bajo rendimiento en operaciones concretas que se resolverian mejor con otras Interfaces.
	 * 
	 * Clases Utlizadas:
	 * 	ArrayList:
	 * 		Muy rapida accediendo a elementos.
	 * 		Se adapta a un gran numero de escenarios.
	 * 
	 * 	LinkedList:
	 * 		Listas enlazadas.
	 * 		Gran eficiencia agregando y eliminando elementos.
	 * 
	 * 	Vector:
	 * 		Se considera obsoleto.
	 * 		Utilizada unicamente en operaciones de concurrecncia.
	 * 
	 * 	CopyOnWriteArrayList:
	 * 		Utilizada en programas concurrentes.
	 * 		Eficiente en operaciones de lectura.
	 * 		Muy poco eficiente en operaciones de escritura.
	 * _________________________________________________________________	
	 * 
	 * SET:
	 * 
	 * Ventajas:
	 * 		No permite elementos duplicados.
	 * 		uso sencillo del metodo Add,que ademas aegura no insertar elementos duplicados.
	 * 
	 * Desventajas:
	 * 		No tienen acceso aleatorio.
	 * 		Poca eficiencia a la hora de ordenar elementos (y no siempre se puede).
	 * 
	 * Clases Utilizadas:
	 *  
	 *  HashSet:
	 *  	Rapida.
	 *  	Evita duplicados.
	 *  	No ordena.
	 *  	No hay acceso aleatorio.		
	 * 
	 *  LinkedHashSet:
	 *  	Ordenacion por entrada.
	 * 		Eficiente al acceder.
	 * 		No es eficiente para agregar nuevos objetos.
	 * 
	 * 	TreeSet:
	 * 		Es ordenado.
	 * 		Poco eficiente.
	 * 
	 * 	EnumSet:
	 * 		La mejor para tipos enumerados.
	 * 
	 * 	CopyOnWriteArrayList:
	 * 		Uso especifico en concurrecncia.
	 * 		Admite ordenacion.
	 * 		No es eficiente si posee muchos elementos.
	 * __________________________________________________________________
	 * 
	 * MAPS:
	 * 	
	 * 	Ventajas:
	 * 		Elementos asociados a una clave (KEY) y un valor de clave.
	 * 		Las KEYS siempre deben ser diferentes.
	 * 
	 *  Desvetajas:
	 * 		Poca eficiencia comparado con las demas colecciones.
	 * 
	 * 	Clases Utilizadas:
	 * 		
	 * 	 HashMap:
	 * 		No hay ordenacion de elementos.
	 * 		Es eficiente.
	 * 
	 * 	 LinkedHashMap:
	 * 		Ordena elementos pos insercion.
	 * 		Permite la ordenacion por uso.
	 * 		Eficiente lectura.
	 * 		Poca eficencia en escritura.
	 * 
	 * 	 TreeMap:
	 * 		Ordenado por clave.
	 * 		Poco eficiente en todas sus operaciones.
	 * 
	 * 	 EnumMap:
	 * 		Permite tipos Enum como claves.
	 * 		Muy eficiente.
	 * 
	 * 	 WeakHashMap:
	 * 		Utilizado para crear elementos que vaya borrando el sistema si no se utilizan.
	 *		Muy poco eficiente.
	 *
	 * 	 HashTable:
	 * 		Considerado obsoleto.
	 * 		Utilizado en operaciones de concurrencia.
	 * 
	 * 	 ConcurrentHashMap:
	 * 		Utilizado en concurrencia.
	 * 		No permite nulos.
	 * ___________________________________________________________________
	 * 
	 * QUEUES (COLAS):
	 *  
	 *  Ventajas:
	 *  	Muy rapido al acceder al primer y ultimo elemento.
	 * 		Permite crear coas de elemnetos muy eficientes (LIFO / FIFO).
	 * 
	 *  Desventajas:
	 *  	Acceso lento a los elemnetos intermedios.
	 *  
	 *  Clases Utilizadas:
	 *  
	 *    ArrayDeque:
	 *   	Gran eficiencia.
	 *   	La mas utilizada.
	 *   
	 *    LinkedBlockingDeque:
	 *   	Uilizado en programacion concurrente.
	 *   
	 *    LinkedList:
	 *    	Rendimiento inferior al ArrayDeque.
	 *    
	 *    PriorityQueue:
	 *    	Para utilizar un Comparator.
	 *    	El primer elemento dependerá de la propiedad elegida.
	 * 
	 * 	  PriorityBlockingQueue:
	 * 		Igual que el anterior, pero mas eficiente en programacion concurrente.
	 */

}
