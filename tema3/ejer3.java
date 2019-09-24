/*
*
* Ejercicio 3: Conversor de pesetas a euros
*
*/

import java.util.*;

public class ejer3 {
	public static void main(String[] args) {
		float euros;
		int ptas;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca cantidad de pesetas: ");
		ptas = teclado.nextInt();

		euros = ptas/166.386f;

		System.out.printf("%d pesetas son: %.2f euros\n", ptas, euros);
	}
}