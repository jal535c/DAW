/*
*
* Ejercicio 4: Realiza operaciones a dos numeros
*
*/

import java.util.*;

public class ejer4 {
	public static void main(String[] args) {
		float n1;
		float n2;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca numero1: ");
		n1 = teclado.nextFloat();

		System.out.print("Introduzca numero2: ");
		n2 = teclado.nextFloat();

		System.out.printf("Suma: %.2f\n", n1+n2);
		System.out.printf("Resta: %.2f\n", n1-n2);
		System.out.printf("Producto: %.2f\n", n1*n2);
		System.out.printf("Division: %.2f\n", n1/n2);
	}
}