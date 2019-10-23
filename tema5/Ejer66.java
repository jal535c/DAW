/*
*
* Ejercicio 66: Pintar flecha
*
*/

public class Ejer66 {
  public static void main(String[] args) {
    int n;
    int h1;
    int h2;
    int huecos;

    System.out.print("Introduzca la altura (impar y >=3): ");
    n = Integer.parseInt(System.console().readLine());

    if ((n<3) || (n%2==0)) {
      System.out.print("Error, altura debe ser impar mayor o igual a 3.");
    } else {
      h1 = (n+1)/2;
      h2 = h1-1;
      huecos = 0;

      for (int filas=0; filas<h1; filas++) {
        for (int i=0; i<huecos; i++) {
          System.out.print(" ");
        }
        huecos++;
  
        System.out.println("*    *");
      }

      huecos-=2;
      for (int filas=0; filas<h2; filas++) {
        for (int i=0; i<huecos; i++) {
          System.out.print(" ");
        }
        huecos--;

        System.out.println("*    *");
      }
    }
  }
}