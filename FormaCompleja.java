/*
*
*	Dada una cantidad en bytes, conviertase a forma compleja expresando su equivalencia en MB, KB, B
*
*/

import java.util.Scanner;

public class FormaCompleja {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int bytes;
		int kb, mega;
		int restoB, restoK;

		System.out.print("Introduzca una cantidad de bytes: ");
		bytes = s.nextInt();

		kb = bytes/1024;
		restoB = bytes%1024;

		mega = kb/1024;
		restoK = kb%1024;

		System.out.printf("%d B = %d MB + %d KB + %d B\n", bytes, mega, restoK, restoB);
	}
}