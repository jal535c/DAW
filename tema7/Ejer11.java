/*
*
* Ejercicio 11: Meter numeros en un array, despues coloca los primos primero
*
*/

public class Ejer11 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    int[] aux = new int[10];
    int[] nor = new int[10];

    boolean esPrimo;
    int indice =0;
    int indice2 =0;

    for (int i=0; i<10; i++) {
      System.out.printf("arr[%d] = ", i);
      arr[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.print("Valor : ");
    for (int i=0; i<10; i++) {
      System.out.print(arr[i]+ " ");
    }

    System.out.println();

    for (int i=0; i<10; i++) {
      esPrimo=true;
      for (int j=2; j<arr[i]; j++) {
        if (arr[i]%j == 0)
          esPrimo=false;
      }
      if (esPrimo) {
        aux[indice]= arr[i];
        indice++;
      } else {
        nor[indice2]= arr[i];
        indice2++;
      }
    }

    for (int i=0; i<indice2; i++) {
      aux[indice]=nor[i];
      indice++;
    }

    System.out.print("Nuevo : ");
    for (int i=0; i<10; i++) {
      System.out.print(aux[i]+ " ");
    }
    
    System.out.println();
  }
}
