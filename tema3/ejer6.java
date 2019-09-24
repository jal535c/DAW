/*
*
* Ejercicio 6: Calcula el area de un triangulo
*
*/

import java.util.Scanner;

public class ejer6 {
	public static void main(String[] args) {
		float area;
		float h;
		float b;
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca base en cm: ");
		b = teclado.nextFloat();

		System.out.print("Introduzca altura en cm: ");
		h = teclado.nextFloat();

		area = b*h/2;
		System.out.printf("El area del triangulo es %.2f cm cuadrados\n", area);
	}
}