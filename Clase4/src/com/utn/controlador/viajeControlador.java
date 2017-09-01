package com.utn.controlador;

import com.utn.modelo.Conductor;

public class viajeControlador {
	
		public void recorrido() {
			//me creo el objeto del condutor
			//objeto 1
			Conductor mrmagoo = new Conductor();
			mrmagoo.nombre = "mr";
			mrmagoo.apellido = "magoo";
			mrmagoo.edad=80;
			
			mrmagoo.conducir();
			
			//nuevo objeto conductor
			//objeto 2
			Conductor c1 = new Conductor();
			c1.nombre = "magui";
			c1.apellido = "simpson";
			c1.edad=4;
			
			c1.conducir();
					
					
	}

}
