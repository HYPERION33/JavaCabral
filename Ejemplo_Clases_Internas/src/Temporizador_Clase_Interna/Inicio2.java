package Temporizador_Clase_Interna;

import javax.swing.JOptionPane;

public class Inicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj miReloj = new Reloj(3000, true);
		
		miReloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener.");
		
		System.exit(0);
	}

}
