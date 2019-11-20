/*
*
* Ejercicio 7b: Caja fuerte mejorado
*
*/

public class Ejer07b {
  public static void main(String[] args) {
    final int clave = 1234;   //final=cte
    int n;
    int cont=4;

    while (cont>0) {
      System.out.print("Introduce clave: ");
      n = Integer.parseInt(System.console().readLine());

      if (n==clave) {
        System.out.printf("La caja fuerte se ha abierto satisfactoriamente\n");
        cont=0;
      } else {
        System.out.printf("Lo siento, esa no es la combinacion\n");
      }
      cont--;
    }
  }
}