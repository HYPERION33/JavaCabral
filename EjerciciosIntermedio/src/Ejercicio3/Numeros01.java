package Ejercicio3;

public class Numeros01 {

	public static void main(String[] args) {
	
		int numeroNatural = 0;
		int[] vector = new int[10];
		
		for(int i=0; i<=vector.length; i++) {
			
			System.out.print("Cuadrado de " + numeroNatural + ": ");
			System.out.println(Math.pow(numeroNatural, 2));
			numeroNatural++;
		}

	}

}
