/*
*
* Ejercicio 60: Calcetines
*
*/

public class Ejer60 {
  public static void main(String[] args) {
    int altura;

    System.out.print("Introduzca altura (>=4): ");
    altura=Integer.parseInt(System.console().readLine());

    for (int i=0; i<altura-2; i++) {
      System.out.print("***");
      System.out.print("     ");
      System.out.print("***");
      System.out.println();
    }

    for (int i=0; i<2; i++) {
      System.out.print("******");
      System.out.print("  ");
      System.out.print("******");
      System.out.println(); 
    }
  }
}