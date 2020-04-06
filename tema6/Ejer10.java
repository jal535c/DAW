/*
*
* Ejercicio 10: Lineas de caracteres
*
*/

public class Ejer10 {
  public static void main(String[] args) {
    int longitud;
    int car;
    String salida="";

    for (int i=0; i<10; i++) {
      longitud = (int)(Math.random()*40)+1;
      
      car = (int)(Math.random()*6);

      switch (car) {
        case 0:
          salida = "*";
          break;
        case 1:
          salida = "-";
          break;
        case 2:
          salida = "=";
          break;
        case 3:
          salida = ".";
          break;
        case 4:
          salida = "|";
          break;
        case 5:
          salida = "@";
          break;
        default:
      }
      
      for (int j=0; j<longitud; j++) {
        System.out.print(salida);
      }

      System.out.println();
    }
  }
}