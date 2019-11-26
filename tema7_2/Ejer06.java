/*
*
* Ejercicio 6: Calcula maximo y minimo de una matriz, sin repetir los numeros de esta
*
*/

public class Ejer06 {
  public static void main(String[] args) {
    int[][] arr = new int[6][10];
    int maxX=0, maxY=0;
    int minX=0, minY=0;
    int max=0;
    int min=1000;
    int num;
    boolean repe;

    for (int i=0; i<6; i++) {
      for (int j=0; j<10; j++) {
        
        do {                              //repite random mientras sea repetido
          repe=false;             
          num = (int)(Math.random()*1001);
          for (int z=i; z>0; z--) {       //recorre lo que tenia para saber si es repetido
            for (int k=j; k>0; k--) {
              if (num==arr[z][k]) {
                repe=true;
              }
            }
          }
        } while (repe==true);
        
        arr[i][j]=num;
        
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

    for (int i=0; i<6; i++) {         //muestra la matriz
      for (int j=0; j<10; j++) {
        System.out.printf("%4d", arr[i][j]);
      }
      System.out.println();
    }

    System.out.printf("\nPosicion MAX: (%d,%d)\n", maxX, maxY);
    System.out.printf("Posicion MIN: (%d,%d)\n", minX, minY);
  }
}