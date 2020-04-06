/*
*
* Ejercicio 15: Potencias
*
*/

public class Ejer15 {
  public static void main(String[] args) {
    int base;
    int exp;
    int resul;

    System.out.print("Introduzca la base: ");
    base = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el exponente: ");
    exp = Integer.parseInt(System.console().readLine());

    resul = base;
    System.out.printf("Potencias: %d ", resul);
    for (int i=1; i<exp; i++) {
      resul = resul*base;
      System.out.printf("%d ", resul);
    }

    System.out.println();
  }
}