/*
* 
* Ejercicio 13: Ordenar 3 numeros
*
*/

import java.util.Scanner;

public class Ejer13 {
	public static void main(String[] args) {
		int a,b,c;
		int mayor, medio, menor;
		Scanner s = new Scanner(System.in);

		System.out.print("Escriba 3 numeros enteros: ");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();

		if (a>b) {
			if (a>c) {
				mayor=a;
				if (b>c) {
					menor=c;
					medio=b;
				} else {
					menor = b;
					medio=c;
				}
			} else {
				mayor = c;
				menor=b;
				medio=a;
			}
		} else {
			if (b>c) {
				mayor=b;
				if (a>c) {
					menor=c;
					medio=a;
				} else {
					menor=a;
					medio=c;
				}
			} else {
				mayor=c;
				menor=a;
				medio=b;
			}
		}

		System.out.printf("El orden ascendente es: %d, %d, %d\n", menor, medio, mayor);
	}
}