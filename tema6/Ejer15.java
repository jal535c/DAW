/*
*
* Ejercicio 15: Generador de melodia
*
*/

public class Ejer15 {
  public static void main(String[] args) {
    int compas;
    int nota;
    String salida="";

    compas = (int)(Math.random()*7)+1;
    compas *= 4;
    
    for (int i=1; i<=compas; i++) {
      nota = (int)(Math.random()*7);

      switch (nota) {
        case 0:
          salida+="do ";
          break;
        case 1:
          salida+="re ";
          break;
        case 2:
          salida+="mi ";
          break;
        case 3:
          salida+="fa ";
          break;
        case 4:
          salida+="sol ";
          break;
        case 5:
          salida+="la ";
          break;
        case 6:
          salida+="si ";
          break;
        default:
      }

      if (i%4==0) {
        salida+="| ";
      }

    }

    salida+="|";

    System.out.println(salida);
  }
}
