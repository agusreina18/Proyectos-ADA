package ej09Llamada;

import java.util.Scanner;

public class CostoLlamada {
	public static void main(String[] args) {
		Integer precioMin;
		Integer tiempo;
		Integer costo;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Precio del minuto: ");
		precioMin= scanner.nextInt();
		
		System.out.println("tiempo de llamada:");
		tiempo= scanner.nextInt();
		
		costo= precioMin*tiempo;
		
		System.out.println("El costo por llamada es: "+ costo);
	}

}
