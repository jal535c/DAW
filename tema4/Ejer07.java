/*
*
* Ejercicio 7: Media de 3 notas
*
*/

import java.util.Scanner;

public class Ejer07 {
  public static void main(String[] args) {
    float nota1, nota2, nota3;
    float media;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca nota 1: ");
    nota1 = s.nextFloat();

    System.out.print("Introduzca nota 2: ");
    nota2 = s.nextFloat();

    System.out.print("Introduzca nota 3: ");
    nota3 = s.nextFloat();

    media = (nota1+nota2+nota3)/3;

    System.out.printf("La media de las 3 notas es: %.2f\n", media);
  }
}
