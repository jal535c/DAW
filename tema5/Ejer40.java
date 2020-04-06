/*
*
* Ejercicio 40: Rombo hueco
*
*/

public class Ejer40 {
  public static void main(String[] args) {
    int n;

    int h1;
    int h2;

    int ancho;
    int fila;
    int espacios;


    do {
      System.out.print("Introduzca altura inicial: ");
      n = Integer.parseInt(System.console().readLine());
      if ((n<3) || (n%2==0)) {
        System.out.println("Error, debe ser impar y mayor o igual a 3.");
      }
    } while ((n<3) || (n%2==0));

  
    h1=(n+1)/2;
    h2=h1-1;
    
    ancho = 0;
    for (fila=0; fila<h1; fila++) {
      
      for (int i=h1; i>fila; i--) {     //pinta los espacios
        System.out.printf(" ");
      }
      
      System.out.print("*");            //pinta el primer caracter

      for (int i=1; i<ancho; i++) {     //pinta el hueco interior
        System.out.print(" ");
      }
      ancho+=2;  
      
      if (fila>0) {                     //pinta el segundo caracter
        System.out.print("*");
      }

      System.out.printf("\n");
    }

    ///////////////////////////////////////////////////////////

    espacios = 1;
    ancho -= 4;     //le quito 2, mas los 2 de antes
    
    for (int fila2=0; fila2<h2; fila2++) {
      
      for (int i=0; i<=espacios; i++) {   //pinta espacios de la parte de abajo
        System.out.print(" ");
      }
      espacios++;
      
      System.out.print("*");

      for (int i=1; i<ancho; i++) {     //pinta hueco de la parte de abajo
        System.out.print(" ");
      }
      ancho-=2;
      
      if (fila2<h2-1) {
        System.out.print("*");
      }

      System.out.printf("\n");
    }
  
    System.out.printf("\n");
  }
}