/*
* 
* Ejercicio 14: Calculo de potencias
* 
*/

public class Ejer14 {
  public static void main(String[] args) {
    int base;
    int exp;
    int resul;

    System.out.print("Introduzca base: ");
    base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca exponente: ");
    exp = Integer.parseInt(System.console().readLine());
    
    resul = base;
    for (int i=1; i<exp; i++) {
      resul = resul*base;
    }
    
    System.out.printf("Potencia: %d\n", resul);
  }
}
