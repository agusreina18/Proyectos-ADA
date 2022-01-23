package ej02Importadora;

import java.util.Scanner;

public class Convertidor {
public static void main(String[] args) {
	Integer precioDolar;
	Integer pesosMexicanos;
	Integer dolaresTotal;
	
	Scanner scanner= new Scanner(System.in);
	System.out.println("Cotización del dolar:");
	precioDolar= scanner.nextInt();
	
	System.out.println("Pesos a cambiar:");
	pesosMexicanos= scanner.nextInt();
	
	dolaresTotal= pesosMexicanos/precioDolar;
	
	System.out.println("Puede comprar: "+ dolaresTotal+ " dolares");
}
}
