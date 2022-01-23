package ej12PrecioArticulo;

import java.util.Scanner;

public class PrecioArticulo {
	public static void main(String[] args) {
		Double precioArt;
		Double precioDescontado;
		Double precioFinal;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Precio del Artículo: ");
		precioArt= scanner.nextDouble();
		
		precioDescontado= precioArt*0.8;
		
		precioFinal= precioDescontado* 1.15;
		
		System.out.println("El precio descontado es: "+ precioDescontado + " y el precio con IVA es: "+ precioFinal);
	}

}
