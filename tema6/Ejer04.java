/*
*
* Ejercicio 4: Genera 20 numero aleatorios entre 0 y 10
*
*/

public class Ejer04 {
  public static void main(String[] args) {
    int n;

    for (int i=0; i<20; i++) {
      n = (int)(Math.random()*11);
      System.out.print(n + " ");
    }

    System.out.println();
  }
}