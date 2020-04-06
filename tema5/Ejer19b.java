/*
*
* Ejercicio 19b: Piramide
*
*/

import java.util.Scanner;

public class Ejer19b {
  public static void main(String[] args) {
    int n;
    char c;
    Scanner s = new Scanner(System.in);
    int j;      //indice para pintar el caracter

    System.out.print("Introduzca altura: ");
    n = s.nextInt();

    System.out.print("Introduzca caracter: ");
    c = s.next().charAt(0);

    j = 1;
    for (int fila=0; fila<n; fila++) {
      
      for (int i=n-1; i>fila; i--) {
        System.out.print(" ");
      }
      
      for (int i=0; i<j; i++) {
        System.out.printf("%c", c);
      }
      j+=2;
            
      System.out.printf("\n");
    
    }
  }
}
