/*Ejemplo 2.2
Realice un algoritmo para determinar si un n�mero es positivo o negativo.
Repres�ntelo en pseudoc�digo y diagrama de flujo.*/

package ej202PositivoNegativo;

import java.util.Scanner;

public class CalculadoraPositivoNegativo {
	public static void main(String[] args) {
		Integer num;
		String r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a la Calculadora de Positivo-Negativo!");
		System.out.println("-------------------------------------------------");
		System.out.println("Ingrese el n�mero a evaluar:");
		num= sc.nextInt();
		
		if(num<0) {
			r= "Negativo";
		}
		else if (num>0) {
			r= "Positivo";
		}
		else {
			r= "Cero";
		}
		
		System.out.println("El n�mero es "+ r);
	}

}
