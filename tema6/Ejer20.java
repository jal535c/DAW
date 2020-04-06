/*
*
* Ejercicio 20: Cuba de agua
*
*/

public class Ejer20 {
  public static void main (String[] args) {
    int capacidad;
    int agua;

    System.out.print("Indique la capacidad de la cuba: ");
    capacidad = Integer.parseInt(System.console().readLine());

    agua = (int)(Math.random()*(capacidad+1));

    for (int i=0; i<capacidad; i++) {
      if (i>=agua) {
        System.out.print("*====*");
      } else {
        System.out.print("*    *");
      }

      System.out.println();
    }

    System.out.print("******");
    System.out.println("\nCapacidad: " +capacidad+ ", Litros: "+ (capacidad-agua));
  }
}