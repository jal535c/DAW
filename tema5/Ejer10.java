/*
*
* Ejercicio 10: Calcula media de numeros (introducir numero negativo para detener)
*
*/

import java.util.Scanner;

public class Ejer10 {
  public static void main(String[] args) {
    float n;        
    float suma=0f; 
    int i=0;        //contador, cantidad de numeros introducidos
    Scanner s = new Scanner(System.in);
    float media;

    System.out.println("Introduzca numeros (negativo para detener): ");
    n = s.nextFloat();
    
    while (n>=0) {
      suma += n;
      i++;
      n = s.nextFloat();
    }

    media = suma/i;
    System.out.printf("La media es: %.2f\n", media);
  }
}
