/*
*
* Ejercicio 7: Caja fuerte
*
*/

public class Ejer07 {
  public static void main(String[] args) {
    int clave = 1234;
    int n;

    for (int i=0; i<4; i++) {
      System.out.print("Introduce clave: ");
      n = Integer.parseInt(System.console().readLine());

      if (n==clave) {
        System.out.printf("La caja fuerte se ha abierto satisfactoriamente\n");
        break;
      } else {
        System.out.printf("Lo siento, esa no es la combinacion\n");
      }
    }
  }
}