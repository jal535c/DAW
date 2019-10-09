/*
*
* Ejercicio 13: Introducir 10 numeros y contar los positivos
*
*/

import java.util.Scanner;

public class Ejer13 {
  public static void main(String[] args) {
    int n;
    int pos=0;
    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca 10 numeros enteros:");

    for (int i=0; i<10; i++) {
      n = s.nextInt();
      if (n>=0) {
        pos++;
      }
    }

    System.out.printf("Positivos: %d\n", pos);
    System.out.printf("Negativos: %d\n", 10-pos);
  }
}
