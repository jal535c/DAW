/*
*
* Ejercicio 39: Calcula el factorial de varios numeros
*
*/

public class Ejer39 {
  public static void main(String[] args) {
    int num; 
    int aux;
    int fact;
    
    System.out.print("Introduzca un numero entero: ");
    num = Integer.parseInt(System.console().readLine());

    for (int i=1; i<=num; i++) {
      aux = i;
      fact=1;
      while (aux >= 1) {
        fact *= aux;
        aux--;
      }
      System.out.printf("%d! = %d\n", i, fact);
    }
  }
}