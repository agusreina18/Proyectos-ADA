package ej205MayorDeTres;

import java.util.Scanner;

public class CalculadoraMayorDe3 {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer c;
		Integer m;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Calculadora de Mayor de 3");
		System.out.println("--------------------------");
		System.out.println("Ingrese el primer número:");
		a=sc.nextInt();
		System.out.println("Ingrese el segundo número:");
		b=sc.nextInt();
		System.out.println("Ingrese el tercer número:");
		c=sc.nextInt();
		
		if (a>b) {
			if (a>c) {
				m=a;
			}
			else {
				m=c;
			}
		}
		else {
			if (b>c) {
				m=b;
			}
			else {
				m=c;
			}
		}
		
		System.out.println("El mayor es "+ m);
	}

}
