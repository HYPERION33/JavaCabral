package com.utn.vista;
import com.utn.controlador.*;
import com.utn.modelo.AnimalEnfermo;
import com.utn.modelo.Tratamiento;

public class Main {
	
	public static void main(String[] args) {
		
				
		AnimalEnfermo [] animales = new AnimalEnfermo[20];
		
		Tratamiento [] tratamiento = new Tratamiento[20];
		 
		ControladorVeterinaria user = new ControladorVeterinaria();
		
		System.out.println("A continuacion solicite los datos al paciente...");
		System.out.println("NOTA:\nLe informamos que actualmente solo atendemos a CONEJOS, PERROS y GATOS.");
		System.out.println("===============================================================================");

			animales[0] = new AnimalEnfermo("aguila", "perro1" , "Random" , 12, 8.00, "No duerme");
	
			tratamiento[0] = new Tratamiento("zorro", "t1", "t1", 1000.00);
			
			animales[1] = new AnimalEnfermo("perro", "perro3" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[1] = new Tratamiento("t1", "t1", "t1", 1000.00);
			
			animales[2] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[2] = new Tratamiento("t1", "t1", "t1", 1000.00);
			
			animales[3] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[3] = new Tratamiento("t1", "t1", "t1", 1000.00);
			
			animales[4] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[4] = new Tratamiento("t1", "t1", "t1", 1000.00);
			
			animales[5] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[5] = new Tratamiento("t1", "t1", "t1", 1000.00);
			
			animales[6] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[6] = new Tratamiento("t1", "t1", "t1", 1000.00);
			
			animales[7] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[7] = new Tratamiento("t1", "t1", "t1", 1000.00);
			
			animales[8] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[8] = new Tratamiento("t1", "t1", "t1", 1000.00);

			animales[9] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[9] = new Tratamiento("t1", "t1", "t1", 1000.00);

			animales[10] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[10] = new Tratamiento("t1", "t1", "t1", 1000.00);

			animales[11] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[11] = new Tratamiento("t1", "t1", "t1", 1000.00);
			
			animales[12] = new AnimalEnfermo("gato", "gato1" , "Random" , 12, 8.00, "No duerme");

			tratamiento[12] = new Tratamiento("t2", "t2", "t2", 1000.00);
			
			animales[13] = new AnimalEnfermo("conejo", "conejo1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[13] = new Tratamiento("t3", "t3", "t3", 1000.00);
			
			animales[14] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[14] = new Tratamiento("t1", "t1", "t1", 1000.00);

			animales[15] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[15] = new Tratamiento("t1", "t1", "t1", 1000.00);

			animales[16] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[16] = new Tratamiento("t1", "t1", "t1", 1000.00);

			animales[17] = new AnimalEnfermo("perro", "perro1" , "Random" , 12, 8.00, "No duerme");
			
			tratamiento[17] = new Tratamiento("t1", "t1", "t1", 1000.00);
			
			animales[18] = new AnimalEnfermo("gato", "gato1" , "Random" , 12, 8.00, "No duerme");

			tratamiento[18] = new Tratamiento("t2", "t2", "t2", 1000.00);
			
			animales[19] = new AnimalEnfermo("gato", "gato1" , "Random" , 12, 8.00, "No duerme");

			tratamiento[19] = new Tratamiento("t2", "t2", "t2", 1000.00);
		
						
			for (int i = 0; i < animales.length && i < tratamiento.length ; i++ ) {
													
					user.iniciaConsulta(animales[i], tratamiento[i]);
				
			}
			
			user.reporte();
	}
	
}