/*
*
* Ejercicio 34: Pedir 2 numeros y ordenar digitos pares e impares desde la izquierda
*
*/

public class Ejer34 {
  public static void main(String[] args) {
    long n1;
    long n2;
    
    long aux;    //para calcular el tamaño
    int tam=0;
    
    int divisor;
    long par=0, impar=0;

    int a1;     //digito de cada numero
    int b1;

    System.out.println("Introduzca un numero:");
    n1 = Long.parseLong(System.console().readLine());
    System.out.println("Introduzca otro numero de mismo tamaño:");
    n2 = Long.parseLong(System.console().readLine());

    aux = n1;     //calculo del tamaño
    while (aux>0) {
      aux = aux/10;
      tam++;
    }

    divisor = (int)Math.pow(10, tam-1);

    for (int i=0; i<tam; i++) {
      a1 = (int)n1/divisor;    //comprueba con primer numero
      a1 = a1%10;

      if (a1%2==0) {      
        par = (par*10) + a1;
      } else {
        impar = (impar*10) + a1;
      }

      b1 = (int)n2/divisor;    //comprueba con segundo numero
      b1 = b1%10;

      if (b1%2==0) {
        par = (par*10) + b1;
      } else {
        impar = (impar*10) + b1;
      }

      divisor = divisor / 10;   //actualiza divisor
    }

    System.out.println("Pares: " + par);
    System.out.println("Impares: " + impar);
  }
}
