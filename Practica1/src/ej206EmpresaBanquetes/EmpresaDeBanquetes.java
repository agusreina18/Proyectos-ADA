package ej206EmpresaBanquetes;

import java.util.Scanner;

public class EmpresaDeBanquetes {
	private static final Integer LIM_2 = 300;
	private static final Integer PRECIO2 =750;
	private static final Integer LIM_1 = 200;
	private static final Integer PRECIO1 = 850;

	public static void main(String[] args) {
		Integer numPersonas;
		Integer total;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Calculadora de Costos");
		System.out.println("----------------------");
		System.out.println("Ingrese la cantidad de comensales:");
		
		numPersonas=sc.nextInt();
		
		if(numPersonas>LIM_2) {
			total=numPersonas*PRECIO2;
		}
		else {
			if(numPersonas>LIM_1) {
					total=numPersonas*PRECIO1;
			}
			else {
				total=numPersonas*900;
			}
		}
		
		System.out.println("El total a pagar es "+ total);
	}

}
