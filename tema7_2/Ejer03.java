/*
*
* Ejercicio 3: Sumas parciales de filas y columnas
*
*/

public class Ejer03 {
  public static void main(String[] args) {
    int[][] arr = new int[4][5];
    int suma=0;
    int total=0;

    for (int fila=0; fila<4; fila++) {            //rellena array
      for (int columna=0; columna<5; columna++) {
        arr[fila][columna]=(int)(Math.random()*900)+100;
      }
    }

    for (int fila=0; fila<4; fila++) {              //pinta filas y suma de ellas
      for (int columna=0; columna<5; columna++) {
        suma+=arr[fila][columna];
        System.out.printf("%5d ", arr[fila][columna]);
      }
      System.out.printf("|%5d \n", suma);
      suma=0;
    }

    for (int i=0; i<5; i++) {       //pinta linea separadora
      System.out.print("------");  
    }
    System.out.println("|-----");

    for (int columna=0; columna<5; columna++) {     //pinta suma de columnas y total
      for (int fila=0; fila<4; fila++) {
        suma+=arr[fila][columna];        
      }
      System.out.printf("%5d ", suma);
      total+=suma;
      suma=0;
    }

    System.out.printf("|%5d \n", total);
  }
}