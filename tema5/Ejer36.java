/*
*
* Ejercicio 36: Capicua de cualquier longitud
*
*/

public class Ejer36 {
  public static void main(String[] args) {
    long n, original, reves=0;
    int digit;

    System.out.print("Introduzca numero: ");
    n = Long.parseLong(System.console().readLine());
    
    original = n;
    while (n>0) {
      digit = (int)(n % 10);      //coge digito de la derecha
      reves = (reves*10)+digit;   //va creando el nuevo numero
      n = n/10;                   //recorta el numero original
    }

    if (original == reves) {
      System.out.printf("El %d es capicua\n", original);  
    } else {
      System.out.printf("El %d no es capicua\n", original);  
    }
  }
}
