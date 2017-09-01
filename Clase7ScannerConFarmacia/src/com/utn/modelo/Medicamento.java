package com.utn.modelo;

public class Medicamento {

	public String nombre;
	public double valor;
	public boolean ventaLibre;
	public double descuento;
	//opcion 1
	public int numero()
	{
		return 1;
	}
	
	//opcion 2
	public boolean ble() {
		boolean b = false;
		return b;
	}
	
	
	
	//contrato  tipo=Medicamento                            //firma
	public Medicamento construyoMedicamento(String nombre, 
											double valor,
											boolean ventaLibre,
											double descuento) {
	
		Medicamento medicamentito = new Medicamento();
		medicamentito.nombre=nombre;
		medicamentito.valor=valor;
		medicamentito.ventaLibre=ventaLibre;
		medicamentito.descuento=descuento;
		
		return medicamentito;
	}
	
	
	public String saludo() {
		return "hola mundo";
	}
	
	
	
	
	
	public String saludo2() {
		String saludo="hola mundo";
		return saludo;
	}
	
	
	
	
	
	
	
	
}
