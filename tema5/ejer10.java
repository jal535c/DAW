/*
*
* Ejercicio 10: Calcula media de numero, para detener introducir numero negativo
*
*/

import java.util.Scanner;

public class ejer10 {
	public static void main(String[] args) {
		int n=0, suma=0, i=0;
		Scanner s = new Scanner(System.in);
		float media;

		System.out.println("Introduzca numeros (negativo para detener)");
		n = s.nextInt();
		
		while (n>=0) {
			suma += n;
			i++;
			n = s.nextInt();
		}

		media = 1.0f*suma/i;
		System.out.printf("La media es: %.2f\n", media);
	}
}