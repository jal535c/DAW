/*
*
* Ejercicio 26: Tableta de turron
*
*/

public class Ejer26 {
  public static void main(String[] args) {
    int ancho,alto;
    int mordisco;
    int pos;
    boolean borde;

    System.out.print("Introduzca la anchura de la tableta: ");
    ancho = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca la altura de la tableta: ");
    alto = Integer.parseInt(System.console().readLine());
    
    mordisco = (int)(Math.random() * (ancho * 2 + (alto - 2) * 2));
    
    pos = 0;
    for (int i = 0; i<alto; i++) {
      for (int j = 0; j<ancho; j++) {
        borde = (i == 0) || (i == alto-1) || (j == 0) || (j == ancho-1);
        
        if ((pos == mordisco) && borde==true) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
        
        if (borde) {
          pos++;
        }
      }
      System.out.println();
    }
  }
}