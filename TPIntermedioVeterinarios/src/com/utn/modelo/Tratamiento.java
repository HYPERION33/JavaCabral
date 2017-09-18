package com.utn.modelo;

public class Tratamiento {

	private String medicamento;
	private double precioMedicamento;
	private String diag;

	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	public double getPrecioMedicamento() {
		return precioMedicamento;
	}
	public void setPrecioMedicamento(double precioMedicamento) {
		this.precioMedicamento = precioMedicamento;
	}
	public String getdiag() {
		return diag;
	}
	public void setdiag(String diag) {
		this.diag = diag;
	}
	
	public Tratamiento (String diag, String medicamento, double precio) {//constructor de tratamiento
		
		this.diag="";
		this.medicamento="";
		this.precioMedicamento=0;
		
	}
	
	public void mostrarTratamiento() {
		
		System.out.println("El diagnostico medico es: " + getdiag());
		System.out.println("El medicamento especifico es: " + getMedicamento());
		System.out.println("Su costo es de: $" + getPrecioMedicamento());
	}
	//mostrar tratamiento	
}
