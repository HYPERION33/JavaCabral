package Ejercicio4;
import java.util.Scanner;

public class Codigos01 {

	public static void main(String[] args) throws Exception{
	
			Scanner sc = new Scanner(System.in);
			int code;
				
				try {
					
					System.out.println("Por favor, ingresa el codigo del producto...");
					code = sc.nextInt();
					sc.close();				
					
					System.out.println(code);	
					
						
				}catch(Exception e) {
						
						System.out.println("El valor ingresado debe ser un numero entero.");				
						
					
				}finally {
					System.out.println("FIN");
			}
		
	}
	
}
