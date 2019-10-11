/*
*
* Ejercicio 17: Suma los siguientes 100 numeros
*
*/

public class Ejer17 {
  public static void main(String[] args) {
    int n;
    int suma=0;

    System.out.print("Introduzca numero positivo: ");
    n = Integer.parseInt(System.console().readLine());

    if (n>=0) {
      for (int i=n+1; i<=n+100; i++) {
        suma += i;
      }
      System.out.printf("Los 100 numeros siguientes de %d suman: %d\n", n, suma);
    } else {
      System.out.println("Error, ha introducido un numero negativo");
    }
  }
}