/*
*
* Ejercicio 7: Quiniela
*
*/

public class Ejer07 {
  public static void main(String[] args) {
    int resul;
    int columnas = 3;
    
    for (int fila=1; fila<=15; fila++) {
      System.out.printf("%4d. |", fila);
      
      if (fila == 15) {
        columnas = 1;
      }
      
      for (int apuesta=1; apuesta<=columnas; apuesta++) {
        resul = (int)(Math.random()*3)+1;

        switch (resul) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
          default:
        }
      }
      System.out.println();
    }
  }
}