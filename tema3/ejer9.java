/*
*
* Ejercicio 9: Calcular el volumen de un cono
*
*/

import java.util.Scanner;

public class ejer9 {
	public static void main(String[] args) {
		float r;
		float h;
		float v;
		final double PI = 3.1416;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca radio en cm: ");
		r = teclado.nextFloat();

		System.out.print("Introduzca altura en cm: ");
		h = teclado.nextFloat();

		v = (float)PI*r*r*h / 3;
		System.out.printf("El volumen del cono es %.2f cm cubicos\n", v);
	}
}