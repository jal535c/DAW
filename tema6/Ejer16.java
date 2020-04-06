/*
*
* Ejercicio 16: Maquina tragaperras
*
*/

public class Ejer16 {
  public static void main(String[] args) {
    int fig; 
    int f1=0,f2=0,f3=0;

    for (int i=0; i<3; i++) {
      fig = (int)(Math.random()*5);

      switch (fig) {      //escribe en consola segun valor aleatorio
        case 0:
          System.out.print("Corazon ");
          break;
        case 1:
          System.out.print("Diamante ");
          break;
        case 2:
          System.out.print("Herradura ");
          break;
        case 3:
          System.out.print("Campana ");
          break;
        case 4:
          System.out.print("Limon ");
          break;
        default:
      }

      switch (i) {      //asignacion del valor a la variable correspondiente
        case 0:
          f1=fig;
          break;
        case 1:
          f2=fig;
          break;
        case 2:
          f3=fig;
          break;
        default:
      }
    }

    System.out.println();

    if (f1!=f2 && f1!=f3 && f2!=f3) {       //analisis de los casos
        System.out.println("Lo siento, ha perdido");
      } else if (f1==f2 && f1==f3) {
        System.out.println("Enhorabuena, ha ganado 10 monedas");
      } else {
        System.out.println("Bien, ha recuperado su moneda");
      }
  }
}