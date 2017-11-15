package com.ut.controller;

import java.sql.SQLException;

import com.ut.factory.MateriaFactory;
import com.ut.modelo.Materia;

public class MateriaController {

	private MateriaFactory mf;
	
	public MateriaController() {
		this.mf=new MateriaFactory();
	}
	
	
	public void insertoMateria(Materia materia)
	{
		try {
			mf.insert(materia);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void muestroMateriasCargadas() {
		try {
			for (Materia item : mf.getAll()) {
				System.out.println(item);
			};
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
