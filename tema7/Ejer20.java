/*
*
* Ejercicio 20: Orden de los reyes
*
*/

public class Ejer20 {
  public static void main(String[] args) {
    int n;
    String[] nombres;
 
    System.out.print("Introduzca el numero total de nombres de reyes: ");
    n = Integer.parseInt(System.console().readLine());

    nombres = new String[n];
   
    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
    for (int i=0; i<n; i++) {
      nombres[i] = System.console().readLine();
    }

    System.out.println("\nLos reyes introducidos son: ");

    for (int i=0; i<n; i++) {
      int orden=1;

      for (int j=0; j<i; j++) {               //recorro desde primero hasta actual
        if (nombres[j].equals(nombres[i])) {  //cuando coincida, incremento variable
          orden++;
        }
      }

      System.out.printf("%s %dº\n", nombres[i], orden);
    }
  }
}