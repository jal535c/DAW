/**
*	
*	Ejercicio 12: Media ponderada de las notas
*
*/

import java.util.Scanner;

public class ejer12 {
	public static void main(String[] args) {
		float nota1;
		float nota2;
		float trimestre;
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce la nota del primer examen: ");
		nota1 = teclado.nextFloat();			//al introducir numeros decimales usar ,
		
		System.out.print("Introduce la nota deseada en el trimestre: ");
		trimestre = teclado.nextFloat();

		nota2 = (trimestre - nota1*0.4f)/0.6f;

		System.out.printf("Necesitas sacar un %.2f en el segundo examen\n", nota2);
	}
}