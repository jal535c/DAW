/*
*
* Ejercicio 11: Notas
*
*/

public class Ejer11 {
  public static void main(String[] args) {
    int nota; 
    int suspenso=0;
    int suficiente=0;
    int bien=0;
    int notable=0;
    int sobresaliente=0;

    for (int i=0; i<20; i++) {
      nota = (int)(Math.random()*5);

      switch (nota) {      
        case 0:
          System.out.print("Suspenso ");
          suspenso++;
          break;
        case 1:
          System.out.print("Suficiente ");
          suficiente++;
          break;
        case 2:
          System.out.print("Bien ");
          bien++;
          break;
        case 3:
          System.out.print("Notable ");
          notable++;
          break;
        case 4:
          System.out.print("Sobresaliente ");
          sobresaliente++;
          break;
        default:
      }

      System.out.println();
    }

    System.out.println("El numero de suspensos es: " + suspenso);
    System.out.println("El numero de suficientes es: " + suficiente);
    System.out.println("El numero de bienes es: " + bien);
    System.out.println("El numero de notables es: " + notable);
    System.out.println("El numero de sobresalientes es: " + sobresaliente);
  }
}