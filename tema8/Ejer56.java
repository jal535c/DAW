/*
*
* Ejercicio 56: Corteza exterior de una matriz 
*
*/

public class Ejer56 {
  public static void main(String[] args) {
    int[][] n = { 
      {45,92,14,20,25,78},
      {35,72,24,45,42,60},
      {32,42,64,23,41,39},
      {98,45,94,11,18,48}
    };

    int[] arr;
 
    int x = 2*n[0].length;
    int y = (n.length -2)*2;
    int total = x+y;

    arr = corteza(n);

    System.out.println("Matriz:");
    for (int j=0; j<4; j++) {
      for (int i=0; i<6; i++) {
        System.out.print(n[j][i]+" ");
      }
      System.out.println();
    }

    System.out.println("\nCorteza:");
    for (int i=0; i<total; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }


  public static int[] corteza(int[][] n) {
    int x = 2*n[0].length;
    int y = (n.length -2)*2;
    int total = x+y;

    int[] arr = new int[total];

    int ancho = n[0].length;
    int alto = n.length;

    int i,j;

    for (i=0; i<ancho; i++) {
      arr[i]= n[0][i];
    }
    
    for (j=1; j<alto; j++) {
      arr[i]= n[j][ancho-1];
      i++;
    }

    for (j=ancho-2; j>=0; j--) {
      arr[i]= n[alto-1][j];
      i++;
    }

    for (j=alto-2; j>0; j--) {
      arr[i]= n[j][0];
      i++; 
    }

    return arr;
  }
}