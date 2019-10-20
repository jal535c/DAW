/*
*
* Ejercicio 53: Triangulo
*
*/

public class Ejer53 {
  public static void main(String[] args) {
    int n;
    int ancho;

    System.out.print("Introduzca altura: ");
    n = Integer.parseInt(System.console().readLine());

    ancho = n;
    for (int filas=0; filas<n; filas++) {
      for (int i=0; i<ancho; i++) {
        System.out.print("*");
      }
      ancho--;

      System.out.println();
    }
  }
}