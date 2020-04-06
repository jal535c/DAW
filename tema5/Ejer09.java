/*
*
* Ejercicio 9: Calcula el numero de digitos de un numero introducido por teclado
*
*/

public class Ejer09 {
  public static void main(String[] args) {
    int n;
    int i=0;

    System.out.print("Introduza un numero: ");
    n = Integer.parseInt(System.console().readLine());

    while (n>0) {
      n = n/10;
      i++;
    }

    System.out.printf("El numero de digitos es: %d\n", i);
  }
}