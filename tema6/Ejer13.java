/*
*
* Ejercicio 13: Repetir tirada de dados hasta que sean iguales
*
*/

public class Ejer13 {
  public static void main(String[] args) {
    int d1, d2;

    do {
      d1 = (int)(Math.random()*6)+1;
      d2 = (int)(Math.random()*6)+1;

      System.out.println(d1 + " " + d2);
    } while (d1!=d2);
  }
}