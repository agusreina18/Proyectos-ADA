package ej03CalculadoraEdad;

import java.util.Scanner;

public class CalculadoraEdad {
	public static void main(String[] args) {
		Integer anioNacimiento;
		Integer anioActual;
		Integer edad;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("A�o de nacimiento del empleado: ");
		anioNacimiento= scanner.nextInt();
		
		System.out.println("A�o actual: ");
		anioActual= scanner.nextInt();
		
		edad= anioActual-anioNacimiento;
		
		System.out.println("La edad del empleado es: "+ edad);
	}

}
