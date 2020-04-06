/*
*
* Ejercicio 69: Piramide maya
*
*/

public class Ejer69 {
  public static void main(String[] args) {
    int n;
    
    int espacio;
    int ancho =1;
    int ancho2=1;
    
    System.out.print("Introduzca la altura de la piramide (>=3): ");
    n = Integer.parseInt(System.console().readLine());

    espacio=n-1;

    for (int fila=0; fila<n; fila++) {
      
      for (int i=0; i<espacio; i++) {    //primer triangulo
        System.out.print(" ");
      }
      espacio--;
      for (int j=0; j<ancho; j++) {
        System.out.print("*");
      }
      ancho++;

      /////////////////////////////////

      if (fila%2==0) {                  //parte central
        for (int i=0; i<4; i++) {
          System.out.print("*");
        }
      } else {
        for (int i=0; i<4; i++) {
          System.out.print(" ");
        }
      }
     
      ////////////////////////////////////
      
      for (int z=0; z<ancho2; z++) {    //segundo triangulo
        System.out.print("*");
      }
      ancho2++;

      System.out.println();
    }
  }
}