package ej06Hipotenusa;

import java.util.Scanner;

public class Hipotenusa {
	public static void main(String[] args) {
		Integer cateto1;
		Integer cateto2;
		Double hipotenusa;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Medida cateto1: ");
		cateto1= scanner.nextInt();
		
		System.out.println("Medida cateto2:");
		cateto2= scanner.nextInt();
		
		hipotenusa= Math.sqrt((Math.pow(cateto1, 2)+ Math.pow(cateto2, 2)));
		
		System.out.println("La hipotenusa del triángulo es: "+ hipotenusa);
		
	}

}
