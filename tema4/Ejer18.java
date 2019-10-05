/*
*
* Ejercicio 18: Primera cifra de un numero entero de hasta 5 cifras
*
*/

public class Ejer18 {
  public static void main(String[] args) {
    int n, primera=0;

    System.out.print("Introduzca numero entero (max 5 cifras): ");
    n = Integer.parseInt(System.console().readLine());

    if (n<10) {
      primera = n;
    } else if (n>=10 && n<100) {
      primera = n/10;
    } else if (n>=100 && n<1000) {
      primera = n/100;
    } else if (n>=1000 && n<10000) {
      primera = n/1000;
    } else if (n>=10000 && n<100000) {
      primera = n/10000;
    }
  
    System.out.println("La primera cifra es: " + primera);
  }
}
