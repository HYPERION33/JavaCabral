package com.utn.controlador;

import java.util.ArrayList;

import com.utn.modelo.Avanzado;
import com.utn.modelo.IEstilo;
import com.utn.modelo.ISalto;
import com.utn.modelo.Intermedio;
import com.utn.modelo.Nadador;
import com.utn.modelo.Principante;

public class NadadorControlador {

	private ArrayList<Nadador> listaNadador = new ArrayList<>();

	public void nadoEstilo(IEstilo estilo) {
		System.out.println("El nadador de tipo " + estilo.getClass().getSimpleName());
		System.out.println("para el estilo Mariposa se demora " + estilo.mariposa(3));
		System.out.println("para crol se demoro " + estilo.crol(2));
		
		if (estilo instanceof Principante) {
			Principante obj = (Principante) estilo;
			listaNadador.add(obj);
		}
		
		if (estilo instanceof Intermedio) {
			Intermedio obj = (Intermedio) estilo;
			listaNadador.add(obj);
		}
		
		if (estilo instanceof Avanzado) {
			Avanzado obj = (Avanzado) estilo;
			listaNadador.add(obj);
		}
	}

	public void tipoSalto(ISalto salto) {
		salto.estiloSalto();
	}

	public void mostrarTodosLosNadadores() {

		for (Nadador nadador : listaNadador) {
			System.out.println(nadador.getNombre());
		}
	}

}
