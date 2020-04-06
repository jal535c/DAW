/*
*
* Ejercicio 30: Pecera, segunda parte
*
*/

public class Ejer30 {
  public static void main(String[] args) {
    int alto;
    int ancho;
    int p1, p2, p3;

    System.out.print("Introduzca la altura de la pecera (minimo 4): ");
    alto = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora la anchura de la pecera (minimo 4): ");
    ancho = Integer.parseInt(System.console().readLine());

    p1 = (int)(Math.random()*(ancho-2)*(alto-2));
    
    do {
      p2 = (int)(Math.random()*(ancho-2)*(alto-2));
    } while (p2==p1);

    do {
      p3 = (int)(Math.random()*(ancho-2)*(alto-2));
    } while (p3==p1 || p3==p2);


    for (int i=0; i<ancho; i++) {     //parte alta
      System.out.print("*");
    }
    System.out.println();

    for (int fila=0; fila<alto-2; fila++) {   //parte central
      System.out.print("*");

      for (int i=0; i<ancho-2; i++) {
        if (i==p1) {
          System.out.print("&");
        } else if (i==p2) {
          System.out.print("$");
        } else if (i==p3) {
          System.out.print("@");
        } else {
          System.out.print(" ");
        }
      }

      p1 -= ancho-2;
      p2 -= ancho-2;
      p3 -= ancho-2;
      System.out.print("*");

      System.out.println();
    }

    for (int i=0; i<ancho; i++) {     //parte baja
      System.out.print("*");
    }
    System.out.println();
  }
}