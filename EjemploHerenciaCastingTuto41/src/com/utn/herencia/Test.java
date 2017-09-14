package com.utn.herencia;

public class Test {

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo();//nuevo vehiculo
		
		v1.configura_color("Rojo Rubi");
		
		//nueva furgoneta _ nuevo vehiculo + constructor de furgoneta
		Furgoneta f1 = new Furgoneta(2, 1200);
				
		f1.configura_color("Verde Hulk");//metodo heredado de Vehiculo
		f1.configura_asientos("Si");//metodo heredado de Vehiculo
		f1.configura_climatizador("Si");//metodo heredado de Vehiculo
		
		
		System.out.println(v1.dime_datos_generales() + "\n" + v1.dime_color());
		
		System.out.println("__________________________________________________________");
		
		System.out.println(f1.dime_datos_generales() + "\n" + f1.dime_datos_furgoneta() + "\n" + f1.dime_climatizador() + "\n" + v1.dime_color());
		
		
		
		
		
		
		
		
	}

}
