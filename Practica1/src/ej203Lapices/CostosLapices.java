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
		
		if(x>=CANT_MAYORISTA) {
			pag= x* PRECIO_MAYORISTA;
		}
		else {
			pag= x* PRECIO_MINORISTA;
		}
		
		System.out.println("El precio a pagar es: "+ pag);
		
	}

}
