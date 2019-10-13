/*
* 
* Ejercicio 6: Bucle desde 320 a 160 (de 20 en 20)
*  
*/

public class Ejer06 {
  public static void main(String[] args) {
    int n = 320;
    
    System.out.printf("%d ",n);
    do {
      n -= 20;
      System.out.printf("%d ",n);  
    } while (n>160);
    
    System.out.println();
  }
}
