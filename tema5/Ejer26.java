/*
*
* Ejercicio 26: Calcula posiciones que un digito aparece en un numero
*
*/

public class Ejer26 {
  public static void main(String[] args) {
    int n;
    int dig;

    int reverso = 0;
    int tam = 0;
    int pos = 1;

    System.out.print("Introduzca un numero entero: ");
    n = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca un digito: ");
    dig = Integer.parseInt(System.console().readLine());

    
    System.out.println("El digito aparece en las posiciones:");
    
    while (n > 0) {     //invierte el numero y calcula su tamaño
      reverso = (reverso * 10) + (n % 10);
      n /= 10;
      tam++;
    }
       
    while (reverso > 0) {     //calcula posicion
      if ((reverso % 10) == dig) {
        System.out.print(pos + " ");
      }
      reverso /= 10;
      pos++;
    } 

    System.out.println();
  }
}