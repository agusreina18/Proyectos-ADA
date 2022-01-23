package ej05Pintureria;

import java.util.Scanner;

public class Presupuesto {
	public static void main(String[] args) {
		Integer precioM2;
		Integer cantM2;
		Integer presupuesto;
		
Scanner scanner= new Scanner(System.in);
		
		System.out.println("Precio del metro2: ");
		precioM2= scanner.nextInt();
		
		System.out.println("cantidad de m2:");
		cantM2= scanner.nextInt();
		
		presupuesto= precioM2*cantM2;
		
		System.out.println("El total a cobrar es: "+ presupuesto);
		
	}

}
