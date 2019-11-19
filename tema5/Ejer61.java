/*
*
* Ejercicio 61: Pinta la letra V
*
*/

public class Ejer61 {
  public static void main(String[] args) {
    int altura;
    int hueco;
    int espacio;

    System.out.print("Introduzca la altura (>=3): ");
    altura = Integer.parseInt(System.console().readLine());

    if (altura<3) {
      System.out.print("La altura debe ser mayor o igual a 3.");
    } else {
      hueco=(altura*2)-2;
      espacio=0;
      for (int fila=0; fila<altura; fila++) {
        for (int i=0; i<espacio; i++) {
          System.out.print(" ");
        }
        espacio++;
  
        System.out.print("***");
  
        for (int i=0; i<hueco; i++) {
          System.out.print(" ");
        }
        hueco-=2;
  
        System.out.print("***");
  
        System.out.println();
      }
    }
  }
}