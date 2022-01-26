/*Ejemplo 2.3
Realice un algoritmo para determinar cuánto se debe pagar por equis cantidad
de lápices considerando que si son 1000 o más el costo es de 85$ c/lapiz; de lo
contrario, el precio es de 90$ c/lapiz. Represéntelo con el pseudocódigo y el diagrama
de flujo.*/

package ej203Lapices;

import java.util.Scanner;

public class CostosLapices {
	private static final Integer CANT_MAYORISTA = 1000;
	private static final Integer PRECIO_MINORISTA = 90;
	private static final Integer PRECIO_MAYORISTA = 85;

	public static void main(String[] args) {
		Integer x;
		Integer pag;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de costo de lápices");
		System.out.println("-------------------------------");
		System.out.println("Ingrese la cantidad de lápices a comprar:");
		x= sc.nextInt();
		sc.close();
		
		if(x>=CANT_MAYORISTA) {
			pag= x* PRECIO_MAYORISTA;
		}
		else {
			pag= x* PRECIO_MINORISTA;
		}
		
		System.out.println("El precio a pagar es: "+ pag);
		
	}

}
