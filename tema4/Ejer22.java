/**
*
* Ejercicio 22: Calcular los minutos que faltan para el fin de semana (viernes 15:00)
*
*/

public class Ejer22 {
  public static void main(String[] args) {
    int tiempo=-1;    //negativo para indicar tiempo erroneo
    String dia;
    int hora, min;

    System.out.print("Introduzca un dia de la semana: ");
    dia = System.console().readLine();
    System.out.print("Introduzca hora: ");
    hora = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca minutos: ");
    min = Integer.parseInt(System.console().readLine());

    switch (dia) {
      case "lunes":
        tiempo = (4*1440)+900-(hora*60)-min;
        break;
      case "martes":
        tiempo = (3*1440)+900-(hora*60)-min;
        break;
      case "miercoles":
        tiempo = (2*1440)+900-(hora*60)-min;
        break;
      case "jueves":
        tiempo = (1*1440)+900-(hora*60)-min; 
        break;
      case "viernes":
        tiempo = (0*1440)+900-(hora*60)-min;
        break;
      default:
        System.out.println("Dia erroneo");
    }

    System.out.println("Para el fin de semana faltan: " + tiempo + " minutos");
  }
}
