package com.utn.controlador;
import com.utn.modelo.*;

public class ControladorVeterinaria {
		
	AnimalEnfermo [] enfermos;
	
	Tratamiento [] receta;
	
	public void iniciarAnimalEnfermos() {
	
		enfermos = new AnimalEnfermo[0];
	}
	
	public void iniciarTratamiento() {
	
		receta = new Tratamiento[0];	
	}
			
	public void iniciaConsulta(AnimalEnfermo animal, Tratamiento recetaMedica) {
		
		iniciarAnimalEnfermos();
		
		iniciarTratamiento();
			
		Clinica clinicaVet  = new Clinica("``Veterinaria 24HS´´");
		
		Veterinarios doc1 = new Veterinarios("Dr.Jose","Perez",25);
		Veterinarios doc2 = new Veterinarios("Dra.Maria","Perez",32);
		Veterinarios doc3 = new Veterinarios("Dr.Esteban","Quito",34);
		Veterinarios doc4 = new Veterinarios("Dr.Oscar","Sultanito",40);
		Veterinarios doc5 = new Veterinarios("Dr.German","Menganito",50);
				
		String validaEspecie = animal.getTipo(); 
		
		switch (validaEspecie.toUpperCase()){
		
		case "PERRO":
		case "CONEJO":
		case "GATO":
		
			if(clinicaVet.getContadorPacientes() < clinicaVet.getMaxDiario()) {//capacidad max de la clinica
				
				System.out.println("INGRESANDO a " + clinicaVet.getNombre() + "...");
				System.out.println("BIENVENIDO PACIENTE N°: " + (clinicaVet.getContadorPacientes() + 1));
						
				if(doc1.getAtenciones() < doc1.getLimite1()) {
					
					for(int a = 0; a <= enfermos.length;a++ ) {
						System.out.println("DATOS DEL DR: ");
						System.out.println("El veterinario que lo atenderá sera: " + doc1.getNombreDoc() + " " + doc1.getApellidoDoc() +".");
						System.out.println("Su edad es: " + doc1.getEdadDoc());
						System.out.println("DATOS DEL PACIENTE: " + (clinicaVet.getContadorPacientes() + 1) + "_______________________________________________________");
						System.out.println("La especie del animal afectado es: " + animal.getTipo());
						System.out.println("El nombre del animal es: " + animal.getNombre());
						System.out.println("La raza es: " + animal.getRaza());
						System.out.println("El motivo de la consulta es: " + animal.getMotivoConsulta());
						
						for(int b = 0 ; b <= receta.length; b++) {
							System.out.println("TRATAMIENTO MEDICO_______________________________________________________");
							System.out.println("El diagnostico medico es: " + recetaMedica.getDiag());
							System.out.println("Las recomendaciones son: " + recetaMedica.getRecom());
							System.out.println("El medicamento para tratar la enfermedad es: " + recetaMedica.getMedicamento());
							System.out.println("El precio de la consulta es: " + recetaMedica.getPrecioConsulta());
							System.out.println("=========================================================================");
						}		
					}
					
					doc1.contarAte1();
					doc1.aumentarAtencion();
					clinicaVet.aumentaPacientes();
				}else if(doc2.getAtenciones() < doc2.getLimite2()){
				
					for(int a = 0; a <= enfermos.length;a++ ) {
						System.out.println("DATOS DEL DR: ");
						System.out.println("El veterinario que lo atenderá sera: " + doc2.getNombreDoc() + " " + doc2.getApellidoDoc() +".");
						System.out.println("Su edad es: " + doc2.getEdadDoc());
						System.out.println("_________________________DATOS DEL PACIENTE: " + (clinicaVet.getContadorPacientes() + 1) + "_______________________________________________________");
						System.out.println("La especie del animal afectado es: " + animal.getTipo());
						System.out.println("El nombre del animal es: " + animal.getNombre());
						System.out.println("La raza es: " + animal.getRaza());
						System.out.println("El motivo de la consulta es: " + animal.getMotivoConsulta());
						
						for(int b = 0 ; b <= receta.length; b++) {
							System.out.println("_________________________TRATAMIENTO MEDICO______________________________");
							System.out.println("El diagnostico medico es: " + recetaMedica.getDiag());
							System.out.println("Las recomendaciones son: " + recetaMedica.getRecom());
							System.out.println("El medicamento para tratar la enfermedad es: " + recetaMedica.getMedicamento());
							System.out.println("El precio de la consulta es: " + recetaMedica.getPrecioConsulta());
							System.out.println("=========================================================================");
						}		
					}
					
					doc2.contarAte2();
					doc2.aumentarAtencion();
					clinicaVet.aumentaPacientes();
				
				}else if(doc3.getAtenciones() < doc3.getLimite3()){
					
					for(int a = 0; a <= enfermos.length;a++ ) {
						System.out.println("DATOS DEL DR: ");
						System.out.println("El veterinario que lo atenderá sera: " + doc3.getNombreDoc() + " " + doc3.getApellidoDoc() +".");
						System.out.println("Su edad es: " + doc3.getEdadDoc());
						System.out.println("_________________________DATOS DEL PACIENTE: " + (clinicaVet.getContadorPacientes() + 1) + "_______________________________________________________");
						System.out.println("La especie del animal afectado es: " + animal.getTipo());
						System.out.println("El nombre del animal es: " + animal.getNombre());
						System.out.println("La raza es: " + animal.getRaza());
						System.out.println("El motivo de la consulta es: " + animal.getMotivoConsulta());
						
						for(int b = 0 ; b <= receta.length; b++) {
							System.out.println("_________________________TRATAMIENTO MEDICO______________________________");
							System.out.println("El diagnostico medico es: " + recetaMedica.getDiag());
							System.out.println("Las recomendaciones son: " + recetaMedica.getRecom());
							System.out.println("El medicamento para tratar la enfermedad es: " + recetaMedica.getMedicamento());
							System.out.println("El precio de la consulta es: " + recetaMedica.getPrecioConsulta());
							System.out.println("=========================================================================");
						}		
					}
					
					doc3.contarAte3();
					doc3.aumentarAtencion();
					clinicaVet.aumentaPacientes();			
				
				}else if(doc4.getAtenciones() < doc4.getLimite4()){
					
					for(int a = 0; a <= enfermos.length;a++ ) {
						System.out.println("DATOS DEL DR: ");
						System.out.println("El veterinario que lo atenderá sera: " + doc4.getNombreDoc() + " " + doc4.getApellidoDoc() +".");
						System.out.println("Su edad es: " + doc4.getEdadDoc());
						System.out.println("_________________________DATOS DEL PACIENTE: " + (clinicaVet.getContadorPacientes() + 1) + "_______________________________________________________");
						System.out.println("La especie del animal afectado es: " + animal.getTipo());
						System.out.println("El nombre del animal es: " + animal.getNombre());
						System.out.println("La raza es: " + animal.getRaza());
						System.out.println("El motivo de la consulta es: " + animal.getMotivoConsulta());
						
						for(int b = 0 ; b <= receta.length; b++) {
							System.out.println("_________________________TRATAMIENTO MEDICO______________________________");
							System.out.println("El diagnostico medico es: " + recetaMedica.getDiag());
							System.out.println("Las recomendaciones son: " + recetaMedica.getRecom());
							System.out.println("El medicamento para tratar la enfermedad es: " + recetaMedica.getMedicamento());
							System.out.println("El precio de la consulta es: " + recetaMedica.getPrecioConsulta());
							System.out.println("=========================================================================");
						}		
					}
					
					doc4.contarAte4();
					doc4.aumentarAtencion();
					clinicaVet.aumentaPacientes();
					
				}else if(doc5.getAtenciones() < doc5.getLimite5()){
					
					for(int a = 0; a <= enfermos.length;a++ ) {
						System.out.println("DATOS DEL DR: ");
						System.out.println("El veterinario que lo atenderá sera: " + doc5.getNombreDoc() + " " + doc5.getApellidoDoc() +".");
						System.out.println("Su edad es: " + doc5.getEdadDoc());
						System.out.println("_________________________DATOS DEL PACIENTE: " + (clinicaVet.getContadorPacientes() + 1) + "_______________________________________________________");
						System.out.println("La especie del animal afectado es: " + animal.getTipo());
						System.out.println("El nombre del animal es: " + animal.getNombre());
						System.out.println("La raza es: " + animal.getRaza());
						System.out.println("El motivo de la consulta es: " + animal.getMotivoConsulta());
						
						for(int b = 0 ; b <= receta.length; b++) {
							System.out.println("_________________________TRATAMIENTO MEDICO______________________________");
							System.out.println("El diagnostico medico es: " + recetaMedica.getDiag());
							System.out.println("Las recomendaciones son: " + recetaMedica.getRecom());
							System.out.println("El medicamento para tratar la enfermedad es: " + recetaMedica.getMedicamento());
							System.out.println("El precio de la consulta es: " + recetaMedica.getPrecioConsulta());
							System.out.println("=========================================================================");
						}		
					}
					
					doc5.contarAte5();
					doc5.aumentarAtencion();
					clinicaVet.aumentaPacientes();
				}
			}else {
				
				System.out.println("La veterinaria se encuentra operando a su maxima capacidad. Lo sentimos, no podemos atenderlo...");
			
			}
						
			break;
		
		default:
			
			System.out.println("ERROR, la clinica " + clinicaVet.getNombre() + " no atiende esta especie animal...");
			
			break;

		}
	
	}
	
