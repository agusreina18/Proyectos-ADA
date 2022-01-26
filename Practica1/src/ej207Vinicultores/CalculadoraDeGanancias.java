/*Ejemplo 2.7
La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de
uva, la cual se clasifica en tipos A y B, y adem�s en tama�os 1 y 2. Cuando se realiza la
venta del producto, �sta es de un solo tipo y tama�o, se requiere determinar cu�nto
recibir� un productor por la uva que entrega en un embarque, considerando lo siguiente:
si es de tipo A, se le cargan 20$ al precio inicial cuando es de tama�o 1; y 30$ si es de
tama�o 2. Si es de tipo B, se rebajan 30$ cuando es de tama�o 1, y 50$ cuando es de
tama�o 2. Realice un algoritmo para determinar la ganancia obtenida y repres�ntelo
mediante diagrama de flujo y pseudoc�digo.*/

package ej207Vinicultores;

import java.util.Scanner;

public class CalculadoraDeGanancias {
	public static void main(String[] args) {
		String tipoUva;
		Integer tamanioUva;
		Integer kilos;
		Integer ganancia;
		Integer precio;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Calculadora de Gnancias Vinicultores");
		System.out.println("------------------------------------");
		System.out.println("Ingrese el precio de la Uva:");
		precio=sc.nextInt();
		System.out.println("Ingrese el tipo de Uva:");
		tipoUva= sc.next();
		System.out.println("Ingrese el tama�o de la Uva:");
		tamanioUva= sc.nextInt();
		System.out.println("Ingrese la cantidad en kilos:");
		kilos=sc.nextInt();
		
		if(tipoUva=="A"||tipoUva=="a") {
			if(tamanioUva==1) {
				precio = precio +20;
			}
			else {
				precio= precio +30;
			}
		}
		else if (tipoUva=="B"||tipoUva=="b"){
			if(tamanioUva==1) {
				precio = precio-30;
			}
			else {
				precio = precio-50;
			}
		}
		
		ganancia= kilos*precio;
		
		System.out.println("La ganancia total es de: "+ ganancia);
	}

}
