package ej14ChequeEmpresa;

import java.util.Scanner;

public class Cheque {
	public static void main(String[] args) {
		Integer dias;
		Integer precioNocheHotel;
		Integer gastoHotel;
		Integer precioComida;
		Integer gastoComida;
		Integer adicional;
		Integer montoCheque;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Dias de estadía: ");
		dias= scanner.nextInt();
		
		System.out.println("precio noche de hotel:");
		precioNocheHotel= scanner.nextInt();
		
		System.out.println("precio promedio de cada comida:");
		precioComida= scanner.nextInt();
		
		gastoHotel= dias*precioNocheHotel;
		gastoComida= precioComida*4*dias;
		adicional= 100*dias;
		montoCheque= gastoHotel+gastoComida+adicional;
		
		
		System.out.println("El monto total del cheque es: "+ montoCheque+ " siendo los gastos en hotel: "+ gastoHotel+ ", gastos en comida: "+ gastoComida+ " y el adicional total: "+ adicional);
	}

}
