/*
*
* Ejercicio 6: Rotar un array a la derecha
*
*/

public class Ejer06 {
  public static void main(String[] args) {
    int[] arr = new int[15];
    int aux;

    for (int i=0; i<15; i++) {
      System.out.print("Introduzca numero: ");
      arr[i] = Integer.parseInt(System.console().readLine());
    }

    aux = arr[14];
    for (int i=13; i>=0; i--) {
      arr[i+1]=arr[i];
    }
    arr[0]=aux;

    for (int i=0; i<15; i++) {
      System.out.print(arr[i]+" ");
    }

    System.out.println();
  }
}
