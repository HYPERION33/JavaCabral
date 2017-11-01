package com.utn.modelo;

public class HarryPoter implements IAcciones<Magia> {

	@Override
	public Magia hablar(String hola) {
		Magia m = new Magia();
		m.setPoder(hola);
		return m;
	}

	@Override
	public Magia hablar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Magia despedida(String saludo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void caminar(Magia tobj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saludar(int cantSaludos) {
		// TODO Auto-generated method stub
		
	}

}
