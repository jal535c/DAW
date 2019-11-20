/*
*
* Ejercicio 40b: Rombo hueco mejorado
*
*/

public class Ejer40b {
  public static void main(String[] args) {
    int altura;
    int h1;
    int h2;
    int espacios;
    int huecos;

    System.out.print("Introduzca altura (impar y >=3): ");
    altura=Integer.parseInt(System.console().readLine());

    if (altura<3 || altura%2==0) {
      System.out.println("Error, deber ser impar y mayor o igual a 3.");
    } else {

      h1=(altura+1)/2;
      h2=h1-1;
      espacios=h1-1;
      huecos=-1;
      for (int fila=0; fila<h1; fila++) {
        for (int i=0; i<espacios; i++) {
          System.out.print(" ");
        }
        espacios--;
        System.out.print("*");
        for (int i=0; i<huecos; i++) {
          System.out.print(" ");
        }
        huecos+=2;
        if (fila>0) {
          System.out.print("*");
        }
        System.out.println();
      }

      espacios=1;
      huecos -= 4;
      for (int fila=0; fila<h2; fila++) {
        for (int i=0; i<espacios; i++) {
          System.out.print(" ");
        }
        espacios++;
        System.out.print("*");
        for (int i=0; i<huecos; i++) {
          System.out.print(" ");
        }
        huecos-=2;
        if (fila<h2-1) {
          System.out.print("*");
        }
        System.out.println();
      }

    }
  }
}
