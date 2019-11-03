/*
*
* Ejercicio 19: Muestra 50 numeros entre -100 y 200, con maximo par, minimo impar y media
*
*/

public class Ejer19 {
  public static void main(String[] args) {
    int n;
    int max=-100;
    int min=200;
    int suma=0;

    for (int i=0; i<50; i++) {
      n = (int)(Math.random()*301)-100;
      System.out.println(n);

      if (n%2==0) {
        if (n>max) {
          max=n;
        }
      } else {
        if (n<min) {
          min=n;
        }
      }

      suma += n;
    }

    System.out.println("Maximo par: " +max);
    System.out.println("Minimo impar: " +min);
    System.out.println("Media: " + suma/50);
  }
}