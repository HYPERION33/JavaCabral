package com.utn.modelo;
import com.utn.modelo.Animales;
import com.utn.modelo.Tratamiento;

public class Veterinario {
	
	private String nombreDoc;
	private String apellidoDoc;
	private int edadDoc;
	private String especialidad;
	private int maxClinica = 20;
	private int maxDoc = 5;
	private int contadorAnimales = 0;
	private Animales[] animalEnfermo;
	private Tratamiento[] receta;
	
	
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getContadorAnimales() {
		return contadorAnimales;
	}
	public void setContadorAnimales(int contadorAnimales) {
		this.contadorAnimales = contadorAnimales;
	}
	public String getNombreDoc() {
		return nombreDoc;
	}
	public void setNombreDoc(String nombreDoc) {
		this.nombreDoc = nombreDoc;
	}
	public String getApellidoDoc() {
		return apellidoDoc;
	}
	public void setApellidoDoc(String apellidoDoc) {
		this.apellidoDoc = apellidoDoc;
	}
	public int getEdadDoc() {
		return edadDoc;
	}
	public void setEdadDoc(int edadDoc) {
		this.edadDoc = edadDoc;
	}
	
	public int getMaxClinica() {
		return maxClinica;
	}
	public void setMaxClinica(int maxClinica) {
		this.maxClinica = maxClinica;
	}
	public int getMaxDoc() {
		return maxDoc;
	}
	public void setMaxDoc(int maxDoc) {
		this.maxDoc = maxDoc;
	}
	
	public Veterinario(String nombreDoc,String apellidoDoc,int edadDoc,String especialidad, int maxDoc) {//constructor de doctores
		this.nombreDoc= "";
		this.apellidoDoc="";
		this.edadDoc=0;		
		this.especialidad="";//debo crear medicos
		this.maxDoc=0;//debo crear medicos	
	}
	
	public void tratamientoMedico() {
		
	receta = new Tratamiento[0];
		
	}
	
	public void ingresaAnimal() {
		
	animalEnfermo = new Animales[0];
		
	}
	
