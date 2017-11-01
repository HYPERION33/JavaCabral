package com.utn.modelo;

public interface IFabrica {

	
	public String asignoPatente();
	
	public double velocidadVehiculo();
	
	public <T>void creoVehiculo(T obj);
	
	public <T>T creoVehiculoGenerico();
	
	
	public <T>T creoGenerico(T t);
	
	public <T> T t (T t);
	
	
	
	
}
