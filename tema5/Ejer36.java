/*
*
* Ejercicio 36: Capicua de cualquier longitud
*
*/

public class Ejer36 {
  public static void main(String[] args) {
    long n, original, digit, reves=0;

    System.out.print("Introduzca numero: ");
    n = Long.parseLong(System.console().readLine());
    original = n;
 
    while (n>0) {
      digit = n % 10;               
      reves = digit + (reves*10);   
      n = n/10;                     
    }

    if (original == reves) {
      System.out.printf("El %d es capicua\n", original);  
    } else {
      System.out.printf("El %d no es capicua\n", original);  
    }
  }
}