package ej08TiempoBicicleta;

import java.util.Scanner;

public class TiempoBicicleta {
	public static void main(String[] args) {
		Integer velocidad;
		Integer distancia;
		Integer tiempo;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Velocidad: ");
		velocidad= scanner.nextInt();
		
		System.out.println("distancia a recorrer:");
		distancia= scanner.nextInt();
		
		tiempo= distancia/velocidad;
		
		System.out.println("El tiempo que tardará es: "+ tiempo);
	}

}
