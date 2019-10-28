/*
*
* Ejercicio 46: Rectangulo hueco
*
*/

public class Ejer46 {
  public static void main(String[] args) {
    int ancho;
    int alto;

    System.out.print("Introduzca ancho de rectangulo: ");
    ancho = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca alto de rectangulo: ");
    alto = Integer.parseInt(System.console().readLine());

    if ((ancho<2) || (alto<2)) {
      System.out.print("Error, valor minimo es 2");
    } else {

      for (int i=0; i<ancho; i++) {     //parte de arriba
        System.out.print("*");
      }
      System.out.println();

      for (int i=0; i<alto-2; i++) {    //parte central 
        System.out.print("*");

        for (int j=0; j<ancho-2; j++) {
          System.out.print(" "); 
        }
      
        System.out.print("*");

        System.out.println();
      }

      for (int i=0; i<ancho; i++) {     //parte inferior
        System.out.print("*"); 
      }

      System.out.println();
    }
    
  }
}