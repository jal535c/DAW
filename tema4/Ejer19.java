/*
*
* Ejercicio 19: Calcula digitos de un numero (max 5 cifras)
*
*/

public class Ejer19 {
  public static void main(String[] args) {
    int n, digitos=0;

    System.out.print("Introduzca numero entero (max 5 cifras): ");
    n = Integer.parseInt(System.console().readLine());

    if (n<10) {
      digitos = 1;
    }
    
    else if (n<100) {
      digitos = 2;
    }
    
    else if (n<1000) {
      digitos = 3;
    }
    
    else if (n<10000) {
      digitos = 4;
    }
    
    else if (n<100000) {
      digitos = 5;
    }
  
    System.out.println("La cifra tiene " + digitos + " digitos");
  }
}
