package com.utn.modelo;

public interface IAcciones<T> {

	
	public T hablar(String hola);
//	public String hablar(T tobj); no rompe porque en este
	//caso el compilador no sabe que va a ser T

	public T hablar();
	
	
	
	
	public T despedida(String saludo);
	

	public void caminar(T tobj);
	public void saludar(int cantSaludos);
	
}
