/*
*
* Ejercicio 2: Conversor de euros a pesetas
*
*/

import java.util.*;

public class ejer2 {
	public static void main(String[] args) {
		float euros;
		int ptas;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca cantidad de euros: ");
		euros = teclado.nextFloat();

		ptas = (int)(euros*166.386f);

		System.out.printf("%.2f euros son: %d ptas\n", euros,ptas);
	}
}
