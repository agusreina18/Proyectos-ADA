package ej11CompaniaLuz;

import java.util.Scanner;

public class Costo {
	public static void main(String[] args) {
		Integer precioKW;
		Integer Kws;
		Integer costo;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Precio del KW: ");
		precioKW= scanner.nextInt();
		
		System.out.println("cantidad de KW:");
		Kws= scanner.nextInt();
		
		costo= precioKW*Kws;
		
		System.out.println("El costo total es: "+ costo);
	}

}
