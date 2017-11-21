package com.utn.vista;

import com.utn.controller.EmpleadoController;
import com.utn.modelo.Empleado;

public class Prueba {

	public static void main(String[] args) {
	
		EmpleadoController ec=new EmpleadoController();
		Empleado e1=new Empleado("Pablo", "Cabral", 23, 29, "Tecnico");
		
		ec.insertEmpleado(e1);
		ec.muestraEmpleados();
		
		//ec.borroEmpleados(1);
		
	}

}
