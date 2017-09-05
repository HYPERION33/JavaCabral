package com.utn.modelo;

//	Clase empleado que muestra la informacion del empleado
public class Empleado {
//	atributos
	
		private String nombre;
		private String apellido;
		private int edad;
		private double salario;
		
//		metodos publicos (las demas clases tienen acceso)
		
		public String getNombre() { //devuelve el nombre seteado del empleado
			return nombre;
		}
		public void setNombre(String nombre) { //modifica "setea" el nombre del empleado
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}		

		public boolean plus(double sueldoPlus) { 
//		si el empleado tiene mas de cuarenta años le suma un plus a su salario
//		parametro sueldoPlus
//		return
//		true: suma el plus al salario del epmleado
//		false:no suma plus
			boolean aumento = false; //boolean del metodo es aumento y es falso por defecto
			if(edad>40 && compruebaNombre()){
				salario += sueldoPlus;
				aumento=true;
			}
			return aumento;	//regresa al principio del metodo.
	
//		metodos privados
		}
		private boolean compruebaNombre() {
			if(nombre.equals("")) {
				return false;
			}
			return true;
		}

//		Constructor por defecto
		
		public Empleado() {
		this.nombre="";
		this.apellido="";
		this.edad=0;
		this.salario=0;	

		}

		public Empleado(String nombre, String apellido, int edad, 	double salario) {

		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.salario=salario;
			
		}	
}
