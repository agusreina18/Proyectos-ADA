package ej10Conagua;

import java.util.Scanner;

public class Costo {
	public static void main(String[] args) {
		Integer precioM3;
		Integer cantM3;
		Integer costo;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Precio del m3: ");
		precioM3= scanner.nextInt();
		
		System.out.println("cantidad de m3:");
		cantM3= scanner.nextInt();
		
		costo= precioM3*cantM3;
		
		System.out.println("El costo total es: "+ costo);
	}

}
