/*
*
* Ejercicio 32: Sendero con obstaculos
*
*/

public class Ejer32 {
  public static void main(String[] args) {
    int espacios=10;
    int longitud;
    int pos=0;
    String obstaculo;

    System.out.print("Introduzca la longitud del sendero: ");
    longitud = Integer.parseInt(System.console().readLine());

    for (int i=0; i<longitud; i++) {
      for (int j=0; j<espacios; j++) {
        System.out.print(" ");
      }

      System.out.print("|");

      obstaculo = "*";
      if ((int)(Math.random()*2) == 0) {
        pos = (int)(Math.random()*4);
        if ((int)(Math.random()*2) == 0) { 
          obstaculo = "0";
        }
      } else {
        obstaculo = " ";
      }

      for (int j=0; j<4; j++) {
        if (j == pos) {
          System.out.print(obstaculo);
        } else {
          System.out.print(" ");
        }
      }

      System.out.println("|");

      espacios += (int)(Math.random()*3)-1;
    }
  }
}