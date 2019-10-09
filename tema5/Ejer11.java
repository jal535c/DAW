/*
* 
* Ejercicio 11: Calcular el cuadrado y cubo de 5 numeros consecutivos
* 
*/

public class Ejer11 {
  public static void main(String[] args) {
    int n;
    int cuad, cubo;

    System.out.print("Introduzca numero: ");
    n = Integer.parseInt(System.console().readLine());
    
    System.out.println("  Numero Cuadrado     Cubo");
    for (int i=n; i<n+5; i++) {
      cuad = i*i;
      cubo = i*i*i;
      System.out.printf("%8d %8d %8d\n", i, cuad, cubo);
    }
  }
}
