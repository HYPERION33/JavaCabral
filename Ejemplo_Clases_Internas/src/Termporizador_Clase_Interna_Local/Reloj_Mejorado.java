package Termporizador_Clase_Interna_Local;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

public class Reloj_Mejorado {
	
	/*CLASE INTERNA LOCAL
	 * 
	 * Una clase dentro de un metodo.
	 * 
	 * Son utiles cuando solo se va a instanciar una unica vez.
	 * el ambito de la clase queda restringido dentro del metodo.
	 * 
	 * Objetivos: 
	 * Simplificar codigo.
	 * 
	 * Encapsular. Ni siquiera la clase a la que pertenece puede acceder,
	 * solo puede acceder el metodo donde esta declarada la local.
	 * 
	 * Sin embargo, la clase interna local PUEDE acceder a las variables locales y a los campos de clase.
	 */

	//private int intervalo; 			no son necesarios....
	//private boolean sonido;
		
	//public Reloj_Mejorado(int intervalito, boolean sonidito) {
				
	//	intervalo=intervalito;
	//	sonido=sonidito;
	//}
	
	public void enMarcha(int intervalo, boolean sonido) {
		
		 class DameLaHora implements ActionListener{//<-----CLASE INTERNA LOCAL
			
			public void actionPerformed (ActionEvent evento) {
				
				Date ahora = new Date();
				
				System.out.println("Te muestro la hora cada 1 sg: " + ahora);
								
				if(sonido) {
					
					//cuando es un boolean se puede evaluar sin true o false
					//por defecto dice "si sonido es true"
					
					Toolkit.getDefaultToolkit().beep();//beep del sistema
				}
				
			}
			
		}
		
		ActionListener oyente = new DameLaHora();//mas info en la API
			
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
					
	}	
	
}