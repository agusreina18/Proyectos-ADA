package ej13Ahorro;

import java.util.Scanner;

public class Ahorro {
	public static void main(String[] args) {
		Double sueldoSem;
		Double ahorro;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Sueldo semanal: ");
		sueldoSem= scanner.nextDouble();
		
		ahorro= (sueldoSem*0.15)*4*12;
		
		
		System.out.println("El ahorro anual estimado es: "+ ahorro);
	}

}
