/*
*
* Ejercicio 10: Posiciona los pares al principio del array
*
*/

public class Ejer10 {
  public static void main(String[] args) {
    int[] arr = new int[20];
    int indicePar=0; 
    int indiceImpar=0;
    int[] par = new int[20];
    int[] impar = new int[20];

    for (int i=0; i<20; i++) {        //rellena array con numeros aleatorios
      arr[i]=(int)(Math.random()*101);
      System.out.print(arr[i]+" ");
    }

    System.out.println();

    for (int i=0; i<20; i++) {     //mete los pares en un array auxiliar, y los impares en otro
      if (arr[i]%2==0) {
        par[indicePar] = arr[i];        
        indicePar++;
      } else {
        impar[indiceImpar] = arr[i];
        indiceImpar++;
      }
    }

    for (int i=0; i<indicePar; i++) {   //rellene el array original en orden adecuado
      arr[i] = par[i];
    }
    for (int i=0; i<indiceImpar; i++) {
      arr[indicePar+i] = impar[i];
    }

    System.out.println("Array con pares primero:");
    for (int i=0; i<20; i++) {      //muestra array
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}
