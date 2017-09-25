package com.utn.modelo;	 

public class Tratamiento {

	private String medicamento;
	private double precioConsulta;
	private String recom;
	private String diag;
	
	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	public double getPrecioConsulta() {
		return precioConsulta;
	}
	public void setPrecioConsulta(double precioConsulta) {
		this.precioConsulta = precioConsulta;
	}
	public String getRecom() {
		return recom;
	}
	public void setRecom(String recom) {
		this.recom = recom;
	}
	public String getDiag() {
		return diag;
	}
	public void setDiag(String diag) {
		this.diag = diag;
	}
	
	public Tratamiento(String diag, String recom, String medicamento, double precioConsulta) {
		
		this.diag=diag;
		this.recom=recom;
		this.medicamento=medicamento;
		this.precioConsulta=precioConsulta;
		
	}
	
}
