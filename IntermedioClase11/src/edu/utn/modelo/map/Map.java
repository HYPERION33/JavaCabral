package edu.utn.modelo.map;

import edu.utn.modelo.Counter;
import edu.utn.modelo.Player;
import edu.utn.modelo.Terror;

public class Map {

	private int cantJug;
	private double timeOut;
	private int puntaje;



	public Map(int cantJug, double timeOut, int puntaje) {
		this.cantJug = cantJug;
		this.timeOut = timeOut;
		this.puntaje = puntaje;
	}

	public int getCantJug() {
		return cantJug;
	}
	public void setCantJug(int cantJug) {
		this.cantJug = cantJug;
	}
	public double getTimeOut() {
		return timeOut;
	}
	public void setTimeOut(double timeOut) {
		this.timeOut = timeOut;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public void victoriaPorMuerteCounter(Player player) {
		if(player instanceof Counter) {
			Counter counter=(Counter)player;
			if(counter.getMuertes()==cantJug)
				System.out.println("Ganaron los terro");
		}else {
			Terror terro=(Terror)player;
			if(cantJug==terro.getMuertes())
				System.out.println("Gano los counters");
		}
	}

}
