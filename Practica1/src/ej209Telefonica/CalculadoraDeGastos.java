/*Ejemplo 2.9
La política de la compañía telefónica “chimefón” es: “Chismea + x -”. Cuando se
realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los
primeros cinco minutos cuestan $ 1.00 c/u, los siguientes tres, 80¢ c/u, los siguientes
dos minutos, 70¢ c/u, y a partir del décimo minuto, 50¢ c/u.
Además, se carga un impuesto de 5% cuando es domingo, y si es día hábil, en
turno matutino, 15%, y en turno vespertino, 10%. Realice un algoritmo para determinar
cuánto debe pagar por cada concepto una persona que realiza una llamada.
Represéntelo en diagrama de flujo y en pseudocódigo.*/

package ej209Telefonica;

import java.util.Scanner;

public class CalculadoraDeGastos {
	public static void main(String[] args) {
		Integer tiempo;
		String dia;
		String turno;
		Double pagoTiempo= 0.0;
		Double impuesto= 0.0;
		Double total= 0.0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Bienevenido a Chismefon");
		System.out.println("------------------------");
		System.out.println("Ingrese el tiempo de llamada en minutos:");
		tiempo= sc.nextInt();
		System.out.println("Ingrese el dia de la semana en minusculas:");
		dia=sc.next();
		System.out.println("Ingrese el turno correspondiente (matutino/vespertino");
		turno=sc.next();
		sc.close();
		
		if(tiempo<=5) {
			pagoTiempo=tiempo*1.0;
			}
		else {
			if (tiempo<=8) {
				pagoTiempo= 5+(tiempo-5)*0.8;
				}
			
			else {
				if (tiempo<=10) {
					pagoTiempo= (tiempo-8)*0.7+7.4;
					}
				else {
					pagoTiempo= (tiempo-10)*0.5+8.8;
					}
				}
			};
		
		if(dia=="domingo") {
			impuesto=pagoTiempo*0.05;
		}
		else {
			if (turno=="matutino") {
					impuesto=pagoTiempo*0.15;
				}
				else {
					impuesto=pagoTiempo*0.1;
				}
		}
			
		
		
		total= pagoTiempo+impuesto;
		System.out.println("El pago es "+ pagoTiempo);
		System.out.println("El impuesto es "+ impuesto);
		System.out.println("El total a pagar es "+ total);

}
}
