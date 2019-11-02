/*
*
* Ejercicio 12: Matrix
*
*/

public class Ejer12 {
  public static void main(String[] args) throws InterruptedException {
    char n;
    int linea=0;
    
    System.out.print("\033[32m");   //pinta en verde

    for (int i=0; i<2000; i++) {
      n = (char)((Math.random()*(126-32+1))+32);
      
      System.out.print(n);

      if (linea++ == 60) {
        linea = 0;
        Thread.sleep(50);
        System.out.println();
      }
    } 
    
    System.out.println(); 
  }
}
