package com.ut.vista;

import com.ut.controller.MateriaController;
import com.ut.modelo.Materia;

public class Test {

	public static void main(String[] args) {

		MateriaController mc = new MateriaController();
		Materia m1 = new Materia();
		m1.setNombre("java");
		
		mc.insertoMateria(m1);
		
		m1 = new Materia();
		m1.setNombre(".net");
		mc.insertoMateria(m1);
		
		mc.muestroMateriasCargadas();
		
	}

}
