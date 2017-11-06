package Genericos_Herencia_Tipos_Comodin;

public class Empleado {
	
	private String nombre;
	
	private String apellido;
	
	private double salario;
	
	private int edad;
	
	Empleado(String nombre, String apellido, int edad, double salario){
		
	this.nombre=nombre;
	this.apellido=apellido;
	this.edad=edad;
	this.salario=salario;
		
	}
	
	public String dameDatos() {
		
		return "El empleado se llama " + nombre + " " + apellido + ". Tiene " + edad + " años. Su salario es de " + salario + " pesos.";
	}

}
