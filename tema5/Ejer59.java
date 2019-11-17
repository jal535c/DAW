/*
*
* Ejercicio 59: Pinta arbol de navidad
*
*/

public class Ejer59 {
  public static void main(String[] args) {
    int altura;
    int h1, espacio, hueco, base;

    System.out.print("Introduzca altura del arbol (>=4): ");
    altura=Integer.parseInt(System.console().readLine());

    h1=altura-3;
    espacio=h1;
    hueco=-1;
    base=(h1*2)+1;

    for (int i=0; i<h1; i++) {      //estrella
      System.out.print(" ");
    }
    System.out.println("*");

    for (int fila=0; fila<h1; fila++) {   //parte central
      for (int i=0; i<espacio; i++) {
        System.out.print(" ");
      }
      espacio--;

      System.out.print("^");

      for (int i=0; i<hueco; i++) {
        System.out.print(" ");
      }
      hueco+=2;

      if (fila>0) {
        System.out.print("^");
      }

      System.out.println();
    }

    for (int i=0; i<base; i++) {    //base
      System.out.print("^");
    }
    System.out.println();

    for (int i=0; i<h1; i++) {      //tronco
      System.out.print(" ");
    }
    System.out.println("Y");
  }
}