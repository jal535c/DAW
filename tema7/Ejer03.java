/*
*
* Ejercicio 3: Muestra array inverso
*
*/

public class Ejer03 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    
    for (int i=9; i>=0; i--) {
      System.out.print("Introduzca numero: ");
      arr[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println("Array inverso:");
    for (int i=0; i<10; i++) {
      System.out.print(arr[i]+" ");
    }
    
    System.out.println();
  }
}
