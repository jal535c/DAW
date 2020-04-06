/*
*
* Ejercicio 58: Media de los digitos de un numero
*
*/

public class Ejer58 {
  public static void main(String[] args) {
    int n;
    int digito;
    int suma=0;
    int tam=0;
    float media;

    System.out.print("Introduzca numero: ");
    n = Integer.parseInt(System.console().readLine());

    while (n>0) {
      digito = n%10;
      suma += digito;
      n /= 10;
      tam++;
    }

    media = 1.0f*suma/tam;
    System.out.printf("Media de sus digitos: %.2f\n", media);
  }
}