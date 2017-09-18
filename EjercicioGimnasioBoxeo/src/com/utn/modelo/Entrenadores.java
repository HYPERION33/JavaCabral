package com.utn.modelo;

import com.utn.modelo.Boxeadores;

public class Entrenadores {
	
//Atributos
	public String nombreMoscaGallo = "Claudio";
	public String nombrePlumaLigero = "Victorio";
	public String nombreWelterMediano = "Vanessa";
	public String nombreMedioPesadoPeasoPesado = "Tyson";
	
	public int claudio = 0;
	public int victorio = 0;
	public int vanessa = 0;
	public int tyson = 0;	
	
	public int maxAlumnosPorGimnasio = 40;
	public int maxAlumnosCategoria = 4; // EL INDICE DE BOX COMIENZA A TENER VALORES DESDE 0,
	//SI QUIERO TRES ALUMNOS MI LIMITE ES "2"
	public int contador = 0;
	
	public int maxMosca = maxAlumnosCategoria;//ESTO PUEDE SER UN VECTOR
	public int maxGallo = maxAlumnosCategoria;
	public int maxPluma = maxAlumnosCategoria;
	public int maxLigero = maxAlumnosCategoria;
	public int maxWelter = maxAlumnosCategoria;
	public int maxMediano = maxAlumnosCategoria;
	public int maxMedioPesado = maxAlumnosCategoria;
	public int maxPesado = maxAlumnosCategoria;
	
	
	public int cuentaMosca = contador;//ESTO TAMBIEN PUEDE SER UN VECTOR
	public int cuentaGallo = contador;
	public int cuentaPluma = contador;
	public int cuentaLigero = contador;
	public int cuentaWelter = contador;
	public int cuentaMediano = contador;
	public int cuentaMedioPesado = contador;
	public int cuentaPesado = contador;	
	
	public Boxeadores[] BoxeadoresAprendiendo;
	
	public int maxIndiceVectores = 0;
	
	public double moscaMin = 48.988; 
	public double moscaMax = 50.802;
	public double galloMin = 52.163;
	public double galloMax = 53.525;
	public double plumaMin = 55.338;
	public double plumaMax = 57.152;
	public double ligeroMin = 58.967;
	public double ligeroMax = 61.237;
	public double welterMin = 63.503;
	public double welterMax = 66.678;
	public double medianoMin = 69.853;
	public double medianoMax = 72.562;
	public double medioPesadoMin = 76.205;
	public double medioPesadoMax = 79.378;
	public double pesado = 91;
	
	public void iniciarBoxeadoresAprendiendo() {//metodo para iniciar el vector
		BoxeadoresAprendiendo = new Boxeadores[0]; 
	}
	
	
//Creamos metodo asignarCategoria()

	public void asignarCategoria(Boxeadores boxeador) {
		
		iniciarBoxeadoresAprendiendo();
				
		if(maxIndiceVectores < maxAlumnosPorGimnasio ) {
			
			System.out.println("El boxeador es asignado...");
			
			for(int a = 0; a <= BoxeadoresAprendiendo.length; a++) {
				
				if(boxeador.peso < galloMin) {
					System.out.println(boxeador.nombre + " PESA: " + boxeador.peso + ". Asignado a MOSCA. ");
					if(cuentaMosca <= maxMosca) {					
					System.out.println("Su entrenador sera " + nombreMoscaGallo);
					cuentaMosca++;
					claudio++;
					}
					else {System.out.println("Categoria sin disponibilidad");
					}	
				
				}	
				else if(boxeador.peso >= galloMin && boxeador.peso < plumaMin) {
					System.out.println(boxeador.nombre + " PESA: " + boxeador.peso + ". Asignado a GALLO. ");
					if(cuentaGallo <= maxGallo) {
					System.out.println("Su entrenador sera " + nombreMoscaGallo);
					cuentaGallo++;
					claudio++;
					}
					else {System.out.println("Categoria sin disponibilidad");
					}
					
				}	
				else if(boxeador.peso >= plumaMin && boxeador.peso < ligeroMin) {
					System.out.println(boxeador.nombre + " PESA: " + boxeador.peso + ". Asignado a PLUMA. ");
					if(cuentaPluma <= maxPluma) {					
					System.out.println("Su entrenador sera " + nombrePlumaLigero);
					cuentaPluma++;
					victorio++;
					}
					else {System.out.println("Categoria sin disponibilidad");
					}
							
				}	
				else if(boxeador.peso >= ligeroMin && boxeador.peso < welterMin) {
					System.out.println(boxeador.nombre + " PESA: " + boxeador.peso + ". Asignado a LIGERO. ");	
					if(cuentaLigero <= maxLigero) {					
					System.out.println("Su entrenador sera " + nombrePlumaLigero);
					cuentaLigero++;
					victorio++;
					}
					else {System.out.println("Categoria sin disponibilidad");
					}
				
				}
				else if(boxeador.peso >= welterMin && boxeador.peso < medianoMin) {
					System.out.println(boxeador.nombre + " PESA: " + boxeador.peso + ". Asignado a WELTER. ");
					if(cuentaWelter <= maxWelter) {					
					System.out.println("Su entrenador sera " + nombreWelterMediano);
					cuentaWelter++;
					vanessa++;
					}
					else {System.out.println("Categoria sin disponibilidad");
					}
									
				}	
				else if(boxeador.peso >= medianoMin && boxeador.peso < medioPesadoMin) {
					System.out.println(boxeador.nombre + " PESA: " + boxeador.peso + ". Asignado a MEDIANO. ");
					if(cuentaMediano <= maxMediano) {					
					System.out.println("Su entrenador sera " + nombreWelterMediano);
					cuentaMediano++;
					vanessa++;
					}
					else {System.out.println("Categoria sin disponibilidad");
					}
									
				}
				else if(boxeador.peso >= medioPesadoMin && boxeador.peso < pesado) {
					System.out.println(boxeador.nombre + " PESA: " + boxeador.peso + ". Asignado a MEDIO PESADO. ");
					if(cuentaMedioPesado <= maxMedioPesado) {					
					System.out.println("Su entrenador sera " + nombreMedioPesadoPeasoPesado);
					cuentaMedioPesado++;
					tyson++;
					}
					else {System.out.println("Categoria sin disponibilidad");
					}
								
				}
				else if(boxeador.peso >= pesado) {
					System.out.println(boxeador.nombre + " PESA: " + boxeador.peso + ". Asignado a PESADO. ");
					if(cuentaPesado <= maxPesado) {					
					System.out.println("Su entrenador sera " + nombreMedioPesadoPeasoPesado);
					cuentaPesado++;
					tyson++;
					}
					else {System.out.println("Categoria sin disponibilidad");
					}			
				}
			}
			
			maxIndiceVectores++;
		}
		else {System.out.println("GIMNASIO COMPLETO");
		}			
	
	}
	

}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
