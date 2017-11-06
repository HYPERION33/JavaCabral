package Genericos_crear_propios;

public class Inicio {

	public static void main(String[] args) {
		
		Pareja<String> unaPareja = new Pareja<String>();
		
		//el generico de los metodos de la clase
		//se adaptan al argumento que le damos al instanciar la clase.
		
		unaPareja.setPrimero("Pablo");// le paso String
		
		System.out.println(unaPareja.getPrimero());
		
		//----------------- otro ejemplo
		
		Persona p1 = new Persona("Gago");
		
		Pareja<Persona> segundaPareja = new Pareja<Persona>();
		
		segundaPareja.setPrimero(p1);//le paso Persona
		
		System.out.println(segundaPareja.getPrimero());
		
	
	}

}

class Persona{
	
	private String nombre;
	
	public Persona(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String toString() {
		
		return nombre;//sobreescribe el metodo toString de la clase Object
					  // me devuelve el "nombre"
	}
	
}