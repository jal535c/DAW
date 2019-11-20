/*
* 
* Ejercicio 14: Calcula la potencia
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
    
    //resul = base;   //i empieza en 1
    resul = 1;
    for (int i=0; i<exp; i++) {
      resul = resul*base;
    }
    
    System.out.printf("Potencia: %d\n", resul);
  }
}
