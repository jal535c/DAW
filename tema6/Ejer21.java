/*
*
* Ejercicio 21: Monedas
*
*/

public class Ejer21 {
  public static void main(String[] args) {
    int ladoNum;
    int monedaNum;
    String moneda="";
    String lado="";

    for (int i=0; i<5; i++) {
      monedaNum = (int)(Math.random()*8);
      ladoNum = (int)(Math.random()*2);

      switch (monedaNum) {
        case 0:
          moneda = "1 centimo";
          break;
        case 1:
          moneda = "2 centimos";
          break;
        case 2:
          moneda = "5 centimos";
          break;
        case 3:
          moneda = "10 centimos";
          break;
        case 4:
          moneda = "20 centimos";
          break;
        case 5:
          moneda = "50 centimos";
          break;
        case 6:
          moneda = "1 euro";
          break;
        case 7:
          moneda = "2 euros";
          break;
        default:
      }

      switch (ladoNum) {
        case 0:
          lado = " - cara";
          break;
        case 1:
          lado = " - cruz";
          break;
        default:
      }

      System.out.println(moneda + lado);
    }
  }
}