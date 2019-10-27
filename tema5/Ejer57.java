/*
*
* Ejercicio 57: Pinta triangulo hueco girado
*
*/

public class Ejer57 {
  public static void main(String[] args) {
    int n;
    int espacios;
    int huecos;

    System.out.print("Introduzca altura: ");
    n = Integer.parseInt(System.console().readLine());

    espacios = 1;   //empieza en 1, no cuento la zona de arriba
    huecos = n-3;

    for (int i=0; i<n; i++) {     //la parte de arriba
      System.out.print("*");
    }
    System.out.println();

    for (int fila=0; fila<n-1; fila++) {
      for (int i=0; i<espacios; i++) {
        System.out.print(" ");
      }
      espacios++;

      System.out.print("*");      //primer caracter siempre

      for (int i=0; i<huecos; i++) {
        System.out.print(" ");
      }
      huecos--;

      if (fila <n-2) {          //segundo caracter
        System.out.print("*");  
      }      

      System.out.println();
    }
    
  }
}