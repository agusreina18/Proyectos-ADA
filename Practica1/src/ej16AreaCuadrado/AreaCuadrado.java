package ej16AreaCuadrado;

import java.util.Scanner;

public class AreaCuadrado {
	public static void main(String[] args) {
		Double lado;
		Double area;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Lado del cuadrado: ");
		lado= scanner.nextDouble();
		
		area= Math.pow(lado, 2);
		
		System.out.println("El area del cuadrado es: "+ area );
	}

}
