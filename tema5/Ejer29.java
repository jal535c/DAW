/*
*
* Ejercicio 29: Numeros no divisibles
*
*/

public class Ejer29 {
  public static void main(String[] args) {
    int n;
    int ndiv;

    System.out.print("Introduzca un numero: ");
    n = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca un numero (para calcular no divisibles): ");
    ndiv = Integer.parseInt(System.console().readLine());

    System.out.printf("Los numeros entre 1 y %d no divisibles por %d son: \n", n, ndiv);

    for (int i=1; i<=n; i++) {
      if (i%ndiv != 0) {
        System.out.print(i + " ");
      }
    }

    System.out.printf("\n");
  }
}