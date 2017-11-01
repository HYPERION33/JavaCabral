package com.utn.modelo;

public class Perro implements IAcciones<Double> {

	/***
	 * @param tiene que pasar un numero como String
	 * @return devuelve un double
	 * @author Mariano Perez
	 * @see este metodo devuelve un doble 
	 *              pero castea magicamente
	 *              el string que le pases
	 * 
	 */
	@Override
	public Double hablar(String hola) {
		Double d = new Double(hola);
		return d;
	}

	@Override
	public Double hablar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double despedida(String saludo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void caminar(Double tobj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saludar(int cantSaludos) {
		// TODO Auto-generated method stub
		
	}

}
