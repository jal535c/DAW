/*
*
* Ejercicio 27: Juego piedra papel tijera
*
*/

public class Ejer27 {
  public static void main(String[] args) {
    String jugador, cpu="";
    int opcion;

    System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
    jugador = System.console().readLine();

    if (!jugador.equals("piedra") && !jugador.equals("papel") && !jugador.equals("tijera")) {
      System.out.println("Error");
    } else {
      opcion = (int)(Math.random()*3);

      switch (opcion) {
        case 0:
          cpu = "piedra";
          break;
        case 1:
          cpu = "papel";
          break;
        case 2:
          cpu = "tijera";
          break;
        default:
      }

      System.out.println("Turno del ordenador: " + cpu);

      if (jugador.equals("piedra") && cpu.equals("tijera") ||
          jugador.equals("papel") && cpu.equals("piedra") ||
          jugador.equals("tijera") && cpu.equals("papel") ) {
        System.out.println("Gana el jugador");
      } else if (jugador.equals(cpu)) {
        System.out.println("Empate");
      } else {
        System.out.println("Gana el ordenador");
      }
    }
  }
}