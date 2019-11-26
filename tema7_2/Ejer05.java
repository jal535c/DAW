/*
*
* Ejercicio 5: Calcula maximo y minimo de una matriz
*
*/

public class Ejer05 {
  public static void main(String[] args) {
    int[][] arr = new int[6][10];
    int maxX=0, maxY=0;
    int minX=0, minY=0;
    int max=0;
    int min=1000;

    for (int i=0; i<6; i++) {
      for (int j=0; j<10; j++) {
        arr[i][j] = (int)(Math.random()*1001);
        if (arr[i][j]>max) {
          maxX=i;
          maxY=j;
          max=arr[i][j];
        }
        if (arr[i][j]<min) {
          minX=i;
          minY=j;
          min=arr[i][j];
        }
      }
    } 

    for (int i=0; i<6; i++) {
      for (int j=0; j<10; j++) {
        System.out.printf("%4d", arr[i][j]);
      }
      System.out.println();
    }

    System.out.printf("Posicion MAX: (%d,%d)\n", maxX, maxY);
    System.out.printf("Posicion MIN: (%d,%d)\n", minX, minY);
  }
}