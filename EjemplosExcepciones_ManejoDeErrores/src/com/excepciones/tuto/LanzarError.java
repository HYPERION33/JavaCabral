package com.excepciones.tuto;
import javax.swing.*;

public class LanzarError {
	
	public static void main(String[] args) {
		
		String el_email = JOptionPane.showInputDialog("Introduce el e-mail");//aca vamos a usar el throw, try , catch
		
		/*
		 * tener en cuenta que estoy usando una excepcion runtime
		 * si fuese una de EOexception me va a oblligar a capturar el error 
		 */
		
		try {
			examina_email(el_email);
		}catch(ArrayIndexOutOfBoundsException mi_exception){
			
			System.out.println("La direccion es demasiado corta, la cagaste...");
		}
	}

	static void examina_email(String email) throws ArrayIndexOutOfBoundsException {
		
		int arroba = 0;
		boolean punto = false;
		
		if(email.length()<=3) {//quiero lanzar un error para esta condicion...
			
			ArrayIndexOutOfBoundsException mi_exception = new ArrayIndexOutOfBoundsException();
			/*creo una excepcion. en este caso llamo al metodo ArrayIndexOutOfBoundsException
			 * para usar en el ejemplo pero podria haber sido orta excepcion..
			 */
			 throw mi_exception;
			 
			 //lanzo mi excepcion antes creada: "mi_exception"
			 //desp uso throws , try , catch para atrapar esta nueva excepcion.
	
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

