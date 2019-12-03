/*
*
* Ejercicio 12: Desplazar segun dos indices
*
*/

public class Ejer12 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    int aux;
    int inicial=3;
    int ultimo=7;

    for (int i=0; i<10; i++) {
      arr[i]=(int)(Math.random()*101);
      System.out.printf("%2d ", i);
    }  
    System.out.println();

    for (int i=0; i<10; i++) {
      System.out.printf("%2d ", arr[i]);
    }
    System.out.println();

    System.out.print("Introduzca valor inicial: ");
    inicial=Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca valor final: ");
    ultimo=Integer.parseInt(System.console().readLine());

    if (inicial>ultimo || inicial<0 || inicial>9 || ultimo<0 || ultimo>9) {
      System.out.println("Error");    
    } else {
      aux=arr[inicial];

      for (int i=inicial; i>0; i--) {
        arr[i]=arr[i-1];
      }
    
      arr[0]=arr[9];    //el primero

      for (int i=9; i>ultimo; i--) {
        arr[i]=arr[i-1];
      }
      arr[ultimo]=aux;

      for (int i=0; i<10; i++) {
        System.out.printf("%2d ", arr[i]);
      }
        
    }
    System.out.println();    

  }
}