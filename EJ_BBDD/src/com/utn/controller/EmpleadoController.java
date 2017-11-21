package com.utn.controller;

import java.sql.SQLException;
import com.utn.factory.EmpleadoFactory;
import com.utn.modelo.Empleado;

public class EmpleadoController {
	
	private EmpleadoFactory ef;
	
	public EmpleadoController() {
		
		this.ef=new EmpleadoFactory();
		
	}
	
	public void insertEmpleado(Empleado e1) {
		
		try{
		ef.insert(e1);	

		}catch(SQLException | ClassNotFoundException e) {
		e.printStackTrace();	
			
		}
		
	}

	public void muestraEmpleados() {
		
		try {
			for (Empleado item : ef.getAll()) {
				System.out.println(item);
				
			}
		}catch(SQLException | ClassNotFoundException e){
		e.printStackTrace();	
			
		}
	}
	
	public void borroEmpleados(int id) {
		
		try {
			ef.delete(id);			
			
		}catch(SQLException | ClassNotFoundException e) {
		e.printStackTrace();	
			
		}
	}
}