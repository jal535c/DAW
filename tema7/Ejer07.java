/*
*
* Ejercicio 7: Sustituir valores en un array
*
*/

public class Ejer07 {
  public static void main(String[] args) {
    int[] arr = new int[100];
    int n1, n2;

    for (int i=0; i<100; i++) {
      arr[i] = (int)(Math.random()*21);
    }

    for (int i=0; i<100; i++) {
      System.out.print(arr[i]+" ");
    }

    System.out.print("\nIntroduzca un numero del array: ");
    n1=Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el sustituto: ");
    n2=Integer.parseInt(System.console().readLine());

    for (int i=0; i<100; i++) {
      if (arr[i]==n1) {
        arr[i]=n2;
      }
    }

    for (int i=0; i<100; i++) {
      if (arr[i]==n2) {
        System.out.print("\""+arr[i] + "\""+" ");
      } else { 
        System.out.print(arr[i] + " ");
      }
    }

    System.out.println();
  }
}



