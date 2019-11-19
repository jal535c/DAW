/*
*
* Ejercicio 26: Calcula las posiciones en que un digito aparece en un numero (de izquierda a derecha)
*
*/

public class Ejer26 {
  public static void main(String[] args) {
    int n;
    int dig;
    int resto;
    int reverso = 0;
    int tam = 0;
    int pos = 1;

    System.out.print("Introduzca un numero entero: ");
    n = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca un digito: ");
    dig = Integer.parseInt(System.console().readLine());

    
    System.out.println("El digito aparece en las posiciones:");
    
    while (n > 0) {     //invierte el numero (para hacer el calculo desde la derecha)
      resto = n%10;
      reverso = (reverso*10) + resto;
      n /= 10;
      tam++;        //el tamaño no es necesario
    }
       
    while (reverso > 0) {     //va recortanto el numero para comparar con dig
      if ((reverso % 10) == dig) {
        System.out.print(pos + " ");
      }
      reverso /= 10;
      pos++;
    } 

    System.out.println();
  }
}
