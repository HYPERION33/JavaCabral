package com.ut.vista;

import com.ut.controller.AlumnoController;
import com.ut.modelo.Alumno;
import com.ut.modelo.Materia;

public class Test {

	public static void main(String[] args) {

		AlumnoController mc = new AlumnoController();
		Alumno a1 = new Alumno(1,22,"PABLO",7);
		
		mc.insertoAlumno(a1);
		
		a1 = new Alumno(1,15,"VANESA",5);
		mc.insertoAlumno(a1);
		
		mc.muestroAlumnoCursando();
		
	}

}
