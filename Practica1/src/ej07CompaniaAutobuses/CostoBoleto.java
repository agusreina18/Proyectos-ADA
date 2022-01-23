package ej07CompaniaAutobuses;

import java.util.Scanner;

public class CostoBoleto {
	public static void main(String[] args) {
		Integer precioKm;
		Integer cantKm;
		Integer costoTotal;
		
Scanner scanner= new Scanner(System.in);
		
		System.out.println("Precio del Km: ");
		precioKm= scanner.nextInt();
		
		System.out.println("Kms a recorrer:");
		cantKm= scanner.nextInt();
		
		costoTotal= precioKm*cantKm;
		
		System.out.println("El total a cobrar es: "+ costoTotal);
		
	}

}
