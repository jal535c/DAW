/*
*
* Ejercicio 5: Indicar el maximo y minimo de un array
*
*/

public class Ejer05 {
  public static void main(String[] args) {
    int min;
    int max;
    int[] arr = new int[10];

    for (int i=0; i<10; i++) {
      System.out.print("Introduzca numero: ");
      arr[i] = Integer.parseInt(System.console().readLine());
    }

    min=max=arr[0];
    for (int i=0; i<10; i++) {
      if (arr[i]>max) {
        max=arr[i];
      }
      if (arr[i]<min) {
        min=arr[i];
      }
    }

    for (int i=0; i<10; i++) {
      System.out.print(arr[i]);

      if (arr[i]==min) {
        System.out.print(" minimo");
      }      
      if (arr[i]==max) {
        System.out.print(" maximo");
      }
      
      System.out.println();
    }
  }
}