/*
*
* Ejercicio 24: Piramide con numeros
*
*/

import java.util.Scanner;

public class Ejer24 {
  public static void main(String[] args) {
    int n;
    char c;
    Scanner s = new Scanner(System.in);
    int i, j;

    System.out.print("Introduzca altura: ");
    n = s.nextInt();

    j=1;
    for (int fila=0; fila<n; fila++) {
      
      for (i=n-1; i>fila; i--) {    //pinta huecos
        System.out.print(" ");
      }
      
      for (i=1; i<j; i++) {         //pinta numeros en 2 fases
        System.out.printf("%d", i);
      }
      for (i=j; i>0; i--) {
        System.out.printf("%d", i);
      }
      j++;
            
      System.out.printf("\n");
    
    }
  }
}