	public void reporte() {
		
		Clinica clinicaVet  = new Clinica("``Veterinaria 24HS´´");
		
		Veterinarios doc1 = new Veterinarios("Dr.Jose","Perez",25);
		Veterinarios doc2 = new Veterinarios("Dra.Maria","Perez",32);
		Veterinarios doc3 = new Veterinarios("Dr.Esteban","Quito",34);
		Veterinarios doc4 = new Veterinarios("Dr.Oscar","Sultanito",40);
		Veterinarios doc5 = new Veterinarios("Dr.German","Menganito",50);
		
		System.out.println();
		System.out.println();
		System.out.println("==========================REPORTE DIARIO=======================================");
		System.out.println();
		System.out.println("La clinica " + clinicaVet.getNombre() + " atendio un total de: " + (clinicaVet.getContadorPacientes()) + " pacientes.");
		System.out.println();
		System.out.println("El doctor " + doc1.getNombreDoc() + " " + doc1.getApellidoDoc() + " atendio a " + doc1.getAtencionesMed1() + " animales.");
		System.out.println("El doctor " + doc2.getNombreDoc() + " " + doc2.getApellidoDoc() + " atendio a " + doc2.getAtencionesMed2() + " animales.");
		System.out.println("El doctor " + doc3.getNombreDoc() + " " + doc3.getApellidoDoc() + " atendio a " + doc3.getAtencionesMed3() + " animales.");
		System.out.println("El doctor " + doc4.getNombreDoc() + " " + doc4.getApellidoDoc() + " atendio a " + doc4.getAtencionesMed4() + " animales.");
		System.out.println("El doctor " + doc5.getNombreDoc() + " " + doc5.getApellidoDoc() + " atendio a " + doc5.getAtencionesMed5() + " animales.");
		
	}
}
	
