/*
* 
* Ejercicio 6: Bucle do-while desde 320 a 160 (de 20 en 20)
*  
*/

public class Ejer06 {
  public static void main(String[] args) {
    int n = 320;
    
    do {
      System.out.printf("%d ",n);
      n -= 20;
    } while (n>=160);
    
    System.out.println();
  }
}
