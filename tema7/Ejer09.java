/*
*
* Ejercicio 9: Indica los pares o impares de un array
*
*/

public class Ejer09 {
  public static void main(String[] args) {
    int[] arr = new int[8];

    for (int i=0; i<8; i++) {
      System.out.print("Introduzca numero entero: ");
      arr[i]=Integer.parseInt(System.console().readLine());
    }

    for (int i=0; i<8; i++) {
      if (arr[i]%2==0) {
        System.out.println(arr[i]+" par");
      } else {
        System.out.println(arr[i]+" impar");
      }
    }
  }
}