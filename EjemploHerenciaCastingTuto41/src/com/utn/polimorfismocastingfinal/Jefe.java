package com.utn.polimorfismocastingfinal;


public class Jefe extends Empleado{ //si declaro a la clase como "final", Director no puede heredar nada de Jefe.
	
	private double incentivo;

	public Jefe(String nom, double sue, int agno, int mes, int dia){
		
		super(nom, sue,agno,mes,dia);//constructor de la clase padre
		
	}

	//setter de incentivo
	public void dar_incenctivo(double b) {//va a recibir por parametro la variable double b
		
	incentivo = b;
		
	}
	
	public double dime_sueldo() { // este metodo invalida el metodo de la clase padre y sobreescribe con el metodo creado en esta clase.
		
		double suledoJefe = super.dime_sueldo();//la variable almacena al metodo dime_sueldo de la clase padre.
		
		return suledoJefe + incentivo;//una vez almacenada , sumo el incentivo.
	}
	
}
