package com.utn.vista;

import com.utn.modelo.*;

public class TestGim {

	public static void main(String[] arsg) {
		
	System.out.println("=============== SE PRESENTAN LOS BOXEADORES ================");
	
	Entrenadores categorias = new Entrenadores();
	
	Boxeadores[] box = new Boxeadores[50];
	
	box[0] = new Boxeadores();// OJO crear las nuevas instancias dentro del indice.
	box[0].nombre = "Hernan";
	box[0].peso = 52.00;
	
	box[1] = new Boxeadores();
	box[1].nombre = "Matias";
	box[1].peso = 52.00;
	
	box[2] = new Boxeadores();
	box[2].nombre = "Nho";
	box[2].peso = 52.333;
	
	box[3] = new Boxeadores();
	box[3].nombre = "Xin";
	box[3].peso = 90.999;
	
	box[4] = new Boxeadores();
	box[4].nombre = "Ximena";
	box[4].peso = 52.00;
	
	box[5] = new Boxeadores();
	box[5].nombre = "Elias";
	box[5].peso = 70.00;
	
	box[6] = new Boxeadores();
	box[6].nombre = "David";
	box[6].peso = 50.00;
	
	box[7] = new Boxeadores();
	box[7].nombre = "Maria";
	box[7].peso = 110.00;
	
	box[8] = new Boxeadores();
	box[8].nombre = "Melina";
	box[8].peso = 78.500;
	
	box[9] = new Boxeadores();
	box[9].nombre = "Juan";
	box[9].peso = 88.500;
	
	box[10] = new Boxeadores();
	box[10].nombre = "Dario";
	box[10].peso = 70.800;
	
	box[11] = new Boxeadores();
	box[11].nombre = "Mateo";
	box[11].peso = 10.00;
	
	box[12] = new Boxeadores();
	box[12].nombre = "Jose";
	box[12].peso = 60.300;
	
	box[13] = new Boxeadores();
	box[13].nombre = "Cacho";
	box[13].peso = 60.400;
	
	box[14] = new Boxeadores();
	box[14].nombre = "Toto";
	box[14].peso = 100.00;

	box[15] = new Boxeadores();
	box[15].nombre = "Saul";
	box[15].peso = 98.00;
	
	box[16] = new Boxeadores();
	box[16].nombre = "Raul";
	box[16].peso = 97.00;
	
	box[17] = new Boxeadores();
	box[17].nombre = "Jesi";
	box[17].peso = 88.00;
	
	box[18] = new Boxeadores();
	box[18].nombre = "RangerRojo";
	box[18].peso = 76.00;
	
	box[19] = new Boxeadores();
	box[19].nombre = "RangerAzul";
	box[19].peso = 87.300;
	
	box[20] = new Boxeadores();
	box[20].nombre = "RangerNegro";
	box[20].peso = 120.00;
	
	box[21] = new Boxeadores();
	box[21].nombre = "RangerAmarillo";
	box[21].peso = 170.00;
	
	box[22] = new Boxeadores();
	box[22].nombre = "RangerBlanco";
	box[22].peso = 78.500;
	
	box[23] = new Boxeadores();
	box[23].nombre = "RangerRosa";
	box[23].peso = 72.100;
	
	box[24] = new Boxeadores();
	box[24].nombre = "Zordon";
	box[24].peso = 79.00;
	
	box[25] = new Boxeadores();
	box[25].nombre = "Megazor";
	box[25].peso = 10000000.00;
	
	box[26] = new Boxeadores();
	box[26].nombre = "RangerLila";
	box[26].peso = 72.100;
	
	box[27] = new Boxeadores();
	box[27].nombre = "Goku";
	box[27].peso = 80.100;
	
	box[28] = new Boxeadores();
	box[28].nombre = "Vegeta";
	box[28].peso = 76.100;

	box[29] = new Boxeadores();
	box[29].nombre = "Nro.18";
	box[29].peso = 61.100;

	box[30] = new Boxeadores();
	box[30].nombre = "Picoro";
	box[30].peso = 61.100;

	box[31] = new Boxeadores();
	box[31].nombre = "1";
	box[31].peso = 53.100;

	box[32] = new Boxeadores();
	box[32].nombre = "2";
	box[32].peso = 53.100;

	box[33] = new Boxeadores();
	box[33].nombre = "3";
	box[33].peso = 70.100;

	box[34] = new Boxeadores();
	box[34].nombre = "4";
	box[34].peso = 70.100;

	box[35] = new Boxeadores();
	box[35].nombre = "5";
	box[35].peso = 64.100;

	box[36] = new Boxeadores();
	box[36].nombre = "6";
	box[36].peso = 77.100;

	box[37] = new Boxeadores();
	box[37].nombre = "7";
	box[37].peso = 70.100;

	box[38] = new Boxeadores();
	box[38].nombre = "8";
	box[38].peso = 70.100;

	box[39] = new Boxeadores();
	box[39].nombre = "9";
	box[39].peso = 51.100;

	box[40] = new Boxeadores();
	box[40].nombre = "10";
	box[40].peso = 50.100;
	
	box[41] = new Boxeadores();
	box[41].nombre = "11";
	box[41].peso = 57.100;
	
	box[42] = new Boxeadores();
	box[42].nombre = "12";
	box[42].peso = 100.100;
	
	box[43] = new Boxeadores();
	box[43].nombre = "13";
	box[43].peso = 70.100;
	
	box[44] = new Boxeadores();
	box[44].nombre = "14";
	box[44].peso = 57.100;
	
	box[45] = new Boxeadores();
	box[45].nombre = "15";
	box[45].peso = 91.100;
	
	box[46] = new Boxeadores();
	box[46].nombre = "16";
	box[46].peso = 70.100;
	
	box[47] = new Boxeadores();
	box[47].nombre = "17";
	box[47].peso = 1.100;
	
	box[48] = new Boxeadores();
	box[48].nombre = "18";
	box[48].peso = 70.100;
	
	box[49] = new Boxeadores();
	box[49].nombre = "19";
	box[49].peso = 100000.100;

	
		for(int i = 0; i < box.length ; i++) {
		
			System.out.println("Se presenta el boxeador " + box[i].nombre);
			categorias.asignarCategoria(box[i]);
			System.out.println("============================================================");
		}
	
		System.out.println("======================REPORTE DIARIO========================");
		System.out.println("Claudio entreno a " + categorias.claudio + " boxeadores");
		System.out.println("Victorio entreno a " + categorias.victorio + " boxeadores");
		System.out.println("Vanessa entreno a " + categorias.vanessa + " boxeadores" );
		System.out.println("Tyson entreno a " + categorias.tyson + " boxeadores");
		
		System.out.println("Se entrenaron " + (categorias.claudio + categorias.victorio + categorias.vanessa + categorias.tyson) + " boxeadores en total");
	
	}

}

