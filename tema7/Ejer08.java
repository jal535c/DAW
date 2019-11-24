/*
*
* Ejercicio 8: Diagrama de temperaturas
*
*/

public class Ejer08 {
  public static void main(String[] args) {
    String[] mes = {
      "enero","febrero","marzo","abril","mayo","junio",
      "julio","agosto","septiembre","octubre","noviembre","diciembre"
    };
    
    //int[] arr= {15,17,19,23,25,30,34,37,30,27,20,14};
    int[] arr = new int[12];

    for (int i = 0; i<12; i++) {
      System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
      arr[i] = Integer.parseInt(System.console().readLine());
    }

    for (int fila=0; fila<12; fila++) {
      System.out.printf("%12s |", mes[fila]);
      for (int i=0; i<arr[fila]; i++) {
        System.out.print("*");        
      }

      System.out.println(" "+arr[fila]+"ºC");
    }
  }
}