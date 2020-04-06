/*
*
* Ejercicio 38: Reloj de arena
*
*/

import java.util.Scanner;

public class Ejer38 {
  public static void main(String[] args) {
    int n;
    int ancho;
    char c;
    
    int h1;
    int h2;
    int espacios;
    
    Scanner s = new Scanner(System.in);
    int fila;

    do {
      System.out.print("Introduzca altura inicial: ");
      n = s.nextInt();
      if ((n<3) || (n%2==0)) {
        System.out.println("Error, debe ser impar y mayor o igual a 3.");
      }
    } while ((n<3) || (n%2==0));

    
    h1=(n+1)/2;
    h2 = h1-1;

    espacios =0;
    
    ancho = n;            
    for (fila=0; fila<h1; fila++) {      //piramide invertida de arriba
      
      for (int i=0; i<espacios; i++) {
        System.out.printf(" ");
      }
      espacios++;

      for (int i=ancho; i>0; i--) {
        System.out.print("*");
      }
      ancho-=2;  
      
      System.out.printf("\n");
    }

    espacios -= 2;    //la mia y la anterior k se incrementó (linea 45)
    ancho = 3;        //la primera fila de la segunda piramide siempre tiene 3 de ancho
    for (int fila2=0; fila2<h2; fila2++) {    //piramide chata (1 fila menos) de abajo
      
      for (int i=0; i<espacios; i++) {
        System.out.print(" ");
      }
      espacios--;

      for (int i=0; i<ancho; i++) {
        System.out.print("*");
      }
      ancho+=2;
      
      System.out.printf("\n");
    
    }
   
    System.out.printf("\n");
  }
}
