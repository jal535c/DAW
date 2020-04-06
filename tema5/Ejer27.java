/*
*
* Ejercicio 27: Multiplos de 3 mostrando el total y la suma
*
*/

public class Ejer27 {
  public static void main(String[] args) {
    int n;
    int contador=0;
    int suma=0;

    System.out.print("Introduzca un numero: ");
    n = Integer.parseInt(System.console().readLine());

    System.out.printf("Los multiplos de 3 desde 1 hasta %d son: \n", n);

    for (int i=1; i<=n; i++) {
      if (i%3 == 0) {
        System.out.print(i + " ");
        contador++;
        suma += i;
      }
    }
    System.out.printf("\n");
    System.out.println("En total hay: " + contador);
    System.out.println("Los multiplos suman: " + suma);
  }
}