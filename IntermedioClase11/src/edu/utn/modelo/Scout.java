package edu.utn.modelo;

public class Scout extends Weapon{
	
	public Scout(String nombre, double precio, int danio, int capacidad) {
		super(nombre, precio, danio, capacidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recargar() {
		
		super.setBalas(super.getCapacidad());
		
	}

	@Override
	public void disparar() {
		if(super.getBalas()>0){
			super.setBalas(super.getBalas()-1);
			
		}else {
			recargar();
		}
		
	}
}
