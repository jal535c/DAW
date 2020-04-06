/*
*
* Ejercicio 31: Pintar la letra L
*
*/

public class Ejer31 {
  public static void main(String[] args) {
    int n;
    int h1;
    int ancho;

    System.out.print("Introduzca la altura de la L: ");
    n = Integer.parseInt(System.console().readLine());

    h1 = n-1;
    for (int i=0; i<h1; i++) {
      System.out.println("*");
    }

    ancho = (n/2)+1;
    for (int i=0; i<ancho; i++) {
      System.out.print("*");
    }

    System.out.println();
  }
}
