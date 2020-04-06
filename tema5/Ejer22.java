/*
*
* Ejercicio 22: Primos del 2 al 100
*
*/

public class Ejer22 {
  public static void main(String[] args) {
    boolean esPrimo;

    System.out.println("Numeros primos del 2 al 100:");

    for (int n=2; n<=100; n++) {
      
      esPrimo = true;
      for (int i=2; i<n && esPrimo==true; i++) {
        if (n%i == 0) {
          esPrimo = false;
        }
      }   

      if (esPrimo == true) {
        System.out.printf("%d ", n);
      }
         
    }

    System.out.println();
  }
}
