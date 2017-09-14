package com.utn.polimorfismocastingfinal;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	
	private String nombre;
	private double sueldo;
	private Date altacontrato;
	private int id;
	private static int idSiguiente = 0; //variable estatica de la CLASE Empleado
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {// constructor de empleado
		
	nombre=nom;
	
	sueldo=sue;
	
	GregorianCalendar calendario = new GregorianCalendar(agno , mes , dia ); //fecha de ingreso
		
	altacontrato = calendario.getTime();//devuelvo los datos del calendario y los mete en altacontrato
	
	++idSiguiente;// aumenta en 1 la variable estatica
	
	id=idSiguiente;// id es igual a la variable estatica
	}
	
	public Empleado(String nom) {//segundo constructor de Empleados 
		
		this(nom,30000, 2000,01,01);
	}

	public String dime_nombre() { //getter nombre
		
		return nombre + " Id " + id;
	}
	
	public double dime_sueldo() { //getter nombre
		
		return sueldo;
	}
	
	public Date dime_fecha_contrato() { //getter fecha de inicio
		
		return altacontrato;
	}
	
	public void sube_sueldo(double porcentaje) {//setter de sueldo
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo += aumento;
		
	}
}
