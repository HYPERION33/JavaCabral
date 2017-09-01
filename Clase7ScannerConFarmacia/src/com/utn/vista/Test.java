package com.utn.vista;

import com.utn.controlador.FarmaciaControlador;
import com.utn.modelo.Medicamento;

public class Test {

	public static void main(String[] args) {
		
		Medicamento medicamentoMadre = new Medicamento();
		
//		Medicamento mejora= medicamentoMadre.construyoMedicamento("Mejoralito", 10.0,true , 1.1);
//		Medicamento baya=medicamentoMadre.construyoMedicamento("Bayaspirina C", 15.0,true , 0);
//		Medicamento ribo= medicamentoMadre.construyoMedicamento("Ribotril", 100.0,false, 0);
//		
//		System.out.println(mejora.nombre);
//		System.out.println(baya.nombre);
//		System.out.println(ribo.nombre);
		
		FarmaciaControlador fc = new FarmaciaControlador();
		fc.vendoMedicamentos(null);
//		fc.atiendo();
		
	}

}
