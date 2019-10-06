/*
*
* Ejercicio 5: Ecuacion de primer grado
*
*/

public class Ejer05 {
  public static void main(String[] args) {
    float a, b, x;

    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax+b=0");
    System.out.print("Introduzca el valor de a: ");
    a = Float.parseFloat(System.console().readLine());
    System.out.print("Introduzca el valor de b: ");
    b = Float.parseFloat(System.console().readLine());

    if (a==0) {
      System.out.println("Esta ecuacion no tiene solucion real.");
    } else {
      x = -b/a;
      System.out.println("x = " + x);
    }
  }
}