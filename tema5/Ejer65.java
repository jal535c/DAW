/*
*
* Ejercicio 65: Letra A
*
*/

public class Ejer65 {
  public static void main(String[] args) {
    int altura;
    int palito;
    int h1;
    int espacios;
    int huecos;
    int base;

    System.out.print("Introduzca altura (>=3):");
    altura = Integer.parseInt(System.console().readLine());
    if (altura<3) {
      System.out.print("Error, altura incorrecta");
    } else {
      System.out.printf("Introduzca fila del palito (entre 2 y %d): ", altura-1);
      palito=Integer.parseInt(System.console().readLine());
      if (palito<2 || palito>altura-1) {
        System.out.print("Error, fila del palito incorrecta");
      } else {

        h1 = palito-1;
        espacios=altura-1;
        huecos=-1;
        for (int fila=0; fila<h1; fila++) {   //parte superior
          for (int i=0; i<espacios; i++) {
            System.out.print(" ");
          }
          espacios--;

          System.out.print("*");
          
          for (int i=0; i<huecos; i++) {
            System.out.print(" ");
          }
          huecos+=2;

          if (fila>0) {
            System.out.print("*");
          }
          System.out.println();
        }

        for (int i=0; i<espacios; i++) {      //parte central
          System.out.print(" ");
        }
        espacios--;

        base = (palito*2)-1;
        for (int i=0; i<base; i++) {
          System.out.print("*");
        }
        System.out.println();

        huecos+=2;
        for (int ind=0; ind<altura-palito; ind++) {   //parte baja
          for (int i=0; i<espacios; i++) {
            System.out.print(" ");
          }
          espacios--;

          System.out.print("*");
          
          for (int i=0; i<huecos; i++) {
            System.out.print(" ");
          }
          huecos+=2;

          System.out.println("*");
        }

      }
    }
  }
}
