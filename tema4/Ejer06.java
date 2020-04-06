/*
*
* Ejercicio 6: Tiempo que tarda en caer un objeto
*
*/

public class Ejer06 {
  public static void main(String[] args) {
    int h;
    double tiempo;

    System.out.print("Introduzca altura (en metros): ");
    h = Integer.parseInt(System.console().readLine());
    
    tiempo = Math.sqrt(2*h/9.81f);

    System.out.printf("Tiempo que tarda en caer: %.2f segundos\n", tiempo);
  }
}
