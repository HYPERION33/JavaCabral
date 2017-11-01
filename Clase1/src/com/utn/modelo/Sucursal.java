package com.utn.modelo;

public class Sucursal implements IFabrica {

	@Override
	public String asignoPatente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double velocidadVehiculo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> void creoVehiculo(T obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T creoVehiculoGenerico() {
		 
		return null;
	}

	@Override
	public <T> T creoGenerico(T t) {
		
		if (t instanceof Magia) {
			Magia newObject = (Magia) t;
			
		}

		return t;
	}

	@Override
	public <T> T t(T t) {
		// TODO Auto-generated method stub
		return null;
	}

}
