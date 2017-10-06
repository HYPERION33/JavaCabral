package com.excepciones.tuto;

public class Mi_Excepcion_No_Comprobada extends RuntimeException{
//no me obliga a capturar el error

	public Mi_Excepcion_No_Comprobada() {
		
	}
	public Mi_Excepcion_No_Comprobada(String msjError) {
		
		super(msjError);
	}
}
