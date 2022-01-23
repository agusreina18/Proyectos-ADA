package ej17NotaPromedio;

import java.util.Scanner;

public class NotaPromedio {
	public static void main(String[] args) {
		Double nota1;
		Double nota2;
		Double nota3;
		Double promedio;
		
Scanner scanner= new Scanner(System.in);
		
		System.out.println("Nota1: ");
		nota1= scanner.nextDouble();
		
		System.out.println("Nota2: ");
		nota2= scanner.nextDouble();
		
		System.out.println("Nota3: ");
		nota3= scanner.nextDouble();
		
		promedio= nota1*0.25+nota2*0.25+nota3*0.5;
		
		
		System.out.println("La nota promedio es: "+ promedio);
	}

}
