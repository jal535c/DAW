/*
*
* Ejercicio 41: Calcula los pares e impares de un numero
*
*/

public class Ejer41 {
  public static void main(String[] args) {
    long n;
    long aux;
    int tam=0;
    int digito;
    int pares=0;
    int impares=0;

    System.out.print("Introduzca numero: ");
    n=Long.parseLong(System.console().readLine());

    aux = n;
    while (aux > 0) {
      aux /= 10;      
      tam++;            //calcula el tamaño
    }

    aux = n;
    for (int i=0; i<tam; i++) {
      digito = (int)aux%10;     //coge digito
      
      if (digito%2 == 0) {      //calcula si es par o impar
        pares++;
      } else {
        impares++;
      }

      aux /= 10;                //actualiza numero
    }

    System.out.printf("El numero %d tiene %d pares y %d impares\n", n, pares, impares);
  }
}