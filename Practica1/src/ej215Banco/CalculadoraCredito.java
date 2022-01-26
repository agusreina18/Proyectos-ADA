/*Ejemplo 2.15

El banco �Pueblo desconocido� ha decidido aumentar el l�mite de cr�dito de las
tarjetas de cr�dito de sus clientes, para esto considera que si su cliente tiene tarjeta tipo
1, el aumento ser� de 25 %; si tiene tipo 2, ser� de 35 %; si tiene tipo 3, de 40 %, y para
cualquier otro tipo, de 50 %. Realice un algoritmo y represente su diagrama de flujo y el
pseudoc�digo para determinar el nuevo l�mite de cr�dito que tendr� una persona en su
tarjeta.*/

package ej215Banco;

import java.util.Scanner;

public class CalculadoraCredito {
	
	private static final Double AUMENTO_1 = 0.25;
	private static final Double AUMENTO_2 = 0.35;
	private static final Double AUMENTO_3 = 0.4;
	private static final Double AUMENTO_4 = 0.5;

	public static void main(String[] args) {
		Integer tipoTarjeta;
		Double limActual;
		Double aumento;
		Double nuevoLim;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Actualizacion Limites Crediticios-Pueblo Desconocido");
		System.out.println("----------------------------------------------------");
		System.out.println("Ingrese el tipo de tarjeta: ");
		tipoTarjeta=sc.nextInt();
		System.out.println("Ingrese el l�mite actual: ");
		limActual= sc.nextDouble();
		sc.close();
		
		switch (tipoTarjeta) {
		case 1:
			aumento= limActual* AUMENTO_1;
			break;
		case 2:
			aumento= limActual* AUMENTO_2;
			break;
		case 3:
			aumento= limActual* AUMENTO_3;
			break;
		default:
			aumento= limActual* AUMENTO_4;
			break;
		}
		
		nuevoLim= limActual+aumento;
		
		System.out.println("El aumento es de "+ aumento);
		System.out.println("El nuevo l�mite es de "+ nuevoLim);
	}

}
