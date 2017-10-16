package edu.utn.modelo;

import java.util.ArrayList;

public abstract class Player {

	private String nombre;
	private static ArrayList<IWeapon>armas;
	private double dinero;
	private boolean mato;
	private int lifeLvL;
	private IWeapon armaSelec;
	private boolean bot;
	


	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(String nombre, boolean bot) {

		this.nombre = nombre;
		this.dinero = 5000;
		this.lifeLvL = 100;
		this.bot=bot;
		
	}

	public boolean isBot() {
		return bot;
	}
	
	public void setBot(boolean bot) {
		this.bot = bot;
	}

	public void matar() {
		if(mato) {
			dinero+=2000;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<IWeapon> getArmas() {
		return armas;
	}

	public void setArmas(ArrayList<IWeapon> armas) {
		this.armas = armas;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public boolean isMato() {
		return mato;
	}

	public void setMato(boolean mato) {
		this.mato = mato;
	}

	public int getLifeLvL() {
		return lifeLvL;
	}

	public void setLifeLvL(int lifeLvL) {
		this.lifeLvL = lifeLvL;
	}

	public IWeapon getArmaSelec() {
		return armaSelec;
	}

	public void setArmaSelec(IWeapon armaSelec) {
		this.armaSelec = armaSelec;
	}

	public void comprar(int arma){

		armaSelec = armas.get(arma);

		dinero-=((Weapon)armas.get(arma)).getPrecio();
	}


}
