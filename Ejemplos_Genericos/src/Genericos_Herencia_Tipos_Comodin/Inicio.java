package Genericos_Herencia_Tipos_Comodin;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Empleado Administrativa = new Empleado("Elena", "Lopez", 45, 12000);
	
	Jefe Directora_Comercial = new Jefe("Ana","Roque", 50, 23000);
	
	//Jefe siempre ES UN... Empleado
	
	Empleado Administrativa_Nueva = Directora_Comercial;
	*/	
		
		Pareja<Empleado> Administrativa = new Pareja<Empleado>();
		
		Pareja<Jefe> DirectoraComercial = new Pareja<Jefe>();
		
		//ERROR ----> Pareja<Empleado> Administrativa_Nueva = DirectoraComercial;
		
		//no se puede convertir tipo Empleado a tipo Jefe en genericos.
	
		Pareja.imprimirTrabajador(Administrativa);//si le quiero pasar Jefe como argumento da error.
	
		/*
		 * luego de agregar ? extends en el metodo imprimirTrabajador 
		 * podemos utilizar Jefe (que hereda de Empleado) como parametro
		 * 
		 */
		
		Pareja.imprimirTrabajador(DirectoraComercial);
	}
	
	

}
