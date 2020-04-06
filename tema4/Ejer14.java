/*
*
* Ejercicio 14: Numero par y/o divisible entre 5
*
*/

public class Ejer14 {
  public static void main(String[] args) {
    int n;

    System.out.print("Introduzca un numero: ");
    n = Integer.parseInt(System.console().readLine());

    if (n%2 == 0) {
      System.out.println("El numero es par");
    } else {
      System.out.println("El numero es impar");
    }

    if (n%5 == 0) {
      System.out.println("El numero es divisible entre 5");
    } else {
      System.out.println("El numero no es divisible entre 5");
    }
  }
}
