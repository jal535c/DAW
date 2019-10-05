/*
*
* Ejercicio 8: Media de 3 notas mejorado
*
*/

import java.util.Scanner;

public class Ejer08 {
  public static void main(String[] args) {
    float nota1, nota2, nota3;
    float media;
    String boletin="";
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca nota 1: ");
    nota1 = s.nextFloat();

    System.out.print("Introduzca nota 2: ");
    nota2 = s.nextFloat();

    System.out.print("Introduzca nota 3: ");
    nota3 = s.nextFloat();

    media = (nota1+nota2+nota3)/3;

    if (media<5) {
      boletin = "Insuficiente";
    } else if (media>=5 && media<6) {
      boletin = "Suficiente";
    } else if (media>=6 && media<7) {
      boletin = "Bien";
    } else if (media>=7 && media<9) {
      boletin = "Notable";
    } else if (media>=9) {
      boletin = "Sobresaliente";
    }

    System.out.printf("La media de las 3 notas es: %.2f -> %s\n", media, boletin);
  }
}
