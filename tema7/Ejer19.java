/*
*
* Ejercicio 19: Inserta valor en una posicion, desplazando los valores del array
*
*/

public class Ejer19 {
  public static void main(String[] args) {
    int[] arr = new int[12];
    int n, pos;

    for (int i=0; i<12; i++) {
      arr[i] = (int)(Math.random()*201);
    }

    System.out.print("Indice");
    for (int i=0; i<12; i++) {
      System.out.printf("%4d", i);      
    }
    System.out.println();

    System.out.print("Valor ");
    for (int i=0; i<12; i++) {
      System.out.printf("%4d", arr[i]);     
    }

    System.out.print("\nIntroduzca numero a insertar: ");
    n=Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca posicion a insertar: ");
    pos=Integer.parseInt(System.console().readLine());

    for (int i=10; i>=pos-1; i--) {
      arr[i+1]=arr[i];
    }
    arr[pos]=n;

    System.out.print("Indice");
    for (int i=0; i<12; i++) {
      System.out.printf("%4d", i);
    }
    System.out.println();
    System.out.print("Valor ");
    for (int i=0; i<12; i++) {
      System.out.printf("%4d", arr[i]);
    }
    
    System.out.println();
  }
}
