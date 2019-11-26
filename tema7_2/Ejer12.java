/*
*
* Ejercicio 12: Max, min, media de la otra diagonal de matriz
*
*/

public class Ejer12 {
  public static void main(String[] args) {
    int[][] arr = new int[9][9];
    int max=500;
    int min=900;
    int suma=0;
    double media;
    int[] aux = new int[9];

    for (int i=0; i<9; i++) {
      for (int j=0; j<9; j++) {
        arr[i][j] = (int)(Math.random()*401)+500;
        if (i+j==8) {
          aux[j]=arr[i][j];     //diagonal inversa, empieza en esquina inferior izquierda

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

    for (int i=0; i<9; i++) {
      for (int j=0; j<9; j++) {
        System.out.printf("%4d", arr[i][j]);
      }
      System.out.println();
    }

    System.out.println();

    for (int i=0; i<9; i++) {
      System.out.printf("%d ", aux[i]);
    }

    media=(double)suma/9;
    System.out.printf("\nMAX: %d\n", max);
    System.out.printf("MIN: %d\n", min);
    System.out.printf("Media: %.2f\n", media);
  }
}
