/*
*
* Ejercicio 35: Pintar una X
*
*/

public class Ejer35 {
  public static void main(String[] args) {
    int n;

    int h1;
    int h2;

    int espacios;
    int huecos;

    System.out.print("Introducir una altura: ");
    n = Integer.parseInt(System.console().readLine());

    if ((n<3) || (n%2==0)) {
      System.out.println("Error, debe introducir una altura impar y mayor o igual a 3.");
    } else {

      h1=(n+1)/2;
      h2 = h1-1;

      espacios=0;
      huecos = n-2;
      for (int filas=0; filas<h1; filas++) {
        for (int i=0; i<espacios; i++) {
          System.out.print(" ");
        }
        espacios++;
  
        System.out.print("*");
  
        for (int i=0; i<huecos; i++) {
          System.out.print(" ");
        }
        huecos-=2;
  
        if (filas < h1-1) {
          System.out.print("*");
        }
        System.out.println();
      }

      espacios-=2;
      huecos = 1;
      for (int filas=0; filas<h2; filas++) {
        for (int i=0; i<espacios; i++) {
          System.out.print(" ");
        }
        espacios--;

        System.out.print("*");

        for (int i=0; i<huecos; i++) {
          System.out.print(" ");
        }
        huecos+=2;

        System.out.print("*");

        System.out.println();
      }

    }
  }
}