package com.excepciones.tuto;
import java.io.IOException;

public class Mi_Excepcion_Comprobada extends IOException {
//me obliga  acapturar el error
	
	//se recomeindan dos contructores:
	//uno vacio
	//otro que reciba el parametro que se te antoje

	public Mi_Excepcion_Comprobada() {
		
	}
	public Mi_Excepcion_Comprobada(String msjError) {
		
		super(msjError); //llamo al contructor de la clase padre
	}
}
