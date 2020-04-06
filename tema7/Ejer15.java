/*
*
* Ejercicio 15: Mesas de restaurante
*
*/

public class Ejer15 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    int n;
    boolean hayVacia;

    for (int i=0; i<10; i++) {
      arr[i]=(int)(Math.random()*5);
    }

    do {
      System.out.println("\n--------------------------------------------------------------");
      System.out.print("|Mesa nu: ");
      for (int i=1; i<11; i++) {
        System.out.print("|  "+i+" ");
      }
      System.out.println("|\n-------------------------------------------------------------");
      System.out.print("|Ocupacion");
      for (int i=0; i<10; i++) {
        System.out.print("|  "+arr[i]+" ");
      }
      System.out.println("|\n-------------------------------------------------------------");


      System.out.print("\nCuantos son? (Introduzca -1 para salir): ");
      n = Integer.parseInt(System.console().readLine());

      if (n>4) {
        System.out.println("Lo siento, los grupos son de maximo 4");
      } else if (n<0) {

      } else {

        hayVacia=false;
        for (int i=0; i<10; i++) {
          if (arr[i]==0 && hayVacia==false) {
            arr[i]=n;
            System.out.println("Su mesa es la numero " + (i+1));
            hayVacia=true;
          }
        }

        for (int i=0; i<10; i++) {
          if (arr[i]+n<=4 && hayVacia==false) {
            arr[i]+=n;
            System.out.println("Tendra que compartir mesa numero " + (i+1));
            hayVacia=true;
          }
        }

        if (hayVacia==false) {
          System.out.println("Lo siento, no hay sitio.");
        }

      }
      
    } while (n != -1);

    System.out.println("Gracias. Hasta pronto.");
  }
}