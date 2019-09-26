/*
*
* Ejercicio 11: Calcular los segundos que faltan para medianoche
*
*/

import java.util.Scanner;

public class ejer11 {
	public static void main(String[] args) {
		int horas, minutos;
		Scanner s = new Scanner(System.in);
		int seg;

		System.out.print("Escriba la hora actual (en formato hora minutos): ");
		horas = s.nextInt();
		minutos = s.nextInt();

		seg = (60-minutos)*60;
		seg = (24-horas+1)*3600;

		System.out.printf("Hora actual %d:%d, faltan %d segundos para medianoche\n", horas, minutos, seg);
	}
}