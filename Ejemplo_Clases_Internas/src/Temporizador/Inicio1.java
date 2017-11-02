package Temporizador;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Inicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temporizador oyente = new Temporizador();
		
		Timer miTemporizador = new Timer(500, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener.");
		
		System.exit(0);
	}
}
 	