	public void iniciaConsulta(Animales animal) {
		
		ingresaAnimal();
		
		tratamientoMedico();
		
		Veterinario doc1 = new Veterinario("Jose","Perez",25,"especialista canino", 0);
		Veterinario doc2 = new Veterinario("Maria","Perez",32,"especialista canino", 5);// a partir del 5to indice para for lo atiende este medico
		Veterinario doc3 = new Veterinario("Esteban","Quito",34,"especialista felino", 0);
		Veterinario doc4 = new Veterinario("Oscar","Sultanito",40,"especialista felino", 5);
		Veterinario doc5 = new Veterinario("German","Menganito",50,"especialista roedor", 0);
		
		//un switch para cada especie y dos medicos para las esécies mas comunes?
		// si un medico esta lleno pasamos al otro
		//los mismo con los gatos y el conejos como es una especie menos solictada un solo doctor.
		//hay que crear especialista?
		// instancear 5 medicos en esta clase y asignarlos a los if, else if
		
		String validarEspecie = animal.getTipo();
		
		switch (validarEspecie) {
		
		case "perro":
		
			if(contadorAnimales < maxClinica) {//capacidad max de la clinica
				
				System.out.println("Bienvenido a ¨La Veterinaria¨, espere y será atendido por un profesional...");
			
				for(int a = 0; a <= animalEnfermo.length;a++ ) {
					
					if(contadorAnimales < doc1.getMaxDoc()) {
						
						System.out.println("El veterinario que lo atenderá sera: " + doc1.getNombreDoc() + " " + doc1.getApellidoDoc() +".");
						System.out.println("Su edad es: " + doc1.getEdadDoc() + " y es " + doc1.getEspecialidad());
						System.out.println("La especie del animal afectado es: " + animal.getTipo());
						System.out.println("La raza es: " + animal.getRaza());
						System.out.println("Motivo de la consulta: " + animal.getmotivoDeConsulta());
						
						//falta la parte del diagnostico	
						//mostrar tratamiento?
						contadorAnimales++;
						
						
					}else if(contadorAnimales < doc2.getMaxDoc()) {
						
						System.out.println("El veterinario que lo atenderá sera: " + doc2.getNombreDoc() + " " + doc2.getApellidoDoc() +".");
						System.out.println("Su edad es: " + doc2.getEdadDoc() + " y es " + doc2.getEspecialidad());
						System.out.println("La especie del animal afectado es: " + animal.getTipo());
						System.out.println("La raza es: " + animal.getRaza());
						System.out.println("Motivo de la consulta: " + animal.getmotivoDeConsulta());
						
						//falta la parte del diagnostico		
						contadorAnimales++;
					}else {
						
						System.out.println("Los especialistas no estan disponibles en este momento...");
					}
				}
			}else {
				
				System.out.println("La veterinaria se encuentra operando a su maxima capacidad. Lo sentimos, no podemos atenderlo...");
			}
			
			break;
			
		case "gato":
			
			if(contadorAnimales < maxClinica) {//capacidad max de la clinica
				
				System.out.println("Bienvenido a ¨La Veterinaria¨, espere y será atendido por un profesional...");
			
				for(int a = 0; a <= animalEnfermo.length;a++ ) {
					
					if(contadorAnimales < doc3.getMaxDoc()) {
						
						System.out.println("El veterinario que lo atenderá sera: " + doc3.getNombreDoc() + " " + doc3.getApellidoDoc() +".");
						System.out.println("Su edad es: " + doc3.getEdadDoc() + " y es " + doc1.getEspecialidad());
						System.out.println("La especie del animal afectado es: " + animal.getTipo());
						System.out.println("La raza es: " + animal.getRaza());
						System.out.println("Motivo de la consulta: " + animal.getmotivoDeConsulta());
						
						//falta la parte del diagnostico		
						contadorAnimales++;
						
					}else if(contadorAnimales < doc4.getMaxDoc()) {
						
						System.out.println("El veterinario que lo atenderá sera: " + doc4.getNombreDoc() + " " + doc4.getApellidoDoc() +".");
						System.out.println("Su edad es: " + doc4.getEdadDoc() + " y es " + doc4.getEspecialidad());
						System.out.println("La especie del animal afectado es: " + animal.getTipo());
						System.out.println("La raza es: " + animal.getRaza());
						System.out.println("Motivo de la consulta: " + animal.getmotivoDeConsulta());
						
						//falta la parte del diagnostico		
				
						contadorAnimales++;
					}else {
						
						System.out.println("Los especialistas no estan disponibles en este momento...");
					}
				}
			}else {
				
				System.out.println("La veterinaria se encuentra operando a su maxima capacidad. Lo sentimos, no podemos atenderlo...");
			}
			
			break;
				
		case "conejo":
			
			if(contadorAnimales < maxClinica) {//capacidad max de la clinica
				
				System.out.println("Bienvenido a ¨La Veterinaria¨, espere y será atendido por un profesional...");
			
				for(int a = 0; a <= animalEnfermo.length;a++ ) {
					
					if(contadorAnimales < doc5.getMaxDoc()) {
						
						System.out.println("El veterinario que lo atenderá sera: " + doc5.getNombreDoc() + " " + doc5.getApellidoDoc() +".");
						System.out.println("Su edad es: " + doc5.getEdadDoc() + " y es " + doc5.getEspecialidad());
						System.out.println("La especie del animal afectado es: " + animal.getTipo());
						System.out.println("La raza es: " + animal.getRaza());
						System.out.println("Motivo de la consulta: " + animal.getmotivoDeConsulta());
						
						//falta la parte del diagnostico		
						contadorAnimales++;
						
					}else {
						
						System.out.println("El especialista no esta disponible en este momento...");
					}
				}
				
			}else {
				
				System.out.println("La veterinaria se encuentra operando a su maxima capacidad. Lo sentimos, no podemos atenderlo...");
			}
			
			break;
	
			default:
				System.out.println("Lo sentimos, no podemos atender esta especie animal...");
				break;
			
		}
		
	}
	
}