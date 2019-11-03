/*
*
* Ejercicio 25: Pinta numeros primos y multiplos de cinco
*
*/

public class Ejer25 {
  public static void main(String[] args) {
    int n;
    boolean esPrimo;

    for (int i=0; i<100; i++) {
      n = (int)(Math.random()*191)+10;

      esPrimo=true;
      for (int j=2; j<n; j++) {
        if (n%j==0) {
          esPrimo=false;
        }
      }

      if (esPrimo) {
        System.out.print("#"+n+"# ");
      } else if (n%5==0) {
        System.out.print("["+n+"] ");
      } else {
        System.out.print(n+" ");
      }
    }

    System.out.println();
  }
}