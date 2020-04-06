/*
*
* Ejercicio 49: Pide numeros hasta primo, calcula maximo, minimo y media
*
*/

public class Ejer49 {
  public static void main(String[] args) {
    int n;
    int suma=0;
    int tam=0;
    int max=0;
    int min=0;
    boolean esPrimo;

    System.out.println("Introduzca numeros (primo para salir):");
    
    do {
      n = Integer.parseInt(System.console().readLine());

      if (tam==0) {
        min=n;
        max=n;
      }

      esPrimo=true;
      for (int i=2; i<n; i++) {
        if (n%i == 0)
          esPrimo=false;
      }

      if ((n>max) && (esPrimo==false))
        max=n;
      if ((n<min) && (esPrimo==false))
        min=n;

      suma+=n;
      tam++;

    } while (esPrimo==false);

    suma -= n;
    tam--;

    System.out.println("Numeros introducidos: " + tam);
    System.out.println("Maximo: " + max);
    System.out.println("Minimo: " + min);
    System.out.printf("Media: %.2f\n", (float)suma/tam);    
  }
}