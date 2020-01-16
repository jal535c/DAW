/*
*
* Ejercicio 18: Funcion que convierte de decimal a binario
*
*/

public class Ejer18 {
  public static void main(String[] args) {
    int n;

    System.out.print("Introduzca numero decimal: ");
    n=Integer.parseInt(System.console().readLine());
 
    System.out.println("Binario: " + convierteDecToBin(n));
  }

  public static String convierteDecToBin(int n) {
    String salida="";
    int resto;

    while (n>0) {
      resto = n%2;    
      salida = resto + salida;
      n = n/2;      //va dividiendo entre 2 
    }

    return salida;
  }
}