package com.utn.modelo;

public class Veterinarios {
	
	private String nombreDoc;
	private String apellidoDoc;
	private int edadDoc;
	private final int limite1 = 5;
	private final int limite2 = 10;
	private final int limite3 = 15;
	private final int limite4 = 20;
	private final int limite5 = 25;
	private static int atenciones = 0;
	private static int atencionesMed1 = 0;
	private static int atencionesMed2 = 0;
	private static int atencionesMed3 = 0;
	private static int atencionesMed4 = 0;
	private static int atencionesMed5 = 0;
	
	public static int getAtencionesMed1() {
		return atencionesMed1;
	}
	
	public static int getAtencionesMed2() {
		return atencionesMed2;
	}
	
	public static int getAtencionesMed3() {
		return atencionesMed3;
	}
	
	public static int getAtencionesMed4() {
		return atencionesMed4;
	}
	
	public static int getAtencionesMed5() {
		return atencionesMed5;
	}
	
	public int getAtenciones() {
		return atenciones;
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
	
	public int getLimite1() {
		return limite1;
	}
	
	public int getLimite2() {
		return limite2;
	}
	
	public int getLimite3() {
		return limite3;
	}
	
	public int getLimite4() {
		return limite4;
	}
	
	public int getLimite5() {
		return limite5;
	}
	
	public void aumentarAtencion() {
		
		atenciones++;
	}
	
	public void contarAte1() {
		
		atencionesMed1++;
	}
	
	public void contarAte2() {
		
		atencionesMed2++;
	}
	
	public void contarAte3() {
		
		atencionesMed3++;
	}

	public void contarAte4() {
		
		atencionesMed4++;
	}
	
	public void contarAte5() {
		
		atencionesMed5++;
	}
	
	public Veterinarios(String nombreDoc,String apellidoDoc,int edadDoc) {
		this.nombreDoc= nombreDoc;
		this.apellidoDoc=apellidoDoc;
		this.edadDoc=edadDoc;		
		
	}
}