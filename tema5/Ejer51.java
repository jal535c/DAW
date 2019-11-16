/*
*
* Ejercicio 51: Gusano numerico (se come el 0 y 8)
*
*/

public class Ejer51 {
  public static void main(String[] args) {
    int n;
    int digit;
    String salida="";
    int aux;
    int n2;

    System.out.print("Introduzca numero: ");
    n=Integer.parseInt(System.console().readLine());
    
    aux=n;
    while (aux>0) {
      digit = aux%10;
      if (digit!=0 && digit!=8) {
        salida = digit+salida;
      }
      aux/=10;
    }

    n2 = Integer.parseInt(salida);
    if (n==n2) {
      System.out.println("El gusano numerico no se ha comido ningun numero");
    } else {
      System.out.println("EL numero se queda en: "+salida);
    }
  }
}