/*
*
*  Ejercicio 40: Filtra numeros que tengan el 7. Me dan la interfaz de la funcion
*
*/

public class Ejer40 {
  public static void main(String[] args) {
    int[] x = { 5,43,76,62,7,703 };
    int[] arr;

    arr = filtraCon7(x);
    for (int i : arr) {
      System.out.println(i);
    }
  }

  public static int[] filtraCon7(int[] x) {
    int[] arr = new int[x.length];
    int j=0;
    int[] arr2 = { -1 };    //valor por defecto si no hay 7

    for (int i=0; i<x.length; i++) {
      if (contiene7(x[i])) {
        arr[j]=x[i];    //lo mete en array
        j++;            //e incrementa indice (contendra la cantidad de numeros con 7 al final)
      }
    }

    if (j!=0) {    
      arr2 = new int[j];
      for (int i=0; i<arr2.length; i++) {
        arr2[i]=arr[i];
      }
    }

    return arr2;
  }

  public static boolean contiene7(int n) {  //dice si un numero tiene el 7 entre sus digitos
    boolean loContiene=false;
    int aux;

    while (n>0 && loContiene==false) {
      aux=n%10;          //cojo ultimo digito
      if (aux==7) {
        loContiene=true;
      }
      n=n/10;           //recorta
    }

    return loContiene;
  }
}