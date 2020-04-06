/*
* 
* Ejercicio 5: Bucle while desde 320 a 160 (de 20 en 20)
*  
*/

public class Ejer05 {
  public static void main(String[] args) {
    int n = 320;
    
    while (n>=160) {
      System.out.printf("%d ",n);
      n -= 20;
    }
    
    System.out.println();
  }
}
