/*
*
* Ejercicio 16: Numero primo
*
*/

public class Ejer16 {
  public static void main(String[] args) {
    int n;

    System.out.print("Introduzca un numero: ");
    n = Integer.parseInt(System.console().readLine());

    for (int i=n-1; i>1; i--) {
      if (n%i == 0) {
        System.out.println("El numero no es primo");
        System.exit(0);
      }
    }

    System.out.println("El numero es primo");
  }
}