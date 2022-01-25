package ej201MayorMenor;

import java.util.Scanner;

public class CalculadoraMayorMenor {
	public static void main(String[] args) {
		Integer n1;
		Integer n2;
		Integer mayor;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Bienvenido a la calculadora de mayor o menor!");
		System.out.println("------------------------------------------------");
		System.out.println("Ingrese el primer número:");
		n1= sc.nextInt();
		System.out.println("Ingrese el segundo número:");
		n2=sc.nextInt();
		
		if (n1>n2) {
			mayor=n1;
		}
		else if (n2>n1) {
			mayor= n2;
		}
		else {
			mayor=0;
		}
		
		System.out.println("El número mayor es: "+ mayor);
	}

}
