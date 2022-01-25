package ej204CasaDeTrajes;

import java.util.Scanner;

public class CostoTrajes {
	private static final Double PRECIO_LIM = 2500.0;
	private static final Double DESC_MAX = 0.15;
	private static final Double DESC_MIN = 0.08;

	public static void main(String[] args) {
		Double costoTotal;
		Double descuento;
		Double precioFinal;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Calculadora de Precio de Trajes");
		System.out.println("-------------------------------");
		System.out.println("Ingrese el costo del traje:");
		costoTotal= sc.nextDouble();
		
		if(costoTotal>PRECIO_LIM) {
			descuento= costoTotal*DESC_MAX;
		}
		else {
			descuento= costoTotal*DESC_MIN;
		}
		
		precioFinal= costoTotal-descuento;
		
		System.out.println("El descuento a aplicar es de: "+ descuento);
		System.out.println("El precio final a pagar es: "+ precioFinal);
	}

}
