/*
* Ejercicio 1: Muestra array bidimensional con distintos elementos 
*/

public class Ejer01 {
  public static void main(String[] args) {
    int[][] num = new int[3][6]; // array de 3 filas por 6 columnas

    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 7;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;

    int fila;
    int columna;

    System.out.print("       ");
    for(columna = 0; columna < 6; columna++) {
      System.out.print("   Columna " + columna);
    }

    for(fila = 0; fila < 3; fila++) {
      System.out.print("\nFila " + fila);
  
      for(columna = 0; columna < 6; columna++) {
        System.out.printf("%9d   ", num[fila][columna]);
        
      }
    }
    System.out.println();
  }
}
