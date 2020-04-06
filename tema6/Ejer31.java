/*
*
* Ejercicio 31: Juego de dados Craps
*
*/

public class Ejer31 {
  public static void main(String[] args) {
    int d1;
    int d2;
    boolean continua=false;
    int suma;
    int n;
    double dinero;

    System.out.print("Introduzca dinero: ");
    dinero = Integer.parseInt(System.console().readLine());

    d1 = (int)(1+Math.random()*6);
    d2 = (int)(1+Math.random()*6);

    suma=d1+d2;
    System.out.println("tirada: " + suma);

    switch (suma) {
      case 7:
      case 11:
        System.out.printf("Has ganado %.2f €\n", dinero*2);
        break;
      case 2:
      case 3:
      case 12:
        System.out.println("Has perdido todo el dinero");
        break;
      default:
        continua=true;
    }

    if (continua) {
      do {
        d1 = (int)(1+Math.random()*6);
        d2 = (int)(1+Math.random()*6);

        n=d1+d2;
        System.out.println("tirada: " + n);
        
        if (n==suma) {
          System.out.printf("Has ganado %.2f €\n", dinero*2);
        } else if (n==7) {
          System.out.println("Has perdido todo el dinero");
        } else {
          System.out.println("continua el juego");
        }

      } while (n!=suma && n!=7);
    }

  }
}