package com.excepciones.tuto;
import javax.swing.*;

public class CapturarErroresConInstancias {
	
	public static void main(String[] args) {
		
		String el_email = JOptionPane.showInputDialog("Introduce el e-mail");//aca vamos a usar el throw, try , catch
		
		//con las excepciones no comprobadas es igual, solo que no me obliga a capturar los errores
		
		try {
			examina_email(el_email);
		}catch(Mi_Excepcion_Comprobada e){
			
			System.out.println("La direccion es demasiado corta, la cagaste...");//error capturado con msj
			e.printStackTrace();//a pesar de que el programa se ejecuta me muestra cual fue la excepcion
		
		}
	}

	static void examina_email(String email) throws Mi_Excepcion_Comprobada {
		
		int arroba = 0;
		boolean punto = false;
		
		if(email.length()<=3) {
			
			throw new Mi_Excepcion_Comprobada("email demasiado cortina...");//aca puedo usar el contructor vacio ya que estoy capturando el error
		}
		
			for(int i=0; i<email.length(); i++) {
			
				if(email.charAt(i)=='@') {
					
					arroba++;
					
				}
				
				if(email.charAt(i)=='.') {
					
					punto = true;
				}
			}
			
			if(arroba==1 && punto==true) {
				
				System.out.println("Es correcto.");
			}else {
				
				System.out.println("No es correcto");
			}
		}
}

