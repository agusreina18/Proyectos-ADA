/*Ejemplo 2.11
“El náufrago satisfecho” ofrece hamburguesas sencillas, dobles y triples, las
cuales tienen un costo de $20.00, $25.00 y $28.00 respectivamente. La empresa acepta
tarjetas de crédito con un cargo de 5 % sobre la compra. Suponiendo que los clientes
adquieren sólo un tipo de hamburguesa, realice un algoritmo para determinar cuánto
debe pagar una persona por N hamburguesas. Represéntelo mediante diagrama de
flujo y pseudocódigo.*/

package ej211Restaurante;

import java.util.Scanner;

public class CalculadoraDePedidos {
	private static final Double COSTO_SIMPLE = 20.0;
	private static final Double COSTO_DOBLE = 25.0;
	private static final Double COSTO_TRIPLE = 28.0;
	private static final Double CARGO_TARJETA = 0.05;

	public static void main(String[] args) {
		String tipoHamburguesa;
		String tipoPago;
		Integer numHamb;
		Double precioHamb= 0.0;
		Double costoPedido= 0.0;
		Double cargo= 0.0;
		Double total= 0.0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Calculadora de Costos- El naufrago insatisfecho");
		System.out.println("------------------------------------------------");
		System.out.println("Ingrese el tipo de hamburguesa (SENCILLA/DOBLE/TRIPLE): ");
		tipoHamburguesa= sc.next();
		System.out.println("Ingrese la cantidad de hamburguesas: ");
		numHamb= sc.nextInt();
		System.out.println("Ingrese el tipo de pago (EFECTIVO/TARJETA)");
		tipoPago= sc.next();
		sc.close();
		
		switch (tipoHamburguesa) {
		case "SENCILLA":
			precioHamb= COSTO_SIMPLE;
			break;
		case "DOBLE":
			precioHamb= COSTO_DOBLE;
			break;
		case "TRIPLE":
			precioHamb= COSTO_TRIPLE;
			break;

		default:
			System.out.println("Valor incorrecto");
			break;
		};
		
		costoPedido= precioHamb * numHamb;
		
		switch (tipoPago) {
		case "TARJETA":
			cargo= CARGO_TARJETA * costoPedido;
			break;
		case "EFECTIVO":
			cargo= 0.0;
			break;

		default:
			System.out.println("Entrada inválida.");
			break;
		}
		
		
		total= costoPedido+ cargo;
		
		System.out.println("El costo por hamburguesa es: "+ precioHamb);
		System.out.println("El total sin cargo es: "+ costoPedido);
		System.out.println("El cargo según el tipo de pago es: "+ cargo);
		System.out.println("El total a pagar es: "+ total);
		
		
	}

}
