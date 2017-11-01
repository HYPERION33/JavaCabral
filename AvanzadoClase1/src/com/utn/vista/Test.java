package com.utn.vista;

import com.utn.modelo.Magia;
import com.utn.modelo.Perro;
import com.utn.modelo.Sucursal;

public class Test {

	public static void main(String[] args) {

		Perro p = new Perro();
		
		double resu = 1 + p.hablar("1");
		System.out.println(resu);
		
		Sucursal s = new Sucursal();
		
		Object o = new Object();
		o = new Magia();
		
		s.creoGenerico(o);
	}

}
