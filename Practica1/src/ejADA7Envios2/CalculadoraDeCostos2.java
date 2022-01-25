/*Una compañía de paquetería internacional tiene servicio en algunos países de
América del Norte, América Central, América del Sur, Europa y Asia. El costo por el
servicio de paquetería se basa en el peso del paquete y la zona a la que va dirigido.Parte de su política implica que los paquetes con un peso superior a 5 kg no son
transportados, esto por cuestiones de logística y de seguridad. Realice un algoritmo
para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la
entrega; represéntelo mediante diagrama de flujo y pseudocódigo.*/

package ejADA7Envios2;

import java.util.Scanner;

public class CalculadoraDeCostos2 {
	private static final Integer PESO_MAX = 5000;
	private static final int ZONA_1 = 1;
	private static final int ZONA_2 = 2;
	private static final int ZONA_3 = 3;
	private static final int ZONA_4 = 4;
	private static final int ZONA_5 = 5;
	private static final Integer VALOR_Z1 = 11;
	private static final Integer VALOR_Z2 = 10;
	private static final Integer VALOR_Z3 = 12;
	private static final Integer VALOR_Z4 = 24;
	private static final Integer VALOR_Z5 = 27;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenido al sistema de Envíos! ");
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("Ingrese el peso del paquete en gramos:");
		Integer gramosEnvio= sc.nextInt();
		
		if(gramosEnvio < PESO_MAX){
			System.out.println("El envío no puede procesarse por exceder los 5000 grs");
		}
		else {
			System.out.println("Ingrese el código correspondiente a la zona de envío:");
			Integer zonaDeEnvio = sc.nextInt();
			Integer costo;
			
			switch (zonaDeEnvio) {
			case ZONA_1:
				costo= gramosEnvio* VALOR_Z1;
				break;
			
			case ZONA_2:
				costo= gramosEnvio* VALOR_Z2;
				break;
				
			case ZONA_3:
				costo= gramosEnvio* VALOR_Z3;
				break;
				
			case ZONA_4:
				costo= gramosEnvio* VALOR_Z4;
				break;
				
			case ZONA_5:
				costo= gramosEnvio* VALOR_Z5;
				break;

			default:
				costo= 0;
				break;
			}
			
			System.out.println("El costo del envío es: "+ costo);
		}
	}

}
