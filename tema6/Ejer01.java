/*
*
* Ejercicio 1: Tirada de 3 dados, y suma
*
*/

public class Ejer01 {
  public static void main(String[] args) {
    int dado;
    int suma=0;

    for (int i=0; i<3; i++) {
      dado = (int)(Math.random()*6)+1;
      System.out.printf("Dado %d: %d\n", i+1, dado);
      suma += dado;
    }
    
    System.out.printf("Suma  : %d\n", suma);
  }
}