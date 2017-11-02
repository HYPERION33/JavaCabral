package Temporizador;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class Temporizador implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		
		System.out.println("Te muestro la hora cada 1/2 sg: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}

}
