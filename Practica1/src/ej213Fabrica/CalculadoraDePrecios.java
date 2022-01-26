/*Ejemplo 2.13
Fábricas “El cometa” produce artículos con claves (1, 2, 3, 4, 5 y 6). Se requiere un
algoritmo para calcular los precios de venta, para esto hay que considerar lo siguiente:
Costo de producción = materia prima + mano de obra + gastos de fabricación.
Precio de venta = costo de producción + 45 % de costo de producción.
El costo de la mano de obra se obtiene de la siguiente forma: para los productos con
clave 3 o 4 se carga 75 % del costo de la materia prima; para los que tienen clave 1 y 5 se carga
80 %, y para los que tienen clave 2 o 6, 85 %.
Para calcular el gasto de fabricación se considera que si el artículo que se va a producir
tiene claves 2 o 5, este gasto representa 30 % sobre el costo de la materia prima; si las claves
son 3 o 6, representa 35 %; si las claves son 1 o 4, representa 28 %. La materia prima tiene el
mismo costo para cualquier clave.
Represente mediante el diagrama de flujo y el pseudocódigo*/

package ej213Fabrica;

import java.util.Scanner;

public class CalculadoraDePrecios {
	public static void main(String[] args) {
		Integer claveProd;
		Double precioVenta;
		Double costoProd;
		Double matPrima;
		Double manoObra= 0.0;
		Double gastosFab= 0.0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Calculadora de Precios-El Comenta");
		System.out.println("----------------------------------");
		System.out.println("Ingrese el código del producto (1/2/3/4/5/6): ");
		claveProd= sc.nextInt();
		System.out.println("Ingrese el costo de la materia prima: ");
		matPrima= sc.nextDouble();
		sc.close();
		
		switch (claveProd) {
		case 1:
			manoObra= matPrima*0.8;
			gastosFab= matPrima*0.28;
			break;
		case 2:
			manoObra= matPrima*0.85;
			gastosFab= matPrima*0.3;
			break;
		case 3:
			manoObra= matPrima*0.75;
			gastosFab= matPrima*0.35;
			break;
		case 4:
			manoObra= matPrima*0.75;
			gastosFab= matPrima*0.28;
			break;
		case 5:
			manoObra= matPrima*0.8;
			gastosFab= matPrima*0.3;
			break;
		case 6:
			manoObra= matPrima*0.85;
			gastosFab= matPrima*0.35;
			break;

		default:
			System.out.println("El número ingresado no corresponde a un producto.");
			break;
		}
		
		costoProd= matPrima+ manoObra+ gastosFab;
		precioVenta= costoProd+ costoProd*0.45;
		
		System.out.println("El costo de producción es "+ costoProd);
		System.out.println("El precio de venta es "+ precioVenta);
		
	}

}
