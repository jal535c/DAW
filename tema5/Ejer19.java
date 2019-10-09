/*
*
* Ejercicio 19: Piramide, se pide por teclado altura y caracter
*
*/

import java.util.Scanner;

public class Ejer19 {
  public static void main(String[] args) {
    int n;
    char c;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca altura: ");
    n = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca caracter: ");
    c = s.next().charAt(0);

    for (int j=0; j<n; j++) {
      for (int i=0; i<n-j; i++) {
        System.out.print(" ");
      }
      for (int i=n-j; i<=n; i++) {
        System.out.printf("%c ", c);
      }
      System.out.printf("\n");
    }
  }
}
