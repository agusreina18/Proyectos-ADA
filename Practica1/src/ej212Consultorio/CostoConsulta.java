/*Ejemplo 2.12
El consultorio del Dr. Lorenzo T. Mata Lozano tiene como política cobrar la
consulta con base en el número de cita, de la siguiente forma:
Las tres primeras citas a $200.00 c/u.
Las siguientes dos citas a $150.00 c/u.
Las tres siguientes citas a $100.00 c/u.
Las restantes a $50.00 c/u, mientras dure el tratamiento.
Se requiere un algoritmo para determinar:
a) Cuánto pagará el paciente por la cita.
b) El monto de lo que ha pagado el paciente por el tratamiento.*/

package ej212Consultorio;

import java.util.Scanner;

public class CostoConsulta {
	public static void main(String[] args) {
		Integer numConsulta;
		Double costoConsulta;
		Double costoTratamiento;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Calculadora de costo de consulta.");
		System.out.println("----------------------------------");
		System.out.println("Ingrese el número de consulta: ");
		numConsulta=sc.nextInt();
		sc.close();
		
		if(numConsulta<=3) {
			costoConsulta= 200.0;
			costoTratamiento= costoConsulta*numConsulta;
		}
		else {
			if(numConsulta<=5) {
				costoConsulta= 150.0;
				costoTratamiento= (numConsulta-3)*costoConsulta+600;
			}
			else {
				if(numConsulta<=8) {
					costoConsulta= 100.0;
					costoTratamiento= (numConsulta-5)*costoConsulta+900;
				}
				else {
					costoConsulta= 50.0;
					costoTratamiento=(numConsulta-8)*costoConsulta+1200;
				}
			}
		}
		System.out.println("El costo de la consulta es: "+ costoConsulta);
		System.out.println("El costo del tratamiento es: "+ costoTratamiento);
	}

}
