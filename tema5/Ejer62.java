/*
*
* Ejercicio 62: Numero afortunado
*
*/

public class Ejer62 {
  public static void main(String[] args) {
    int n;
    int aux;
    int resto;
    int suerte=0;
    int nosuerte=0;

    System.out.print("Introduzca numero: ");
    n=Integer.parseInt(System.console().readLine());

    aux=n;
    while (aux>0) {
      resto=aux%10;

      switch (resto) {
        case 3:
        case 7:
        case 8:
        case 9:
          suerte++;
          break;
        default:
          nosuerte++;
      }

      aux=aux/10;
    }

    if (suerte>nosuerte) {
      System.out.printf("El %d es un numero afortunado\n", n);
    } else {
      System.out.printf("El %d NO es un numero afortunado\n", n);
    }
  }
}