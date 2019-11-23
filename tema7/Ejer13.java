/*
*
* Ejercicio 13: Destaca el maximo o minimo en un array de aleatorios
*
*/


public class Ejer13 {
  public static void main(String[] args) {
    int[] arr = new int[100];
    int max, min;
    int elegido;        //para guardar la opcion elegida
    int n;
    
    max=0;          //valores iniciales a ojo
    min=250;

    for (int i=0; i<100; i++) {
      arr[i]=(int)(Math.random()*501);    //genera numeros entre 0 y 500
      
      if (arr[i]>max) {       //guarda el maximo
        max=arr[i];
      }
      
      if (arr[i]<min) {       //guarda el minimo
        min=arr[i];
      }
    }
        
    for (int i=0; i<100; i++) {
      System.out.print(arr[i]+" ");
    }

    System.out.print("\n\nQue quiere destacar? (1-minimo, 2-maximo): ");
    n=Integer.parseInt(System.console().readLine());
    System.out.println();

    if (n==1) {       //asigna a una variable la opcion elegida
      elegido=min;
    } else {
      elegido=max;
    }

    for (int i=0; i<100; i++) {   //si el elemento coincide con el elegido, pinta con asteriscos
      if (arr[i]==elegido) {
        System.out.print("**"+arr[i]+"**"+" ");
      } else {
        System.out.print(arr[i]+" ");
      }
    }    
    
    System.out.println();
    
  }
}
