/*
*
* Ejercicio 28: Piedra, papel, tijera
*
*/

public class Ejer28 {
  public static void main(String[] args) {
    String valor1, valor2;

    System.out.print("Turno del jugador 1 (piedra, papel o tijera): ");
    valor1 = System.console().readLine();

    System.out.print("Turno del jugador 2 (piedra, papel o tijera): ");
    valor2 = System.console().readLine();

    if (valor1.equals("papel") && valor2.equals("piedra")) {
      System.out.println("Gana el jugador 1");
    }

    else if (valor1.equals("papel") && valor2.equals("tijera")) {
      System.out.println("Gana el jugador 2");
    }

    else if (valor1.equals("papel") && valor2.equals("papel")) {
      System.out.println("Empate");
    } 

    else if (valor1.equals("piedra") && valor2.equals("piedra")) {
      System.out.println("Empate");
    }

    else if (valor1.equals("piedra") && valor2.equals("tijera")) {
      System.out.println("Gana el jugador 1");
    }

    else if (valor1.equals("piedra") && valor2.equals("papel")) {
      System.out.println("Gana el jugador 2");
    } 

    else if (valor1.equals("tijera") && valor2.equals("piedra")) {
      System.out.println("Gana el jugador 2");
    }

    else if (valor1.equals("tijera") && valor2.equals("tijera")) {
      System.out.println("Empate");
    }

    else if (valor1.equals("tijera") && valor2.equals("papel")) {
      System.out.println("Gana el jugador 1");
    } 

    else {
      System.out.println("Datos erroneos");	
    } 
  }
}
