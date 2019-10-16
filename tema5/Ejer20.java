/*
*
* Ejercicio 20: Piramide hueca
*
*/

import java.util.Scanner;

public class Ejer20 {
  public static void main(String[] args) {
    int n;
    char c;
    Scanner s = new Scanner(System.in);
    int j;      //controla el incremento de los huecos
    
    System.out.print("Introduzca altura: ");
    n = s.nextInt();

    System.out.print("Introduzca caracter: ");
    c = s.next().charAt(0);

    j=0;         
    for (int fila=0; fila<n-1; fila++) {    //la ultima linea la pinto fuera del bucle
      
      for (int i=1; i<n-fila; i++) {
        System.out.print(" ");
      }
      
      System.out.printf("%c", c);     //el primer caracter siempre se pinta
      
      for (int i=1; i<j; i++) {
        System.out.printf(" ");
      }
      j+=2;
      
      if (fila>0) {                //en la primera linea no se pinta el segundo caracter
        System.out.printf("%c", c);
      }
      
      System.out.printf("\n");
    
    }
    
    for (int i=1; i<n*2; i++) {     //pinta ultima linea (la base tiene 2*n-1 caracteres)
      System.out.printf("%c", c);
    }
    
    System.out.printf("\n");
  }
}
