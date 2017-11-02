  package Temporizador_Clase_Interna;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;
import javax.swing.Timer;

	public class Reloj{
		
		/*CLASES INTERNAS - INNER CLASS
		 * 
		 * Es una clase dentro de otra.
		 * 
		 * Objetivos:
		 * Poder acceder a los campos privados de una clase 
		 * desde otra clase interna sin necesidad de metodos de acceso.
		 * 
		 * Oculatar una clase interna de otras clases pertenecientes al mimso paquete (encapsular la clase).
		 * 
		 * Clases internans "ANONIMAS" , utiles para EVENTOS y RETROLLAMADAS.
		 * 
		 * Cuando solo UNA clase debe acceder a los campos de ejemplar de otra clase que la engloba.
		 * 
		 */
		
		private int intervalo;
		private boolean sonido;
		
	public Reloj(int intervalito, boolean sonidito) {
				
		intervalo=intervalito;
		sonido=sonidito;
	}
	
	public void enMarcha() {
		
		ActionListener oyente = new DameLaHora();
			
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
					
	}
	
	private class DameLaHora implements ActionListener{
		
		public void actionPerformed (ActionEvent evento) {
			
			Date ahora = new Date();
			
			System.out.println("Te muestro la hora cada 3 sg: " + ahora);
						
			if(sonido) {
				//cuando es un boolean se puede evaluar sin true o false
				//por defecto dice "si sonido es true"
				
				Toolkit.getDefaultToolkit().beep();
			}
			
		}
		
	}
}
