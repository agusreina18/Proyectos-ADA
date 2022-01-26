/*Ejemplo 2.9
La pol�tica de la compa��a telef�nica �chimef�n� es: �Chismea + x -�. Cuando se
realiza una llamada, el cobro es por el tiempo que �sta dura, de tal forma que los
primeros cinco minutos cuestan $ 1.00 c/u, los siguientes tres, 80� c/u, los siguientes
dos minutos, 70� c/u, y a partir del d�cimo minuto, 50� c/u.
Adem�s, se carga un impuesto de 5% cuando es domingo, y si es d�a h�bil, en
turno matutino, 15%, y en turno vespertino, 10%. Realice un algoritmo para determinar
cu�nto debe pagar por cada concepto una persona que realiza una llamada.
Repres�ntelo en diagrama de flujo y en pseudoc�digo.*/

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
