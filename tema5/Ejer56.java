/*
*
* Ejercicio 56: Pinta triangulo girado
*
*/

public class Ejer56 {
  public static void main(String[] args) {
    int n;
    int espacios;
    int ancho;

    System.out.print("Introduzca altura: ");
    n = Integer.parseInt(System.console().readLine());

    espacios = 0;
    ancho = n;

    for (int fila=0; fila<n; fila++) {
      for (int i=0; i<espacios; i++) {
        System.out.print(" ");
      }
      espacios++;

      for (int i=0; i<ancho; i++) {
        System.out.print("*");
      }
      ancho--;

      System.out.println();
    }
  }
}