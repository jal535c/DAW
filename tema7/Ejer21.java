/*
*
* Ejercicio 21: Array cincuerizado
*
*/

public class Ejer21 {
  public static void main(String[] args) {
    int[] arr = new int[15];
    int[] arr2 = new int[15];
    int resto;

    System.out.println("Array original:");
    for (int i=0; i<15; i++) {
      arr[i] = (int)(Math.random()*501);
      System.out.print(arr[i]+" ");
    }
    System.out.println();

    System.out.println("Array cincuerizado:");
    for (int i=0; i<15; i++) {
      resto=arr[i]%5;
      if (resto==0) {
        arr[i]=arr[i];
      } else {
        arr[i]=arr[i]+(5-resto);
      }

      System.out.print(arr[i]+" ");
    }

    System.out.println();
  }
}