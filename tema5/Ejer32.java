/*
*
* Ejercicio 32: Calcula numeros pares y los suma
*
*/

public class Ejer32 {
  public static void main(String[] args) {
    long n;
    long reverso=0;
    int tam=0;
    int suma=0;
    int digito;

    System.out.print("Introduzca numero: ");
    n=Long.parseLong(System.console().readLine());

    while (n >0) {
      reverso = (n%10) + (reverso*10);
      n /= 10;
      tam++;
    }

    System.out.println("Los digitos pares son:");

    for (int i=0; i<tam; i++) {
      digito = (int)reverso%10;
      
      if (digito%2==0) {
        System.out.print(digito + " ");
        suma += digito;
      }

      reverso /= 10;
    }
    System.out.printf("\nLa suma de los pares es: %d\n", suma);
  }
}