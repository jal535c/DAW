/*
*
* Ejercicio 19: Piramide (se pide por teclado altura y caracter)
*
*/

import java.util.Scanner;

public class Ejer19 {
  public static void main(String[] args) {
    int n;
    char c;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca altura: ");
    n = s.nextInt();

    System.out.print("Introduzca caracter: ");
    c = s.next().charAt(0);

    for (int fila=0; fila<n; fila++) {
      
      for (int i=0; i<n-fila; i++) {
        System.out.print(" ");
      }
      
      for (int i=n-fila; i<=n; i++) {
        System.out.printf("%c ", c);
      }
            
      System.out.printf("\n");
    
    }
  }
}
