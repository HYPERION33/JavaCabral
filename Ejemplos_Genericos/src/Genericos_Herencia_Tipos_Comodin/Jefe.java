package Genericos_Herencia_Tipos_Comodin;

public class Jefe extends Empleado{
	
	public Jefe(String nombre, String apellido, int edad, double salario) {
		
		super(nombre, apellido, edad, salario);
		
	}
	
	double Incentivo(double inc) {
		
		return inc;		
		
	}

}
