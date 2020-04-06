/*
*
* Ejercicio 18: Numeros comprendidos entre 2 numeros, de 7 en 7
*
*/

public class Ejer18 {
  public static void main(String[] args) {
    int n1, n2;
    int mayor, menor;

    System.out.print("Introduzca primer numero: ");
    n1 = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca segundo numero: ");
    n2 = Integer.parseInt(System.console().readLine());

    if (n1==n2) {
      System.out.println("Error, numeros iguales");
      System.exit(0);
    }

    if (n2>n1) {
      mayor = n2;
      menor = n1;
    } else {
      mayor = n1;
      menor = n2;
    }

    for (int i=menor; i<=mayor; i+=7) {
      System.out.printf("%d ", i);
    }
    
    System.out.println();
  }
}
