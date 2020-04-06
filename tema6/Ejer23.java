/*
*
* Ejercicio 23: Dado de poker
*
*/

public class Ejer23 {
  public static void main(String[] args) {
    int n;
    String salida="";

    for (int i=0; i<5; i++) {
      n = (int)(Math.random()*6);

      switch (n) {
        case 0:
          salida += "As ";
          break;
        case 1:
          salida += "K ";
          break;
        case 2:
          salida += "Q ";
          break;
        case 3:
          salida += "J ";
          break;
        case 4:
          salida += "7 ";
          break;
        case 5:
          salida += "8 ";
          break;
        default:
      }
    }

    System.out.println(salida);
  }
}