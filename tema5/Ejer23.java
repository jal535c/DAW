/*
*
* Ejercicio 23: Introducir numeros hasta superar 10000
*
*/

public class Ejer23 {
  public static void main(String[] args) {
    int suma=0;
    int n=0;
    int i=0;
    double media;

    System.out.println("Introduzca numeros:");

    while (suma<=10000) {
      n = Integer.parseInt(System.console().readLine());
      suma += n;
      i++;
    }

    suma -= n;      //quitar el ultimo introducido
    i--;
    media = (double)suma/i;
    System.out.printf("Total acumulado: %d\n", suma);
    System.out.printf("Contador numeros: %d\n", i);
    System.out.printf("Media: %.2f\n", media);
  }
}