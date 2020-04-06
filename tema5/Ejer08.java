/*
* 
* Ejercicio 8: Tabla de multiplicar
* 
*/

public class Ejer08 {
  public static void main(String[] args) {
    int n;
    int pro;
    
    System.out.print("Introduzca un numero: ");
    n = Integer.parseInt(System.console().readLine());
    
    for (int i=1; i<=10; i++) {
      pro = n*i;
      System.out.printf("%d x %d = %d\n", n, i, pro);
    }
  }
}
