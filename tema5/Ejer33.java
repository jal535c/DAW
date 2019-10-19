/*
*
* Ejercicio 33: Pintar letra U
*
*/

public class Ejer33 {
  public static void main(String[] args) {
    int altura;

    System.out.print("Introduzca altura de la letra U: ");
    altura = Integer.parseInt(System.console().readLine());

    for (int fila=0; fila<altura-1; fila++) {
      System.out.print("*");
      for (int i=0; i<altura-2; i++) {
        System.out.print(" ");
      }
      System.out.print("*");

      System.out.println();
    }
    
    System.out.print(" ");
    for (int j=0; j<altura-2; j++) {
      System.out.print("*");
    }

    System.out.println();
  }
}
