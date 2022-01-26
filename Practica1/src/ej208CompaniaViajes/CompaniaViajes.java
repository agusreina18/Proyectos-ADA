/*Ejemplo 2.8
El director de una escuela está organizando un viaje de estudios, y requiere
determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de
viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o más, el
costo por cada alumno es de $65.00; de 50 a 99 alumnos, el costo es de $70.00, de 30 a
49, de $95.00, y si son menos de 30, el costo de la renta del autobús es de $4000.00, sin
importar el número de alumnos. Realice un algoritmo que permita determinar el pago a
la compañía de autobuses y lo que debe pagar cada alumno por el viaje (represente en
pseudocódigo y diagrama de flujo)*/

package ej208CompaniaViajes;

import java.util.Scanner;

public class CompaniaViajes {
	private static final Integer LIM1 = 30;
	private static final Integer LIM2 = 50;
	private static final Integer LIM3 = 100;

	public static void main(String[] args) {
		Integer numAlumnos;
		Double pagoAlumno= 0.0;
		Double total;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Empresa de Viajes");
		System.out.println("------------------");
		System.out.println("Ingrese el número de alumnos:");
		numAlumnos=sc.nextInt();
		
		if(numAlumnos<LIM1) {
			total= 4000.0;
		}
		else {
		if(numAlumnos<LIM2) {
			pagoAlumno= 95.0;
		}
		else if (numAlumnos<LIM3) {
			pagoAlumno= 70.0;
		}
		else if (numAlumnos>=LIM3) {
			pagoAlumno= 65.0;
		}
		total= pagoAlumno*numAlumnos;
		}
		System.out.println("Cada alumno debe pagar: "+ pagoAlumno);
		System.out.println("El total a pagar es: "+ total);
	}

}
