/*
*
* Ejercicio 16: Test de infidelidad
*
*/

public class Ejer16 {
  public static void main(String[] args) {
    int puntos=0;
    String s;

    System.out.print("Tu pareja esta mas inquieta de lo normal? (v/f): ");
    s = System.console().readLine();

    System.out.print("Gasta mas en vestuario? (v/f): ");
    s = System.console().readLine();
    if (s.equals("v")) {
      puntos += 3;
    }

    System.out.print("Ha perdido el interes en ti? (v/f): ");
    s = System.console().readLine();
    if (s.equals("v")) {
      puntos += 3;
    }

    System.out.print("Ahora se arregla con mas frecuencia? (v/f): ");
    s = System.console().readLine();
    if (s.equals("v")) {
      puntos += 3;
    }

    System.out.print("No te deja mirar su agenda? (v/f): ");
    s = System.console().readLine();
    if (s.equals("v")) {
      puntos += 3;
    }

    System.out.print("No contesta a llamadas delante de ti? (v/f): ");
    s = System.console().readLine();
    if (s.equals("v")) {
      puntos += 3;
    }

    System.out.print("Cuida su linea? (v/f): ");
    s = System.console().readLine();
    if (s.equals("v")) {
      puntos += 3;
    }

    System.out.print("Viene tarde despues del trabajo? (v/f): ");
    s = System.console().readLine();
    if (s.equals("v")) {
      puntos += 3;
    }

    System.out.print("Se perfuma mas? (v/f): ");
    s = System.console().readLine();
    if (s.equals("v")) {
      puntos += 3;
    }

    System.out.print("Ha estado en sitios sin ti? (v/f): ");
    s = System.console().readLine();
    if (s.equals("v")) {
      puntos += 3;
    }

    if (puntos<=10) {
      System.out.println("Tu pareja parece ser fiel");
    }

    if (puntos>10 && puntos<=22) {
      System.out.println("Existe peligro de infidelidad");
    }

    if (puntos>22) {
      System.out.println("Tu pareja parece ser infiel");
    }
  }
}
