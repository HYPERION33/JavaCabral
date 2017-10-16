package edu.utn.modelo;

import edu.utn.modelo.map.Map;

public class Counter extends Player{

	private static int puntaje;
	private static int muertes;


	public Counter(String nombre, boolean bot) {
		super(nombre,bot);
	}
	public static int getMuertes() {
		return muertes;
	}

	public void desactivarBomba() {
		System.out.println("Desactive el c4");
	}

	public void rescatarRehenes() {

		System.out.println("Rehenes a salvo");
	}

	public void comprar(IWeapon arma) {
		if(((Weapon)arma).getNombre().equalsIgnoreCase("Ak47")){
			System.out.println("Sos counter, no podes comprar una ak");
		}else if(((Weapon)arma).getNombre().equalsIgnoreCase("Scout")){
			super.comprar(1);
		}else {
			super.comprar(0);
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
