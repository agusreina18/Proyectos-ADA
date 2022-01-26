/*Ejemplo 2.8
El director de una escuela est� organizando un viaje de estudios, y requiere
determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de
viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o m�s, el
costo por cada alumno es de $65.00; de 50 a 99 alumnos, el costo es de $70.00, de 30 a
49, de $95.00, y si son menos de 30, el costo de la renta del autob�s es de $4000.00, sin
importar el n�mero de alumnos. Realice un algoritmo que permita determinar el pago a
la compa��a de autobuses y lo que debe pagar cada alumno por el viaje (represente en
pseudoc�digo y diagrama de flujo)*/

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
		System.out.println("Ingrese el n�mero de alumnos:");
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
