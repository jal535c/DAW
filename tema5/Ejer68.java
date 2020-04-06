/*
*
* Ejercicio 68: Disloque (suma 1 a los pares, resta 1 a los impares)
*
*/

public class Ejer68 {
  public static void main(String[] args) {
    long n;
    int digit;
    long resul;
    String salida="";

    System.out.print("Introduzca un numero: ");
    n=Long.parseLong(System.console().readLine());

    while (n>0) {
      digit = (int)(n%10);
      if (digit%2==0) {
        digit++;
      } else {
        digit--;
      }
      salida = digit+salida;
      n = n/10;
    }

    resul=Long.parseLong(salida);
    System.out.println("Numero dislocado: "+resul);
  }
}