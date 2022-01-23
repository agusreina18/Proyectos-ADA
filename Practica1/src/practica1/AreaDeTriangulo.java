package practica1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AreaDeTriangulo {
	public static void main(String[] args) {
		Integer base;
		Integer altura;
		Integer area;
		
//		base= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base por favor:"));
//		altura= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura por favor:"));
//		area= base*altura/2;
//		
//  	System.out.println("El área del triángulo es: "+ area);
		
		//Otro método puede ser por medio de un scan:
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Ingresar base: ");
		 base = scanner.nextInt();
		 System.out.println("Ingrese altura: ");
		 altura = scanner.nextInt();area = (base * altura) / 2;
		 System.out.println("el area es " + area);
		 }
	}

