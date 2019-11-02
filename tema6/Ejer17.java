/*
*
* Ejercicio 17: Pecera
*
*/

public class Ejer17 {
  public static void main(String[] args) {
    int alto;
    int ancho;
    int x, y;

    System.out.print("Introduzca la altura de la pecera (minimo 4): ");
    alto = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la anchura de la pecera (minimo 4): ");
    ancho = Integer.parseInt(System.console().readLine());

    x = (int)(Math.random()*(ancho-2));
    y = (int)(Math.random()*(alto-2));

    for (int i=0; i<ancho; i++) {     //parte alta
      System.out.print("*");
    }
    System.out.println();

    for (int fila=0; fila<alto-2; fila++) {   //parte central
      System.out.print("*");

      for (int i=0; i<ancho-2; i++) {
        if (fila==y && i==x) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
      }

      System.out.print("*");

      System.out.println();
    }

    for (int i=0; i<ancho; i++) {     //parte baja
      System.out.print("*");
    }
    System.out.println();
  }
}
