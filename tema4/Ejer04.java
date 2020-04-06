/**
*
* Ejercicio 4: Calculo del salario semanal con horas extras
*
*/

import java.util.Scanner;

public class Ejer04 {
  public static void main(String[] args) {
    float salario;
    int horas;
    final float euroHora = 12.00f;
    final float euroHoraExtra = 16.00f;
    float extra = 0.00f;
    Scanner teclado = new Scanner(System.in);

    System.out.print("Horas trabajadas a la semana? ");
    horas = teclado.nextInt();

    if (horas>40) {
      extra = (horas-40)*euroHoraExtra;
      salario = 40*euroHora + extra;
    } else {
      salario = horas*euroHora;
    }

    System.out.printf("Sueldo semanal: %.2f euros\n", salario);
  }
}
