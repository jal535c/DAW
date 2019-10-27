/*
*
* Ejercicio 54: Triangulo hueco
*
*/

public class Ejer54 {
  public static void main(String[] args) {
    int n;
    int huecos;

    System.out.print("Introduzca altura: ");
    n = Integer.parseInt(System.console().readLine());

    huecos = n-3;

    for (int i=0; i<n; i++) {     //parte superior
      System.out.print("*");
    }
    System.out.println();

    for (int filas=0; filas<n-1; filas++) {
      System.out.print("*");      //primer caracter

      for (int i=0; i<huecos; i++) {    //huecos
        System.out.print(" ");
      }
      huecos--;
      
      if (filas<n-2) {            //segundo caracter
        System.out.print("*");
      }

      System.out.println();
    }
  }
}