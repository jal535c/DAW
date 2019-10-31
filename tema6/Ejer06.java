/*
*
* Ejercicio 6: Adivinar numero en 5 intentos
*
*/

public class Ejer06 {
  public static void main(String[] args) {
    int sol;
    int intento=5;
    int n;

    sol = (int)(Math.random()*101);

    //System.out.println(sol);    //para pruebas

    do {
      System.out.print("Introduzca numero: ");
      n = Integer.parseInt(System.console().readLine());

      if (n != sol) {
        if (n>sol) {
          System.out.println("La solucion es menor, oportunidades "+ (intento-1));
        } else {
          System.out.println("La solucion es mayor, oportunidades "+ (intento-1));
        }
        intento--;
      }
    } while (n!=sol && intento>0);

    if (n==sol) {
      System.out.printf("Acertaste\n");
    } else {
      System.out.printf("Fallaste, solucion: %d\n", sol);
    }
  }
}