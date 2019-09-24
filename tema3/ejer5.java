/*
*
* Ejercicio 5: Calcula el area de un rectangulo
*
*/

import java.util.Scanner;

public class ejer5 {
	public static void main(String[] args) {
		float area;
		float lado1;
		float lado2;
	
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca lado1 en cm: ");
		lado1 = teclado.nextFloat();

		System.out.print("Introduzca lado2 en cm: ");
		lado2 = teclado.nextFloat();

		area = lado1*lado2;
		System.out.printf("El area del rectangulo es %.2f cm cuadrados\n", area);
	}
}