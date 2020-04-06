/*
*
* Ejercicio 42: Numeros primos
*
*/

public class Ejer42 {
  public static void main(String[] args) {
    int n;
    boolean esPrimo;

    System.out.print("Introduzca un numero: ");
    n = Integer.parseInt(System.console().readLine());

    for (int i=n; i<n+5; i++) {

      esPrimo =true;
      for (int j=2; j<i; j++) {
        if (i%j == 0) {
          esPrimo = false;
        }
      }  

      if (esPrimo == true) {
        System.out.println(i + " es primo");
      } else {
        System.out.println(i + " no es primo");    
      }
      
    }
  }
}