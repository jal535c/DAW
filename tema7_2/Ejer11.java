/*
*
* Ejercicio 11: Muestra diagonal de una matriz. Calcula max, min y media de ella
*
*/

public class Ejer11 {
  public static void main(String[] args) {
    int[][] arr = new int[10][10];
    int max=200;
    int min=300;
    int suma=0;
    double media;
    int[] aux = new int[10];

    for (int i=0; i<10; i++) {
      for (int j=0; j<10; j++) {
        arr[i][j] = (int)(Math.random()*101)+200;
        if (i==j) {
          aux[i]=arr[i][j];     //diagonal

          suma+=aux[i];         //suma acumulada
          
          if (aux[i]>max) {     //maximo
            max=aux[i];
          }
          if (aux[i]<min) {     //minimo
            min=aux[i];
          }
        }
      }
    } 

    for (int i=0; i<10; i++) {
      for (int j=0; j<10; j++) {
        System.out.printf("%4d", arr[i][j]);
      }
      System.out.println();
    }

    System.out.println();

    for (int i=0; i<10; i++) {
      System.out.printf("%d ", aux[i]);
    }

    media=(double)suma/10;
    System.out.printf("\nMAX: %d\n", max);
    System.out.printf("MIN: %d\n", min);
    System.out.printf("Media: %.2f\n", media);
  }
}