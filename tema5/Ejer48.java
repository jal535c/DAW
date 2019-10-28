/*
*
* Ejercicio 48: Digitos que aparecen y no aparecen en el numero
*
*/

public class Ejer48 {
  public static void main(String[] args) {
    int n, aux;
    boolean encontrado;

    System.out.print("Introduce numero: ");
    n = Integer.parseInt(System.console().readLine());

    System.out.print("Digitos que aparecen en el numero: ");

    for (int i=0; i<10; i++) {
      encontrado = false;
      aux = n;
      while (aux>0) {
        if (aux%10 == i) {
          encontrado = true;
        }
        aux /= 10;
      }
      if (encontrado) {
        System.out.print(i + " ");
      }
    }

    System.out.printf("\nDigitos que no aparecen: ");

    for (int i=0; i<10; i++) {
      encontrado = false;
      aux = n;
      while (aux>0) {
        if (aux%10 == i) {
          encontrado = true;
        }
        aux /= 10;
      }
      if (!encontrado) {
        System.out.print(i + " ");
      }
    }

    System.out.printf("\n");
  }
}