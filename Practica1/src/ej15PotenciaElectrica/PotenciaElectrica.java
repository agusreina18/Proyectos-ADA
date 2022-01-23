package ej15PotenciaElectrica;

import java.util.Scanner;

public class PotenciaElectrica {
	public static void main(String[] args) {
		Integer intensidad;
		Integer resistencia;
		Integer voltaje;
		Integer potencia;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Intensidad de corriente: ");
		intensidad= scanner.nextInt();
		
		resistencia= 4;
		voltaje= resistencia*intensidad;
		potencia= voltaje*intensidad;
		
		System.out.println("La potencia del circuito es: "+ potencia);
	}

}
