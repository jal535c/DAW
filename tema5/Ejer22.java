/*
*
* Ejercicio 22: Primos del 2 al 100
*
*/

public class Ejer22 {
  public static void main(String[] args) {
    boolean primo;

    System.out.println("Numeros primos del 2 al 100:");

    for (int n=2; n<=100; n++) {
      
      primo = true;
      for (int i=2; i<n; i++) {
        if (n%i == 0) {
          primo = false;
        }
      }   

      if (primo == true) {
        System.out.printf("%d ", n);
      }
         
    }

    System.out.println();
  }
}
