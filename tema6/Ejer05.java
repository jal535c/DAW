/*
*
* Ejercicio 05: Numeros entre 100 y 199, con maximo, minimo y media
*
*/

public class Ejer05 {
  public static void main(String[] args) {
    int n;
    int suma=0;
    double media;
    int max=100;
    int min=199;

    for (int i=0; i<50; i++) {
      n = (int)(Math.random()*100)+100;
      System.out.print(n + " ");
      suma += n;

      if (n>max) {
        max=n;
      }

      if (n<min) {
        min=n;
      }
    }

    media = 1.0*suma/50;
    System.out.printf("\nMaximo: %d, Minimo: %d, Media: %.2f\n", max, min, media);
  }
}