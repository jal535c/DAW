/*
*
* Ejercicio 16: Resaltar multiplos de 5 o 7
*
*/

public class Ejer16 {
  public static void main(String[] args) {
    int[] arr = new int[20];
    int n;
    int opcion;

    for (int i=0; i<20; i++) {
      arr[i]=(int)(Math.random()*401);
      System.out.print(arr[i]+" ");
    }

    System.out.print("\n1-resaltar multiplos de 5, 2-resaltar multiplos de 7: ");
    n=Integer.parseInt(System.console().readLine());

    if (n==1) {
      opcion=5;
    } else {
      opcion=7;
    }
    
    for (int i=0; i<20; i++) {
      if (arr[i]%opcion==0) {
        System.out.print("["+arr[i]+"] ");
      } else {
        System.out.print(arr[i]+" ");  
      }
    }
  
    System.out.println();
  }
}