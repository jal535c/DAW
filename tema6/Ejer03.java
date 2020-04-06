/*
*
* Ejercicio 3: Baraja española
*
*/

public class Ejer03 {
  public static void main(String[] args) {
    int paloNum;
    int cartaNum;
    String palo="";
    String carta="";

    paloNum = (int)(Math.random()*4);
    cartaNum = (int)(Math.random()*10)+1;

    switch (paloNum) {
      case 0:
        palo = "oros";
        break;
      case 1:
        palo = "copas";
        break;
      case 2:
        palo = "espadas";
        break;
      case 3:
        palo = "bastos";
        break;
      default:
    }

    switch (cartaNum) {
      case 1:
        carta = "As";
        break;      
      case 8:
        carta = "Sota";
        break;
      case 9:
        carta = "Caballo";
        break;
      case 10:
        carta = "Rey";
        break;
      default:
        carta = "" + cartaNum;
    }

    System.out.println(carta +" de "+ palo);
  }
}
