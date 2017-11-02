package Termporizador_Clase_Interna_Local;

import javax.swing.JOptionPane;

public class Inicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj_Mejorado miReloj = new Reloj_Mejorado();
		
		miReloj.enMarcha(1000,true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener.");
		
		System.exit(0);
	}

}
