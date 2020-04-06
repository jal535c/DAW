/*
*
* Ejercicio 14: Programa que intenta adividar el numero que estas pensando
*
*/

public class Ejer14 {
  public static void main(String[] args) {
    int num;
    String objetivo;
    int mayor=100;
    int menor=0;
    int offset=0;
    int intento=5;
    boolean acierto=false; 
    
    do {
      num = (int)(Math.random()*(mayor-menor)+offset);
      System.out.print(num + ", tu numero es mayor, menor o igual? ");
      objetivo = System.console().readLine();
  
      switch (objetivo) {
        case "mayor":
          menor = num+1;
          offset = num+1;
          break;
        case "menor":
          mayor = num-1;  
          break;
        case "igual":
          acierto=true;
          System.out.println("He acertado");
          break;
        default:
      }
              
      intento--;

    } while (!objetivo.equals("igual") && intento>0);

    if (!acierto) {
      System.out.println("He fallado");
    }
  }
}