package com.utn.vista;

import com.utn.reflect.ReflectionController;

public class Test {

	
	public static void main(String[] args) {
		ReflectionController rf = new ReflectionController();
		
		System.out.println("Ejecucion sin reflection");
		rf.noReflect();
		
		System.out.println("==========FIN============");
		System.out.println("Ejecucion con reflection");
		rf.reflect();
		
		System.out.println("===============");
		rf.allMethodPersona();
		
		System.out.println("===============");
		rf.allField();
		
		
		
	}
}
