package Ejercicio5;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Codigo02 {
	
	public static void main(String[] args) throws Exception,StringIndexOutOfBoundsException {
		
		Scanner sc = new Scanner(System.in);
		String code;
		char[] x = new char[8];
						
		System.out.println("Por favor, ingrese el codigo...");
		
			try {
				
				code = sc.nextLine().toUpperCase();
				
				x[0] = code.substring(0).charAt(0); 
				x[1] = code.substring(1).charAt(0);
				x[2] = code.substring(2).charAt(0);
				x[3] = code.substring(3).charAt(0);
				x[4] = code.substring(4).charAt(0);
				x[5] = code.substring(5).charAt(0);
				x[6] = code.substring(6).charAt(0);
				x[7] = code.substring(7).charAt(0);
				
				sc.close();	
				
				if(Character.isLetter(x[0]) == false) {
					
					System.out.println("El codigo debe comenzar con una letra.");
					
				}
					
				if(Character.isDigit(x.length) == false) {
					
					System.out.println("El codigo debe ser alfanumerico.");
					
				}else {
					
					for(int i = 0; i < x.length ; i++) {
												
						if(Character.isLetter(x[0]) && Character.isLetterOrDigit(x[i])) {
								
							System.out.print(x[i]);
						}
					}
				
				}
				
			}catch(StringIndexOutOfBoundsException e) {
				
				System.out.println("El codigo solo debe contener 8 caracteres.");
								
			}finally{
				
				System.out.println();
				System.out.println("FIN");
			}
	
	}


}
