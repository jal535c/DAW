/*
*
* Ejercicio 16b: Numero primo mejorado
*
*/

public class Ejer16b {
  public static void main(String[] args) {
    int n;
    boolean esPrimo;

    System.out.print("Introduzca un numero: ");
    n = Integer.parseInt(System.console().readLine());

    esPrimo=true;
    for (int i=n-1; i>1 && esPrimo==true; i--) {
      if (n%i == 0) {
        System.out.println("El numero no es primo");
        esPrimo=false;
      }
    }

    if (esPrimo) {
      System.out.println("El numero es primo");
    }
  }
}