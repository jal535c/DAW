/*
*
* Ejercicio 21: Calcula media de numeros impares y mayor de pares introducidos
*
*/

import java.util.Scanner;

public class Ejer21 {
  public static void main(String[] args) {
    float n;        
    float suma=0f; 
    int i=0;
    int total=0;
    Scanner s = new Scanner(System.in);
    float media;
    float mayor=0;

    System.out.println("Introduzca numeros (negativo para detener): ");
    n = s.nextFloat();
    
    while (n>=0) {
      if (n%2!=0) {
        suma += n;
        i++;
      }
      else {
        if (n>mayor) {
          mayor = n;
        }
      }
      total++;
      n = s.nextFloat();
    }
    
    media = suma/i;
    System.out.printf("El total de numeros es: %d\n", total);
    System.out.printf("La media de los impares es: %.2f\n", media);
    System.out.printf("El mayor de los pares es: %.2f\n", mayor);
  }
}
