/*Ejemplo 2.10
Una compañía de viajes cuenta con tres tipos de autobuses (A, B y C), cada uno
tiene un precio por kilómetro recorrido por persona, los costos respectivos son $2.0,
$2.5 y $3.0. Se requiere determinar el costo total y por persona del viaje considerando
que cuando éste se presupuesta debe haber un mínimo de 20 personas, de lo contrario
el cobro se realiza con base en este número límite.*/

package ej210CompaniaDeViajes;

import java.util.Scanner;

public class CalculadoraDeCostos {
	private static final Double COSTOA = 2.0;
	private static final Double COSTOB = 2.5;
	private static final Double COSTOC = 3.0;
	private static final Integer NUM_LIM = 20;

	public static void main(String[] args) {
		String tipoAutobus;
		Integer numPasajeros;
		Double costoTotal= 0.0;
		Double costoPersona= 0.0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Caluladora de Costos- Empresa de Viajes");
		System.out.println("---------------------------------------");
		System.out.println("Ingrese el tipo de autobus (A/B/C):");
		tipoAutobus= sc.next();
		System.out.println("Ingrese el número de pasajeros: ");
		numPasajeros= sc.nextInt();
		
		sc.close();
		
		switch (tipoAutobus) {
		case "A":
			costoPersona= COSTOA;
			break;
		case "B":
			costoPersona= COSTOB;
			break;
		case "C":
			costoPersona= COSTOC;
			break;
		default:
			System.out.println("El valor ingresado es incorrecto, intente de nuevo.");
			break;
		}
		
		if(numPasajeros>=NUM_LIM) {
			costoTotal= numPasajeros*costoPersona;
		}
		else {
			costoTotal= 20*costoPersona;
		}
		
		System.out.println("El costo por persona es: "+ costoPersona);
		System.out.println("El costo total del viaje es: "+ costoTotal);
	}

}
