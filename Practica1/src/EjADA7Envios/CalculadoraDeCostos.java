package EjADA7Envios;

import java.util.Scanner;

public class CalculadoraDeCostos {
	public static void main(String[] args) {
		Integer pesoDePaquete, zonaDeEnvio, costo;
		costo= 0;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Ingrese el peso del paquete en grs:");
		pesoDePaquete= scanner.nextInt();
		System.out.println("Ingrese el código correspondiente de la zona a la que quiere enviar el paquete:");
		System.out.println("1-América del Norte");
		System.out.println("2-América Central");
		System.out.println("3-América del Sur");
		System.out.println("4-Europa");
		System.out.println("5-Asia");
		zonaDeEnvio= scanner.nextInt();
		if(pesoDePaquete<5000) {
			switch (zonaDeEnvio) {
			case 1:
				costo= 11*pesoDePaquete;
				break;
			case 2:
				costo= 10*pesoDePaquete;
				break;
			case 3:
				costo= 12*pesoDePaquete;
				break;
			case 4:
				costo=24*pesoDePaquete;
				break;
			case 5:
				costo=27*pesoDePaquete;
				break;
			default:
				System.out.println("Código inválido");
				break;
			}
			System.out.println("El costo del envío es "+ costo);
		}
		else {
			System.out.println("El paquete no se puede transportar por exceso de peso.");
		}
	}

}
