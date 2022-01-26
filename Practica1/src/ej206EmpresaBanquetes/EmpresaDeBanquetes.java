/*Ejemplo 2.6
“La langosta ahumada” es una empresa dedicada a ofrecer banquetes; sus
tarifas son las siguientes: el costo de platillo por persona es de $950.00, pero si el
número de personas es mayor a 200 pero menor o igual a 300, el costo es de $850.00.
Para más de 300 personas el costo por platillo es de $750.00. Se requiere un algoritmo
que ayude a determinar el presupuesto que se debe presentar a los clientes que deseen
realizar un evento. Mediante pseudocódigo y diagrama de flujo represente su solución.*/

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
