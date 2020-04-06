/*
*
* Ejercicio 17: Rota un numero hasta posicion 0
*
*/

public class Ejer17 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    boolean esValor;
    int n;
    int veces=0;
    int aux;

    for (int i=0; i<10; i++) {
      arr[i]=(int)(Math.random()*101);
      System.out.print(arr[i]+" ");
    }

    System.out.println();

    esValor=false;
    do {
      System.out.print("Elija un numero del array: ");
      n=Integer.parseInt(System.console().readLine());
      
      for (int i=0; i<10; i++) {
        if (n==arr[i]) {
          esValor=true;
          veces=i;      //me guardo el indice
        }
      }

      if (esValor==false) {
        System.out.print("Numero no contenido. ");
      }
    } while (esValor==false);
    
    for (int i=0; i<veces; i++) {   //otra opcion: while(arr[0] != n)
      aux=arr[0];                   //me guardo el primero
      for (int j=1; j<10; j++) {
        arr[j-1]=arr[j];            //copio cada uno en el anterior
      }
      arr[9]=aux;                   //pongo el primero en el ultimo
    }

    for (int cont : arr) {
      System.out.print(cont+" ");
    }
    System.out.println();
  }
}