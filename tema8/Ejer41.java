/*
*
* Ejercicio 41: Triangulo girado
*
*/

public class Ejer41 {
  public static void main(String[] args) {
    int altura;

    System.out.print("Introduzca altura de la figura: ");
    altura=Integer.parseInt(System.console().readLine());

    for (int i=altura; i>0; i--) {
      linea('*', i);
    }
  }

  public static void linea(char caracter, int repeticiones) {
    for (int i=0; i<repeticiones; i++) {
      System.out.print(caracter);
    }
    System.out.println();
  }
}