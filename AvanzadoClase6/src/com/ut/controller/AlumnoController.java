package com.ut.controller;

import java.sql.SQLException;

import com.ut.factory.AlumnoFactory;
import com.ut.modelo.Alumno;
import com.ut.modelo.Materia;

public class AlumnoController {

	private AlumnoFactory af;
	
	public AlumnoController() {
		this.af=new AlumnoFactory();
	}
	
	
	public void insertoAlumno(Alumno alum)
	{
		try {
			af.insert(alum);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void muestroAlumnoCursando() {
		try {
			for (Alumno item : af.getAll()) {
				System.out.println(item);
			};
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
