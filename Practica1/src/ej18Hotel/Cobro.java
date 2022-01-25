package ej18Hotel;

import java.util.Scanner;

public class Cobro {
	public static void main(String[] args) {
		Integer precioNoche;
		Integer diasEstadia;
		Integer costo;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Precio por noche: ");
		precioNoche= scanner.nextInt();
		
		System.out.println("Dias de estadia: ");
		diasEstadia= scanner.nextInt();
		
		costo= precioNoche*diasEstadia;
		
		System.out.println("El costo de la estadia es: "+ costo );
	}

}
