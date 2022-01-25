package ej04Estacionamiento;

import java.util.Scanner;

public class Cobro {
	public static void main(String[] args) {
		Integer precioHora;
		Integer cantHoras;
		Integer cobro;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Precio de la hora: ");
		precioHora= scanner.nextInt();
		
		System.out.println("horas ocupadas:");
		cantHoras= scanner.nextInt();
		
		cobro= precioHora*cantHoras;
		
		System.out.println("El total a cobrar es: "+ cobro);
		
	}

}
