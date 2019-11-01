/*
*
* Ejercicio 22: Pintar serpiente de forma aleatoria
*
*/

public class Ejer22 {
  public static void main(String[] args) {
    int n;
    int espacio=12;
    int pos;

    System.out.print("Introduzca longitud de serpiente: ");
    n = Integer.parseInt(System.console().readLine());

    for (int i=0; i<n; i++) {
      for (int j=0; j<espacio; j++) {
        System.out.print(" ");
      }

      if (i==0) {
        System.out.print("@");  
      } else {
        System.out.print("*");  
      }
          
      pos = (int)(Math.random()*3);

      switch (pos) {
        case 0:
          espacio--;
          break;
        //case 1:
        //  break;
        case 2:
          espacio++;
          break;
        default:
      }

      System.out.println();
    }
  }
}