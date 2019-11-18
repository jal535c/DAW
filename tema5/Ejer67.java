/*
*
* Ejercicio 67: Escalera descendente
*
*/

public class Ejer67 {
  public static void main(String[] args) {
    int escalones;
    int altura;
    int largo;

    System.out.print("Introduzca numero de escalones: ");
    escalones = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca altura de escalones: ");
    altura = Integer.parseInt(System.console().readLine());

    largo=1;
    
    for (int fila=0; fila<escalones; fila++) {
      for (int i=0; i<altura; i++) {
        for (int j=0; j<largo; j++) {
          System.out.print("****");
        }
        System.out.println();
      }
      largo++;
    }
    
  }
}