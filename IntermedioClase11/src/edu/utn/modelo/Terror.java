package edu.utn.modelo;

import edu.utn.modelo.map.Map;

public class Terror extends Player{

	private static int puntaje;
	private static int muertes;
	
	public static int getMuertes() {
		return muertes;
	}
	
	public static int getPuntaje() {
		return puntaje;
	}
	public Terror(String nombre, boolean bot) {
		super(nombre,bot);
	}

	public void activarC4() {
		System.out.println("Active el c4");
	}

	public void comprar(IWeapon arma) {
		if(((Weapon)arma).getNombre().equalsIgnoreCase("Colt")){
			System.out.println("Sos counter, no podes comprar una ak");
		}else if(((Weapon)arma).getNombre().equalsIgnoreCase("Scout")){
			super.comprar(1);
		}else {
			super.comprar(2);
		}
	}
	
	public static void aumentarPuntajer() {
		
		puntaje++;
	}
	
	public static void contarMuertos() {
		
		muertes++;
	}
	

	public static void gane(Map mapa) {
		if(puntaje==mapa.getPuntaje()) {
			System.out.println("Gane");
		}	
	}

}