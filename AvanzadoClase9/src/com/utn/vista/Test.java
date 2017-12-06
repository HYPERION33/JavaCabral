package com.utn.vista;

import com.utn.dao.PersonaFactory;

public class Test {

	public static void main(String[] args) {
		
		PersonaFactory pf = new PersonaFactory();
		
		System.out.println(pf.getPersona(1));;

	}

}
