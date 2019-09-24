/**
*	
*	Ejercicio 8: Calculo del salario semanal
*
*/

import java.util.Scanner;

public class ejer8 {
	public static void main(String[] args) {
		float salario;
		int horas;
		final float euroHora = 12.00f;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Horas trabajadas a la semana? ");
		horas = teclado.nextInt();

		salario = horas*euroHora;
		System.out.printf("Salario semanal: %.2f euros\n", salario);
	}
}