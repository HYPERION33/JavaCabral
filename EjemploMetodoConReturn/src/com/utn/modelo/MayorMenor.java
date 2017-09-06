package com.utn.modelo;
import java.util.Scanner;
public class MayorMenor {
	
	public void cargarValores() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		int valor1 = teclado.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		int valor2 = teclado.nextInt();
		System.out.println("Ingrese el tercer valor: ");
		int valor3 = teclado.nextInt();
		
		int mayor,menor;
		mayor = calcularMayor(valor1, valor2, valor3);// el valor de mayor sera obtenido por el metodo calculaMayor con el return m
		menor = calcularMenor(valor1, valor2, valor3);// el valor de menor idem metodo calculoMenor
		
		System.out.println("El mayor valor de los tres es: " + mayor);
		System.out.println("El menor valor de los tres es: " + menor);
	}
	
	public int calcularMayor(int v1, int v2, int v3) {//pide return xq no hay void.
		
		int m;// aca retorna
		if(v1>v2 && v1>v3) {
			m=v1;
		}else {
			if(v2>v3) {
				m=v2;
			}else {
				m=v3;
			}
		}
		return m;//regresa el valor a int m
	}
	
	public int calcularMenor(int v1, int v2, int v3) {
		
		int m;// aca retorna
        if(v1<v2 && v1<v3) {
          m=v1;
        } else {
            if(v2<v3) {
                m=v2;
            } else {
            	m=v3;
            }
        }
        return m; //regresa el valor a int m
	}
	
}
